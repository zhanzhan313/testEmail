<%-- 
    Document   : registerEmailValidae
    Created on : Apr 21, 2018, 1:33:23 PM
    Author     : ruoran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <h2>注册激活</h2>  
 <form action="user/register.htm?action=register" method="post">  
     Email:<input type="text" id="email" name="email" value="" >  
     <input type="submit" value="提交">  
 </form>  
    </body>
</html>
