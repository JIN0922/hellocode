<%--
  Created by IntelliJ IDEA.
  User: jinzhao
  Date: 2018/10/26
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="../js/jquery.js"></script>
    <script type="text/javascript" src="../js/json2.js"></script>
    <script type="text/javascript">
        $(function () {
            var xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><book><num>1</num><name>疯狂Java讲义</name><author>李刚</author></book>";


            $.ajax("${pageContext.request.contextPath}/json/send",
                {
                    type:"post",
                    contentType:"application/xml",
                    data:xmlData,
                    async:true

                });


        });

    </script>
</head>
<body>

</body>
</html>
