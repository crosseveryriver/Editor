package nju.editor.service.impl;

import nju.editor.dao.ArticleRepository;
import nju.editor.model.Article;
import nju.editor.service.ArticleService;
import nju.editor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return articleRepository.save(article);
    }

    @Override
    public Article releaseArticle(Article article) {
        saveArticle(article);
        article.setVersion(Article.VERSION_RELEASE);
        return articleRepository.save(article);
    }

    @Override
    public Article getReleasedArticleById(Long id) {
        return articleRepository.findOne(id);
    }

    @Override
    public List<Article> allRelease() {
        return articleRepository.getArticleByVersion(Article.VERSION_RELEASE);
    }

    @Override
    public List<Article> allEditing() {
        return articleRepository.getArticleByVersion(Article.VERSION_EDITING);
    }

    @Override
    public List<Article> getReleaseArticlesByType(String type) {
        return articleRepository.getArticleByTypeAndVersion(type,Article.VERSION_RELEASE);
    }


}
