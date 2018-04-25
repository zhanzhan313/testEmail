<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <h2>注册激活</h2>  
 <form action="${contextPath}/testEmail/user/register.htm?action=register" method="post">  
     Email:<input type="text" id="email" name="email" value="" >  
     <input type="submit" value="提交">  
 </form>  
    </body>
</html>
