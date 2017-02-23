package nju.editor.service.impl;

import nju.editor.dao.ArticleRepository;
import nju.editor.model.Article;
import nju.editor.model.User;
import nju.editor.service.ArticleService;
import nju.editor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public Article getAutoSavedArticle(String user) {
        return articleRepository.getArticleByWriterOrderByCreatedAtDesc(user).get(0);
    }
}
