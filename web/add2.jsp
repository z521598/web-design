<%--
  Created by IntelliJ IDEA.
  User: zhaodonghui
  Date: 2022/2/23
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello,加法</title>

    <script type="text/javascript" src = "js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript">
        function onSmt() {
            var a = document.getElementById("a").value;
            var b = document.getElementById("b").value;
            console.log(a);
            console.log(b);
            $.get("/do-add-ajax", {"a": a, "b": b}, function (data) {
                console.log(data);
                var json2 = eval("("+data+")");
                document.getElementById("res").value = json2.res;
            });
        }
    </script>
</head>

<body>

a:<input type="number" id="a"/><br/>
b:<input type="number" id="b"/><br/>
<input type="button" value="结算" id="smt" onclick="onSmt()"/>


结果：<input type="readonly" value="" id = "res"/>

</body>
</html>
