<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.MonAn122" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chi Tiết Món Ăn</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        .header {
            background-color: #3498db;
            color: #fff;
            padding: 20px;
            text-align: center;
        }

        .header h1 {
            margin: 0;
        }

        .content-container {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
            padding: 20px;
            text-align: center;
            width: 80%;
            margin: 20px auto;
        }
        .button {
            display: block;
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            background-color: #3498db;
            color: #fff;
            text-align: center;
            text-decoration: none;
            border-radius: 5px;
        }

        .monan-image {
            max-width: 60%;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>Chi Tiết Món Ăn</h1>
    </div>
    <div class="content-container">
        <h2 style = "color: #3498db;">Thông Tin Chi Tiết Món Ăn</h2>
        <%
            // Lấy thông tin món ăn từ thuộc tính request (đã được đặt trong servlet)
            MonAn122 monan = (MonAn122) request.getAttribute("monanchitiet");

            if (monan != null) {
        %>
        <img src="<%= monan.getAnh() %>" alt="Ảnh món ăn" class="monan-image">
        <h3><%= monan.getTen() %></h3>
        <h4><%= monan.getMota() %></h4>
        <p>Giá: <%= monan.getDongia() %></p>
        <a href="${pageContext.request.contextPath}/view/khachhang/GDTinhNangDangPT122.jsp" class="button">Đặt Món</a>
        <%
            } else {
        %>
        <p>Không tìm thấy thông tin món ăn.</p>
        <%
            }
        %>
    </div>
</body>
</html>
