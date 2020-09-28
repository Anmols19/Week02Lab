<%-- 
    Document   : ArithmeticCalculatorServlet
    Created on : Sep 27, 2020, 8:49:55 PM
    Author     : 783856
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab02P2</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
             <table>
            <tr>
                <td><h3>First</h3></td> 
               <td><input type="text" value="${one}" name="one"</td>
            </tr>
            <tr>
                 <td><h3>Second</h3></td> 
               <td><input type="text" value="${two}" name="two"</td>
            </tr>
            
            <tr>
                <td> <input type="submit" value="+" name="plus"></td>
                <td> <input type="submit" value="-" name="minus"></td>
                <td> <input type="submit" value="*" name="mul"></td>
                <td> <input type="submit" value="%" name="mod"></td>
            </tr>
            
            <tr>
                <td><h2>Result ---</h2></td>
                 <td><h2>${ans}</h2></td>
            </tr>
             </table>
        </form>
            
              <a href="./Age">Age Calculator</a>
    </body>
</html>
