<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- google api -->
<script src="https://apis.google.com/js/platform.js" async defer></script>
<meta name="google-signin-client_id" content="347213457559-9581admdp2ss541c7944n1nl7e8t9ef7.apps.googleusercontent.com">
<script>

	function signOut(){
		var auth2 = gapi.auth2.getAuthInstance();
		auth2.signOut().then(function(){
			console.log('user signed out');
		});
		auth2.disconnect();
	}

</script>
</head>
<body>
google api login
	<input type="hidden" class="g-signin2" data-onsuccess="onSignIn">
	<a href="#" onclick="signOut();">Sign Out</a>
	<button onclick="getProfile()">getget</button>
</body>
</html>