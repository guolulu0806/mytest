package com.yzit.demo.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/doLogin")
	public String doLogin(String userName,String pwd){
		//4 从SecurityUtils里创建Subject
        Subject subject = SecurityUtils.getSubject();
        //5  创建token令牌，记录用户认证的身份和凭证即账号和密码
        UsernamePasswordToken token = new UsernamePasswordToken(userName,pwd);
        try{
            //6  执行认证提交
            subject.login(token);
        }catch(Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
        
       return  (String) subject.getPrincipal();
	}
}
