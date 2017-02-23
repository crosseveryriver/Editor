package nju.editor.service.impl;

import nju.editor.dao.ArticleRepository;
import nju.editor.model.Article;
import nju.editor.model.User;
import nju.editor.service.ArticleService;
import nju.editor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wangzehao on 2017/2/23.
 */
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    UserService userService;

    @Override
    public void saveArticle(User user, Article article) {
        if(userService.checkPassword(user)){
            article.setWriter(user.getId());
            articleRepository.save(article);
        }
    }

    @Override
    public Article getAutoSavedArticle(User user) {
        if(userService.checkPassword(user)){
            return articleRepository.getArticleByWriterOrderByCreatedAtDesc(user.getId()).get(0);
        }
        return null;
    }
}
