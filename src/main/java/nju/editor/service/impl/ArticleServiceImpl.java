package nju.editor.service.impl;

import nju.editor.dao.ArticleRepository;
import nju.editor.model.Article;
import nju.editor.service.ArticleService;
import nju.editor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzehao on 2017/2/23.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    UserService userService;

    @Override
    public Article saveArticle(Article article) {
        article.setVersion(Article.VERSION_EDITING);
        return articleRepository.save(article);
    }

    @Override
    public Article releaseArticle(Article article) {
        boolean hasBeenReleasedOnce=article.getPreviousReleaseVersion()!=null;
        if (hasBeenReleasedOnce){
            articleRepository.delete(article);
            article.setId(article.getPreviousReleaseVersion());
            article.setPreviousReleaseVersion(null);
        }
        saveArticle(article);
        article.setVersion(Article.VERSION_RELEASE);
        return articleRepository.save(article);
    }

    @Override
    public Article delete(Article article) {
        article.setVersion(Article.VERSION_DELETED);
        return articleRepository.save(article);
    }

    @Override
    public Article getArticleById(Long id) {
        return articleRepository.findOne(id);
    }

    @Override
    public List<Article> allRelease() {
        return articleRepository.getArticleByVersion(Article.VERSION_RELEASE);
    }

    @Override
    public List<Article> allEditing() {
        List<Article> allEditing = articleRepository.getArticleByVersion(Article.VERSION_EDITING);
        List<Article> allRelease=allRelease();
        allRelease.forEach(this::makeReleaseVersionEditable);
        ArrayList<Article> allEditingAndReleaseEditingVersion=new ArrayList<>(allEditing.size()+allRelease.size());
        allEditingAndReleaseEditingVersion.addAll(allEditing);
        allEditingAndReleaseEditingVersion.addAll(allRelease);
        return allEditingAndReleaseEditingVersion;
    }

    @Override
    public List<Article> getReleaseArticlesByType(String type) {
        return articleRepository.getArticleByTypeAndVersion(type,Article.VERSION_RELEASE);
    }

    private Article makeReleaseVersionEditable(Article releaseVersion){
        releaseVersion.setPreviousReleaseVersion(releaseVersion.getId());
        releaseVersion.setId(null);
        releaseVersion.setVersion(Article.VERSION_EDITING);
        return releaseVersion;
    }

}
