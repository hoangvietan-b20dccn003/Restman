package view;


import dao.MonAnDAO122;
import model.MonAn122;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( urlPatterns = {"/view/khachhang/search"})
public class SearchServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy tên món ăn từ yêu cầu tìm kiếm
        String key = request.getParameter("monan");

        // Sử dụng DAO để truy vấn cơ sở dữ liệu và lấy danh sách món ăn
        MonAnDAO122 ds = new MonAnDAO122();
        List<MonAn122> searchResults = MonAnDAO122.getDSMonAnbyTuKhoa(key);

        // Đặt danh sách kết quả tìm kiếm vào yêu cầu
        request.setAttribute("searchResults", searchResults);

        // Chuyển hướng đến trang TimKiemMonAn122.jsp để hiển thị kết quả
        request.getRequestDispatcher("/view/khachhang/GDTimKiemMonAn122.jsp").forward(request, response);
    }
}
