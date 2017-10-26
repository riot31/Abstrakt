<%--
  Created by IntelliJ IDEA.
  User: jbUser
  Date: 10/26/2017
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 1. Include the LinkedIn JavaScript API and define a onLoad callback function -->
<script type="text/javascript" src="https://platform.linkedin.com/in.js">
    api_key: '771efm4ji87uw6'
    onLoad: onLinkedInLoad
    authorize: true
</script>

<script type="text/javascript">
    // 2. Runs when the JavaScript framework is loaded
    function onLinkedInLoad() {
        IN.Event.on(IN, "auth", onLinkedInAuth);
    }


    // 2. Runs when the viewer has authenticated
    function onLinkedInAuth() {

        IN.API.Profile("me").fields("id","first-name", "last-name", "email-address").result(displayProfiles);
    }

    // 2. Runs when the Profile() API call returns successfully
    function displayProfiles(profiles) {
        member = profiles.values[0];
        document.getElementById("profiles").innerHTML =
            "<p>"+member.id+"<br> " +  member.firstName + "<br> " + member.lastName + "<br>"+member.emailAddress+"</p>";
    }
</script>

</head>
<body>

<!-- 3. Displays a button to let the viewer authenticate -->
<script type="in/Login"></script>

<!-- 4. Placeholder for the greeting -->
<div id="profiles"></div>


<div id="search">

</div>

</body>
</html>
