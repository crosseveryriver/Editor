package nju.editor.controller;

import nju.editor.model.Article;
import nju.editor.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by wangzehao on 2017/3/11.
 */
@Controller
public class WebsiteController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/index")
    public String index(Model model) {
        List<Article> xueshudongtaiList = articleService.getReleaseArticlesByType("学术动态");
        if (xueshudongtaiList.size() > 10) {
            xueshudongtaiList = xueshudongtaiList.subList(0, 10);
        }
        List<Article> gonggaoxinxiList = articleService.getReleaseArticlesByType("公告信息");
        if (gonggaoxinxiList.size() > 5) {
            gonggaoxinxiList = gonggaoxinxiList.subList(0, 5);
        }
        model.addAttribute(xueshudongtaiList);
        model.addAttribute(gonggaoxinxiList);
        return "index";
    }

    @RequestMapping("/peiyangfangan")
    public String peiyangfangan(Model model) {
        Article article = articleService.getReleaseArticlesByType("培养方案").get(0);
        model.addAttribute(article);
        return "peiyangfangan";
    }

    @RequestMapping("/kechengjieshao")
    public String kechengjieshao(Model model) {
        Article article = articleService.getReleaseArticlesByType("课程介绍").get(0);
        model.addAttribute(article);
        return "kechengjieshao";
    }

    @RequestMapping("/B")
    public String kechengjieshaoB(Model model) {
        Article article = articleService.getReleaseArticlesByType("B类课程介绍").get(0);
        model.addAttribute(article);
        return "kechengjieshao";
    }

    @RequestMapping("/C")
    public String kechengjieshaoC(Model model) {
        Article article = articleService.getReleaseArticlesByType("C类课程介绍").get(0);
        model.addAttribute(article);
        return "kechengjieshao";
    }

    @RequestMapping("/D")
    public String kechengjieshaoD(Model model) {
        Article article = articleService.getReleaseArticlesByType("D类课程介绍").get(0);
        model.addAttribute(article);
        return "kechengjieshao";
    }

    @RequestMapping("/jiangzhuxuejin")
    public String jiangzhuxuejin(Model model) {
        Article article = articleService.getReleaseArticlesByType("奖助学金").get(0);
        model.addAttribute(article);
        return "jiangzhuxuejin";
    }

    @RequestMapping("/yanjiusheng")
    public String yanjiusheng(Model model) {
        Article article = articleService.getReleaseArticlesByType("研究生招生").get(0);
        model.addAttribute(article);
        return "yanjiusheng";
    }

    @RequestMapping("/shixijidi")
    public String shixijidi(Model model) {
        Article article = articleService.getReleaseArticlesByType("实习基地").get(0);
        model.addAttribute(article);
        return "shixijidi";
    }

    @RequestMapping("/shixiguiding")
    public String shixiguiding(Model model) {
        Article article = articleService.getReleaseArticlesByType("实习规定").get(0);
        model.addAttribute(article);
        return "shixiguiding";
    }


    @RequestMapping("/jiuyeqingkuang")
    public String jiuyeqingkuang(Model model) {
        List<Article> jiuyeqingkuangList = articleService.getReleaseArticlesByType("就业情况");
        model.addAttribute(jiuyeqingkuangList);
        return "jiuyeqingkuang";
    }

    @RequestMapping("/jiuyeqingkuang/id{id}")
    public String jiuyeqingkuangById(@PathVariable Long id, Model model) {
        Article article = articleService.getArticleById(id);
        model.addAttribute(article);
        return "jiuyeqingkuang.id";
    }

    @RequestMapping("/xueshudongtai")
    public String xueshudongtai(Model model) {
        List<Article> xueshudongtaiList = articleService.getReleaseArticlesByType("学术动态");
        model.addAttribute(xueshudongtaiList);
        return "xueshudongtai";
    }

    @RequestMapping("/xueshudongtai/id{id}")
    public String xueshudongtaiById(@PathVariable Long id, Model model){
        Article article = articleService.getArticleById(id);
        model.addAttribute(article);
        return "xueshudongtai.id";
    }

    @RequestMapping("/gonggaoxinxi")
    public String gonggaoxinxi(Model model) {
        List<Article> gonggaoxinxiList = articleService.getReleaseArticlesByType("公告信息");
        model.addAttribute(gonggaoxinxiList);
        return "gonggaoxinxi";
    }

    @RequestMapping("/gonggaoxinxi/id{id}")
    public String gonggaoxinxiById(@PathVariable Long id, Model model){
        Article article = articleService.getArticleById(id);
        model.addAttribute(article);
        return "gonggaoxinxi.id";
    }

    @RequestMapping("/xiaoyuanwenhua")
    public String xiaoyuanwenhua(Model model) {
        Article article = articleService.getReleaseArticlesByType("校园文化").get(0);
        model.addAttribute(article);
        return "xiaoyuanwenhua";
    }

    @RequestMapping("/xiaoyoufengcai")
    public String xiaoyoufengcai(Model model) {
        Article article = articleService.getReleaseArticlesByType("校友风采").get(0);
        model.addAttribute(article);
        return "xiaoyoufengcai";
    }

    @RequestMapping("/boshisheng")
    public String page4(Model model) {
        return "boshisheng";
    }
    /* 下面这3个页面是不需要的，被/gonggaoxinxi/id{id}，/xueshudongtai/id{id}取代，暂时不删掉，下一个版本再删*/
    @RequestMapping("/2015qingkuang")
    public String page1(Model model) {
        return "2015qingkuang";
    }

    @RequestMapping("/2016qingkuang")
    public String page2(Model model) {
        return "2015qingkuang";
    }

    @RequestMapping("/gonggaoxiangqing")
    public String page7(Model model) {
        return "gonggaoxiangqing";
    }
}
