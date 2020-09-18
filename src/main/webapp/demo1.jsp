<%@page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        $(function(){
            $("#bt1").click(
                function(){
                    $.ajax({
                        url:"/demo24",
                        data:'{"username":"成警警","password":"123"}',
                        contentType:"application/json;charset=utf-8",
                        dataType:"json",
                        type:"post",
                        success:function(data){
                            alert(data.username);
                            alert(data.password)
                        }
                    });
                }
            );
        });



    </script>
</head>
<body>
<h2>Hello World!</h2>

<button id="bt1" name="ss" value="ss">buton</button>


</body>
</html>
