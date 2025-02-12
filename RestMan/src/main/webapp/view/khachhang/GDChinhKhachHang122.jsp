<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Trang Chính Khách Hàng</title>
    <style>
        body {
            text-align: center;
            font-family: Arial, sans-serif;
            margin: 0px;
        }

        .header {
            background-color: #3498db;
            color: #fff;
            padding: 20px;
            text-align: center;
            width: 100%;
        }

        .header h1 {
            margin: 0;
        }

        

        .container {
            margin: 0 auto;
            width: 300px;
            padding: 20px;
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
         button:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>Nhà hàng Abc</h1>
    </div>
    <div class="container">
        <h2 style = "color: #3498db;">Trang chính khách hàng</h2>
        <a href="${pageContext.request.contextPath}/view/khachhang/GDTimKiemMonAn122.jsp" class="button">Tìm kiếm món</a>
        <a href="${pageContext.request.contextPath}/view/khachhang/GDTinhNangDangPT122.jsp" class="button">Đặt món ăn</a>
    </div>
</body>
</html>
