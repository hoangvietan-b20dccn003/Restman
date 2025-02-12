<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Trang Chính Quản Lý</title>
    <style>
        body {
            text-align: center;
            font-family: Arial, sans-serif;
        }

        .header {
            background-color: #3498db;
            color: #fff;
            padding: 10px;
            position: relative; /* Để có thể sử dụng position absolute */
        }

        .header h1 {
            margin: 0;
        }

        .logout-button {
            display: inline-block;
            padding: 5px 10px;
            background-color: #c0392b;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            position: absolute; /* Cố định ở góc phải */
            top: 10px;
            right: 10px;
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
    </style>
</head>
<body>
    <div class="header">
        <h1>Trang Chính Quản Lý</h1>
        <a href="${pageContext.request.contextPath}/logout" class="logout-button">Logout</a>
    </div>
    <div class="container">
        <h2>Xin chào quản lý</h2>
        <a href="#" class="button">Thống kê</a>
        <a href="#" class="button">Thống kê khách hàng theo doanh thu</a>
        <a href="#" class="button">Quản lý món ăn</a>
    </div>
</body>
</html>
