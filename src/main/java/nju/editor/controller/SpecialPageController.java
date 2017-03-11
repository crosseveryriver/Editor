package nju.editor.controller;

import nju.editor.model.Article;
import nju.editor.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangzehao on 2017/3/11.
 */
@RestController
public class SpecialPageController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/special/gonggaoxinxilist")
    public String getSingleArticleByType(Model model){
        String type="公告信息";
        List<Article> articleList=articleService.getReleaseArticlesByType(type);
        Article article=articleList.get(0);
        return "singleArticle.template";
    }
}
