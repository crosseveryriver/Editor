package nju.editor.service;

import nju.editor.model.Article;
import nju.editor.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangzehao on 2017/2/23.
 */
public interface ArticleService {
    Article saveArticle(Article article);
    Article releaseArticle(Article article);
    Article getReleasedArticleById(Long id);
    List<Article> allRelease();
    List<Article> allEditing();
}
