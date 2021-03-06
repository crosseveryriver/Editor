package nju.editor.controller;

import nju.editor.model.Article;
import nju.editor.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangzehao on 2017/3/3.
 */
@RestController
@RequestMapping("/articles")
public class ArticlesRestController {


    @Autowired
    private ArticleService articleService;

    /*
    这个方法用于取得所有正在编辑的版本的文章
     */
    @RequestMapping("/allEditing")
    public List<Article> allEditing(){
        return articleService.allEditing();
    }

    /*
    比如说一个页面有一堆文章，那么就可以认为这些文章是一个类型，那么就可以用这个方法获得这些文章
     */
    @RequestMapping("/releaseVersionByType")
    public List<Article> getReleaseVersionByType(String type){
        return articleService.getReleaseArticlesByType(type);
    }
    /*
    这个方法用于取得某个已经发布的文章，用于展示
    url例如"/articles/id12345"这就会返回一个文章的 *内容*
     */
    @RequestMapping("/id{id}")
    public String getArticleContentById(@PathVariable Long id){
        return articleService.getArticleById(id).getHtml();
    }

    /*
    这个方法用于保存文章
     */
    @RequestMapping("/save")
    public Article saveArticle(Article article){
        return articleService.saveArticle(article);
    }

    /*
    这个方法用于把一个文章发布
     */
    @RequestMapping("/release")
    public Article releaseArticle(Article article){
        return articleService.releaseArticle(article);
    }

    /*
    这个方法用于把一个编辑状态或者发布状态的文章删除
     */
    @RequestMapping("/delete")
    public Article deleteArticle(Article article) {
        return articleService.delete(article);
    }
}
