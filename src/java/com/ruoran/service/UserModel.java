/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruoran.service;

/**
 *
 * @author ruoran
 */
import java.beans.Transient;  
import java.util.Calendar;  
import java.util.Date;  
public class UserModel {
    private Long id;  
    private String name;  
    private String password;  
    private String email;//注册账号  
    private int status=0;//激活状态  
    private String validateCode;//激活码  
    private Date  registerTime;//注册时间  
      
         
    /////////////////  
  
    public Long getId() {  
        return id;  
    }  
      
    public void setId(Long id) {  
        this.id = id;  
    }  
      
    public String getName() {  
        return name;  
    }  
      
    public void setName(String name) {  
        this.name = name;  
    }  
      
    public String getPassword() {  
        return password;  
    }  
      
    public void setPassword(String password) {  
        this.password = password;  
    }  
      
    public String getEmail() {  
        return email;  
    }  
      
    public void setEmail(String email) {  
        this.email = email;  
    }  
      
    public int getStatus() {  
        return status;  
    }  
      
    public void setStatus(int status) {  
        this.status = status;  
    }  
      
    public String getValidateCode() {  
        return validateCode;  
    }  
      
    public void setValidateCode(String validateCode) {  
        this.validateCode = validateCode;  
    }  
      
    public Date getRegisterTime() {  
        return registerTime;  
    }  
      
    public void setRegisterTime(Date registerTime) {  
        this.registerTime = registerTime;  
    }  
  
    /////////////////////////  
    @Transient  
    public Date getLastActivateTime() {  
        Calendar cl = Calendar.getInstance();  
        cl.setTime(registerTime);  
        cl.add(Calendar.DATE , 2);  
          
        return cl.getTime();  
    }  
}
