package nju.editor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangzehao on 2017/3/11.
 */
@Controller
public class WebsiteController {
    @RequestMapping("/2015qingkuang.html")
    public String page1(Model model){
        return "2015qingkuang";
    }
    @RequestMapping("/2016qingkuang.html")
    public String page2(Model model){
        return "2015qingkuang";
    }
    @RequestMapping("/B.html")
    public String page3(Model model){
        return "B";
    }
    @RequestMapping("/boshisheng.html")
    public String page4(Model model){
        return "boshisheng";
    }
    @RequestMapping("/C.html")
    public String page5(Model model){
        return "C";
    }
    @RequestMapping("/D.html")
    public String page6(Model model){
        return "D";
    }
    @RequestMapping("/gonggaoxiangqing.html")
    public String page7(Model model){
        return "gonggaoxiangqing";
    }
    @RequestMapping("/gonggaoxinxi.html")
    public String page8(Model model){
        return "gonggaoxinxi";
    }
    @RequestMapping("/index.html")
    public String page11(Model model){
        return "index";
    }
    @RequestMapping("/jiangzhuxuejin.html")
    public String page12(Model model){
        return "jiangzhuxuejin";
    }
    @RequestMapping("/jiuyeqingkuang.html")
    public String page13(Model model){
        return "jiuyeqingkuang";
    }
    @RequestMapping("/kechengjieshao.html")
    public String page14(Model model){
        return "kechengjieshao";
    }
    @RequestMapping("/peiyangfangan.html")
    public String page15(Model model){
        return "peiyangfangan";
    }
    @RequestMapping("/shixiguiding.html")
    public String page16(Model model){
        return "shixiguiding";
    }
    @RequestMapping("/shixijidi.html")
    public String page17(Model model){
        return "shixijidi";
    }
    @RequestMapping("/xiaoyoufengcai.html")
    public String page18(Model model){
        return "xiaoyoufengcai";
    }
    @RequestMapping("/xiaoyuanwenhua.html")
    public String page26(Model model){
        return "xiaoyuanwenhua";
    }
    @RequestMapping("/xueshudongtai.html")
    public String page27(Model model){
        return "xueshudongtai";
    }
    @RequestMapping("/yanjiusheng.html")
    public String page28(Model model){
        return "yanjiusheng";
    }
}
