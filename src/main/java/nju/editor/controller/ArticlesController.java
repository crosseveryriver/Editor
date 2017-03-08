package nju.editor.controller;

import nju.editor.model.Article;
import nju.editor.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by wangzehao on 2017/3/7.
 */
@Controller
public class ArticlesController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/article")
    public String article(@RequestParam(value="id", required=false, defaultValue = "null") String id, Model model){
        Article article=articleService.getReleasedArticleById(Long.parseLong(id));
        model.addAttribute(article);
        return "article";
    }

    @RequestMapping("/articles")
    public String articles(Model model){
        List<Article> articleList=articleService.allEditing();
        model.addAttribute(articleList);
        return "articles";
    }
}
