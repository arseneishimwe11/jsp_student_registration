<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 1/26/2024
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
        <title>Student Registration</title>
        <link rel="stylesheet" href="./resources/fonts/material-icon/css/material-design-iconic-font.min.css"/>
        <link rel="stylesheet" href="./resources/css/style.css"/>
    </head>
    <body>
        <div class="main">
        <!-- Sign up form -->
            <section class="signup">
                <div class="container">
                    <div class="signup-content">
                        <div class="signup-form">
                            <h2 class="form-title">Sign up</h2>
                            <form method="post" action="register.xqa" class="register-form" id="register-form" accept-charset="UTF-8">
                                <div class="form-group">
                                    <label for="code">
                                        <i class="zmdi zmdi-email"></i>
                                    </label>
                                    <input
                                            type="number"
                                            name="code"
                                            id="code"
                                            placeholder="Your Student Code" required/>
                                </div>
                                <div class="form-group">
                                    <label for="name">
                                        <i class="zmdi zmdi-account material-icons-name"></i>
                                    </label>
                                    <input
                                            type="text"
                                            name="name"
                                            id="name"
                                            placeholder="Your Name" required/>
                                </div>
                                <div class="form-group">
                                    <label for="email"><i class="zmdi zmdi-email"></i></label>
                                    <input
                                            type="email"
                                            name="email"
                                            id="email"
                                            placeholder="Your Email" required/>
                                </div>
                                <div class="form-group">
                                    <label for="date">
                                        <i class="zmdi zmdi-lock-outline"></i>
                                    </label>
                                    <input
                                            type="date"
                                            name="date"
                                            id="date"
                                            placeholder="Dob" required/>
                                </div>
                                <div class="form-group">
                                    <label for="grade">
                                        <i class="zmdi zmdi-lock-outline"></i>
                                    </label>
                                    <input
                                            type="number"
                                            name="grade"
                                            id="grade"
                                            placeholder="Grade" required/>
                                </div>
                                <div class="form-group">
                                    <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                                    <input
                                            type="password"
                                            name="pass"
                                            id="pass"
                                            placeholder="Password" required/>
                                </div>
                                <div class="form-group">
                                    <label for="re-pass">
                                        <i class="zmdi zmdi-lock-outline"></i>
                                    </label>
                                    <input
                                            type="password"
                                            name="re_pass"
                                            id="re_pass"
                                            placeholder="Repeat your password" required/>
                                </div>
                                <div class="form-group">
                                    <input
                                            type="checkbox"
                                            name="agree-term"
                                            id="agree-term"
                                            class="agree-term"/>
                                    <label for="agree-term" class="label-agree-term">
                                        <span><span></span></span>Remember me
                                    </label>
                                </div>
                                <div class="form-group form-button">
                                    <input
                                            type="submit"
                                            name="signup"
                                            id="signup"
                                            class="form-submit"
                                            value="Register"/>
                                </div>
                            </form>
                        </div>
                        <div class="signup-image">
                            <figure>
                                <img src="./resources/images/signup-image.jpg" alt="sing up image"/>
                            </figure>
<%--                            <a href="login.jsp" class="signup-image-link">I am already member</a>--%>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    <!-- <script src="vendor/jquery/jquery.min.js"></script> -->
    <script src="js/main.js"></script>
    </body>
</html>
