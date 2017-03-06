package nju.editor.controller;

import nju.editor.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wangzehao on 2017/3/3.
 */
@Controller
public class MyController {

    @RequestMapping("/articles")
    public String test(Model model){

        Article article = new Article();
        article.setId(1L);
        article.setTitle("文章一");
        article.setCreatedAt(new Date());

        Article article1 = new Article();
        article1.setId(2L);
        article1.setTitle("文章2");
        article1.setCreatedAt(new Date());
        model.addAttribute(article);

        Article article2 = new Article();
        article2.setId(3L);
        article2.setTitle("文章3");
        article2.setCreatedAt(new Date());

        List<Article> articleList = new ArrayList<>();
        articleList.add(article);
        articleList.add(article1);
        articleList.add(article2);

        model.addAttribute(articleList);
        return "articles";
    }

    @RequestMapping("/article")
    public String test1(@RequestParam(value="id", required=false, defaultValue = "null") String id, Model model){
        Article article = new Article();
        article.setId(1L);
        article.setTitle("文章");
        article.setCreatedAt(new Date());

        model.addAttribute(article);
        return "article";
    }

}
