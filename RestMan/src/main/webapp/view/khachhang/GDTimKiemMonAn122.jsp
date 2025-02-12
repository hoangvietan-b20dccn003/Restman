<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tìm Kiếm Món Ăn</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
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

        .search-container {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
            padding: 20px;
            text-align: center;
            width: 100%;
            max-width: 800px; /* Điều chỉnh độ rộng tối đa của search-container */
        }

        .search-container h2 {
            color: #3498db;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button {
            background-color: #3498db;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: #2980b9;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        table, th, td {
            border: 1px solid #ccc;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #3498db;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:nth-child(odd) {
            background-color: #fff;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>Nhà hàng Abc</h1>
    </div>
    <div class="search-container">
        <h2>Tìm Kiếm Món Ăn</h2>
        <form action="search" method="post">
            <input type="text" id="monan" name="monan" placeholder="Nhập tên món ăn muốn tìm kiếm" required>
            <button type="submit">Tìm Kiếm</button>
        </form>
        <table>
            <thead>
                <tr>
                    <th style="text-align: center;">ID</th>
                    <th style="text-align: center;">Tên Món Ăn</th>
                    <th style="text-align: center;">Giá</th>
                    <th> </th>
                </tr>
            </thead>
            <tbody>
                <!-- Dữ liệu danh sách món ăn sẽ được hiển thị ở đây -->
                <c:forEach var="monan" items="${searchResults}">
                    <tr>
                        <td style="text-align: center;">${monan.id}</td>
                        <td>${monan.ten}</td>
                        <td style="text-align: right;">${monan.dongia}</td>
                         <td style = "text-align: center;"><a href="monan?monanId=${monan.id}" style = " color: #3498db;">Xem Chi Tiết</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
