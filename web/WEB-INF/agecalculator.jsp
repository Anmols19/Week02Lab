<%-- 
    Document   : agecalculator
    Created on : Sep 27, 2020, 6:08:58 PM
    Author     : 783856
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab02P1</title>
    </head>
    <body>
         <h1>Age Calculator</h1>
        <form method="post" action="Age">
             <table>
            <tr>
                <td><h3>Enter your Age:</h3></td> 
               <td><input type="text" name="age"</td>
            </tr>
            <tr>
                <td> <input type="submit" value="Age next birthday"></td>
            </tr>
             </table>
        </form>
        
          <h3 name="mes">  ${show} </h3>
          
          <a href="./arithmetic">Arithmetic Calculator</a>
          
    </body>
</html>
