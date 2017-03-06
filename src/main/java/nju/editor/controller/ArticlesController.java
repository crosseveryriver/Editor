package nju.editor.controller;

import nju.editor.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wangzehao on 2017/3/7.
 */
@Controller
@RequestMapping("/articles")
public class ArticlesController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/article")
    public String article(@RequestParam(value="id", required=false, defaultValue = "null") String id, Model model){
        model.addAttribute(articleService.getReleasedArticleById(Long.parseLong(id)));
        return "article";
    }

    @RequestMapping("/articles")
    public String articles(Model model){
        model.addAttribute(articleService.allEditing());
        return "articles";
    }
}
