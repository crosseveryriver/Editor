package nju.editor.controller;

import nju.editor.model.Article;
import nju.editor.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangzehao on 2017/3/9.
 */
@Controller
public class ExampleController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping("/test2")
    public String article(Model model){
        List<Article> articleList=articleService.allEditing();
        model.addAttribute(articleList);
        return "example.template";
    }
}
