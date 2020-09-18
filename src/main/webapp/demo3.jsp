<%@page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<html>


<%--演示输入一个内容

--%>

<head>
<%--     错误引用演示1
<script src="js/jquery-3.2.1.min.js">alert("hello js !!")</script>--%>
<%--     错误引用演示2
<script src="js/jquery-3.2.1.min.js"/>--%>
<%--    正确引用演示  --%>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        document.write("我是被写的内容");
    </script>
</head>
<body>
<h2> </h2>


</body>
</html>
