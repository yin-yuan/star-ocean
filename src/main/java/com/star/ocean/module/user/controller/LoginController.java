package com.star.ocean.module.user.controller;

import com.star.ocean.common.utils.RandomValidateCodeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName LoginController
 * @Description 登录的控制器
 * @Author 万超超
 * @Date 2021/8/4 16:08
 * @Version 1.0
 **/
@Controller
public class LoginController {

    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache") ;
            response.setDateHeader("Expire", 0);
            RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
            logger.error("获取验证码失败>>>>   ", e);
        }
    }

}
