package com.feng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by HP on 2019-10-23.
 */
@Controller
public class DemoController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "施工队 hello world！";
    }

    public static void main(String[] args) {

        System.out.println("测试git");
        System.out.println("测试提交远程仓库");
    }
}
