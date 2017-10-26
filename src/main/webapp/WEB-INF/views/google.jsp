<%--
  Created by IntelliJ IDEA.
  User: jbUser
  Date: 10/26/2017
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Abstrakt Google</title>
</head>
<body>





<div id="search">
    <script>
        (function() {
            var cx = '006262590844055352035:1zddarjpkzi';
            var gcse = document.createElement('script');
            gcse.type = 'text/javascript';
            gcse.async = true;
            gcse.src = 'https://cse.google.com/cse.js?cx=' + cx;
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(gcse, s);
        })();
    </script>
    <gcse:search></gcse:search>
</div>


</body>
</html>
