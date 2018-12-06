<%--
  Created by IntelliJ IDEA.
  User: jinzhao
  Date: 2018/10/25
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>


    <script type="text/javascript" src="../js/jquery.js"></script>
    <script type="text/javascript" src="../js/json2.js"></script>

    <script type="text/javascript">
        $(function () {
            var book={};
            book.num = "zhansan";
            book.name = "1234ffff56";


            $.ajax("${pageContext.request.contextPath}/json/test",
                {
                    dataType:"json",
                    type:"post",
                    contentType:"application/json;charset=utf-8",
                    data:JSON.stringify(book),
                    traditional:true,
                    async:true,
                    success:function(data){
                        $("#id").html(data.num);
                        $("#name").html(data.name);
                        $("#author").html(data.author);
                    },
                    error:function () {
                        alert("error");
                    }

                });


        });

    </script>

</head>
<body>
<span id="id"></span>   <br>
<span id="name"></span> <br>
<span id="author"></span>  <br>
</body>
</html>
