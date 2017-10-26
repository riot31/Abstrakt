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
<script>
    function invite() {
        var url = '/people/~/mailbox',
            body = {
                recipients: {
                    values: [{
                        person: {
                            _path: '/people/email=a_user@domain.com',
                            'first-name':'Andrew',
                            'last-name':'User'
                        }
                    }]
                },
                subject: 'Invitation to connect.',
                body: 'Say yes!',
                'item-content':{
                    'invitation-request':{
                        'connect-type':'friend'
                    }
                }
            };
        IN.API.Raw()
            .url(url)
            .method("POST")
            .body(JSON.stringify(body))
            .result(function (result) {
                console.log(result);
            })
            .error(function (error) {
                console.log(error);
            });
    }
</script>
<script type="text/javascript" src="http://platform.linkedin.com/in.js">
    api_key: 771efm4ji87uw61
    onLoad: invite
    authorize: true
</script>

<div id="search">

</div>

</body>
</html>
