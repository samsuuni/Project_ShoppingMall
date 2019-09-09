<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Colorlib</title>
	<style type="text/css">
	html,body {height:100%; margin:0; padding:0;}
	</style>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/signUp.css">
</head>
<body id="contents">

    <div class="main">
        <div class="container">
            <div class="signup-content">
                <div class="signup-img">
                    <img src="images/signup-img.jpg" alt="">
                </div>
                <div class="signup-form">
                    <form method="POST" class="register-form" id="register-form">
                        <h2>student registration form</h2>
                        <div class="form-low">
	                        <div class="form-group">
	                            <label for="email">E-mail ID :</label>
	                            <input type="email" name="user_loginId" id="loginId" required/>
	                        </div>
                        	<div class="form-submit">
                        		<input type="submit" value="Duplicate check" class="submit" name="Duplicate" id="Duplicate" />
                        	</div>
                        </div>
                        <div class="form-group">
                            <label for="name">Name :</label>
                            <input type="text" name="user_name" id="name" required/>
                        </div>
                        <div class="form-radio">
                            <label for="gender" class="radio-label">Gender :</label>
                            <div class="form-radio-item">
                                <input type="radio" name="gender" id="male" checked>
                                <label for="male">Male</label>
                                <span class="check"></span>
                            </div>
                            <div class="form-radio-item">
                                <input type="radio" name="gender" id="female">
                                <label for="female">Female</label>
                                <span class="check"></span>
                            </div>
                        </div>
                        <div class="form-low">
	                        <div class="form-group">
	                            <label for="password">Password :</label>
	                            <input type="password" name="user_password" id="password">
	                        </div>
	                        <div class="form-group">
	                            <label for="pw-verification">Password verification :</label>
	                            <input type="password" name="pw-verification" id="pw-verification">
	                        </div>
	                    </div>
                        <div class="form-group">
                            <label for="address">Address :</label>
                            <input type="text" name="address" id="address" required/>
                        </div>
                        <div class="form-group">
                            <label for="birth_date">Date Of Birth :</label>
                            <input type="date" name="birth_date" id="birth_date">
                        </div>
                        <div class="form-group">
                            <label for="job">Job :</label>
                            <div class="form-select">
                                <select name="job" id="job">
                                    <option value=""></option>
                                    <option value="computer">Computer Operator &nbsp; Pragramming Assistant</option>
                                    <option value="desiger">Designer</option>
                                    <option value="marketing">Marketing</option>
                                </select>
                                <span class="select-icon"><i class="zmdi zmdi-chevron-down"></i></span>
                            </div>
                        </div>
                        <div class="form-submit">
                            <input type="submit" value="Reset All" class="submit" name="reset" id="reset" />
                            <input type="submit" value="Submit Form" class="submit" name="submit" id="submit" />
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/signUpJquery.min.js"></script>
    <script src="js/signUp.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>