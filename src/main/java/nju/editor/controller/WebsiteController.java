package nju.editor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangzehao on 2017/3/11.
 */
@Controller
public class WebsiteController {
    @RequestMapping("/2015qingkuang")
    public String page1(Model model){
        return "2015qingkuang";
    }
    @RequestMapping("/2016qingkuang")
    public String page2(Model model){
        return "2015qingkuang";
    }
    @RequestMapping("/B")
    public String page3(Model model){
        return "B";
    }
    @RequestMapping("/boshisheng")
    public String page4(Model model){
        return "boshisheng";
    }
    @RequestMapping("/C")
    public String page5(Model model){
        return "C";
    }
    @RequestMapping("/D")
    public String page6(Model model){
        return "D";
    }
    @RequestMapping("/gonggaoxiangqing")
    public String page7(Model model){
        return "gonggaoxiangqing";
    }
    @RequestMapping("/gonggaoxinxi")
    public String page8(Model model){
        return "gonggaoxinxi";
    }
    @RequestMapping("/index")
    public String page11(Model model){
        return "index";
    }
    @RequestMapping("/jiangzhuxuejin")
    public String page12(Model model){
        return "jiangzhuxuejin";
    }
    @RequestMapping("/jiuyeqingkuang")
    public String page13(Model model){
        return "jiuyeqingkuang";
    }
    @RequestMapping("/kechengjieshao")
    public String page14(Model model){
        return "kechengjieshao";
    }
    @RequestMapping("/peiyangfangan")
    public String page15(Model model){
        return "peiyangfangan";
    }
    @RequestMapping("/shixiguiding")
    public String page16(Model model){
        return "shixiguiding";
    }
    @RequestMapping("/shixijidi")
    public String page17(Model model){
        return "shixijidi";
    }
    @RequestMapping("/xiaoyoufengcai")
    public String page18(Model model){
        return "xiaoyoufengcai";
    }
    @RequestMapping("/xiaoyuanwenhua")
    public String page26(Model model){
        return "xiaoyuanwenhua";
    }
    @RequestMapping("/xueshudongtai")
    public String page27(Model model){
        return "xueshudongtai";
    }
    @RequestMapping("/yanjiusheng")
    public String page28(Model model){
        return "yanjiusheng";
    }
}
