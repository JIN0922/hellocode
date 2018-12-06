<%--
  Created by IntelliJ IDEA.
  User: jinzhao
  Date: 2018/10/26
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="../js/jquery.js"></script>
    <script type="text/javascript" src="../js/json2.js"></script>

    <script type="text/javascript">
        $(function () {

            $.ajax("${pageContext.request.contextPath}/json/read",
                {
                    type:"post",
                    async:true,
                    success:function(xml){
                        var num = $("num",xml).text();
                        alert(num);
                        var name = $("name",xml).text();
                        var author = $("author",xml).text();
                        var a =$("#booktable");
                        $("<td/>").html(num).appendTo(a);
                        $("<td/>").html(name).appendTo(a);
                        $("<td/>").html(author).appendTo(a);
                    },
                    error:function () {
                        alert("error");
                    }

                });


        });

    </script>
</head>
<body>
<table  id="booktable"  border="1"  style="border-collapse: collapse">
    <tr align="center">
        <th>编码</th>
        <th>名称</th>
        <th>做着</th>
    </tr>
</table>
</body>
</html>
