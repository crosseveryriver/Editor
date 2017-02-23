package nju.editor.service;

import nju.editor.model.Article;
import nju.editor.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by wangzehao on 2017/2/23.
 */
public interface ArticleService {
    void saveArticle(Article article);
    Article getAutoSavedArticle(String user);
}
