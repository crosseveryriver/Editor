package nju.editor.controller;

import nju.editor.model.Article;
import nju.editor.model.User;
import nju.editor.service.ArticleService;
import nju.editor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangzehao on 2017/2/23.
 */

@RestController
@RequestMapping("/editor")
public class EditorController {
    @Autowired
    private UserService userService;
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/save")
    public void save(Article article){
        articleService.saveArticle(article);
    }

    @RequestMapping("/getAutoSavedArticle")
    public Article getAutoSavedArticle(String writer){
        return articleService.getAutoSavedArticle(writer);
    }
}
