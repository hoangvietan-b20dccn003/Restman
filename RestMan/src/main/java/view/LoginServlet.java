package view;

import dao.UserDAO122;
//LoginServlet.java
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// /view/login/ chua login.jsp
@WebServlet(urlPatterns = { "/view/login/LoginServlet" })
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

//		UserDAO122 userDAO = new UserDAO122();
		String userRole = UserDAO122.getUserRole(username, password);

		if (userRole != null) {
			if (userRole.equals("quanly")) {
				HttpSession session = request.getSession(); // Lấy hoặc tạo phiên làm việc

				// Lưu thông tin người dùng vào phiên làm việc
				session.setAttribute("username", username); // Lưu tên người dùng
				session.setAttribute("role", userRole); // Lưu vai trò (admin, khách hàng, vv.)
				// Người dùng đăng nhập thành công và là "admin"
				response.sendRedirect("view/quanly/GDChinhQuanLy122.jsp");
			} else if (userRole.equals("khachhang")) {
				// Người dùng đăng nhập thành công và là "khách hàng"
				HttpSession session = request.getSession(); // Lấy hoặc tạo phiên làm việc
				session.setAttribute("username", username); // Lưu tên người dùng
				session.setAttribute("role", userRole);
				response.sendRedirect("view/khachhang/GDChinhKhachHang122.jsp");
			}
		} else {
			// Đăng nhập không thành công, chuyển hướng đến trang "error.jsp" hoặc nơi bạn
			// muốn
			response.sendRedirect("view/login/error.jsp");
		}
	}
}
