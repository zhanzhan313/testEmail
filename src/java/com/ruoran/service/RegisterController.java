/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruoran.service;
import java.text.ParseException;  
  
import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView; 
/**
 *
 * @author ruoran
 */
@Controller
public class RegisterController {
     @Resource  
    private RegisterValidateService service;  
      
    @RequestMapping(value="/user/register",method={RequestMethod.GET,RequestMethod.POST})  
    public String  load(HttpServletRequest request,HttpServletResponse response) throws ParseException{  
        String action = request.getParameter("action");  
        System.out.println("-----r----"+action);  
        ModelAndView mav=new ModelAndView();  
  
        if("register".equals(action)) {  
            //注册  
            String email = request.getParameter("email");  
            service.processregister(email);//发邮箱激活  
            mav.addObject("text","注册成功");  
            return  "register_success";  
        }   
        else if("activate".equals(action)) {  
            //激活  
            String email = request.getParameter("email");//获取email  
            String validateCode = request.getParameter("validateCode");//激活码  
              
            try {  
                service.processActivate(email , validateCode);//调用激活方法  
                return "activate_success";  
            } catch (Exception e) {  
                request.setAttribute("message" , e.getMessage());  
               return "register/activate_failure";  
            }  
              
        }  
        return "";  
    }  
}
