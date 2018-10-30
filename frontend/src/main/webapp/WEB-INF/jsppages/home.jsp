<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
  <%@include file="header.jsp" %>
  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
           <!-- Indicators -->
           <ol class="carousel-indicators">
               <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
               <li data-target="#myCarousel" data-slide-to="1"></li>
               <li data-target="#myCarousel" data-slide-to="2"></li>
               <li data-target="#myCarousel" data-slide-to="3"></li>
           </ol>
           <div class="carousel-inner" role="listbox">
               <div class="item active">
                   <img  src="<c:url value='/resources/images/rNy1Z4d.jpg'></c:url>" alt="first slide" height="100%" width="100%">
                   <div class="container">
                       <div class="carousel-caption">
                           <h1>WELCOME TO THE CAR STORE</h1>
                           <p>Here You Can Browse And Buy Cars.Order Now For Your Amazing New Arrivals</p>
                       </div>
                   </div>
               </div>
               <div class="item">
                   <img class="img img-circle" src="<c:url value='/resources/images/car.jpg'></c:url>" alt="Second slide" height="100%" width="100%">
                   <div class="container">
                       <div class="carousel-caption">
                           <h1>The Car Store.</h1>
                           <p>online shopping can make your life more easier</p>
                       </div>
                   </div>
               </div>
               <div class="item">
                   <img class="img-bordered" src="<c:url value='/resources/images/images 1.jpg'></c:url>" alt="Third slide" height="100%" width="100%">
                   <div class="container">
                       <div class="carousel-caption">
                           <h1>The Car You Love</h1>
                           <p>live Freely,Work Happily And Drive Safely!!</p>
                       </div>
                   </div>
               </div>
                <div class="item">
                   <img class="img-thumbnail" src="<c:url value='/resources/images/images 2.jpg'></c:url>" alt="forth slide" height="100%" width="100%">
                   <div class="container">
                       <div class="carousel-caption">
                           <h1>Any car can be a "cool" car</h1>
                           <p>your life,your car...you own it!!</p>
                       </div>
                   </div>
               </div>
           </div>