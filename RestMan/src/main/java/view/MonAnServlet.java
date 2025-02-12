package view;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MonAnDAO122;
import model.MonAn122;

/**
 * Servlet implementation class MonAnServlet
 */
@WebServlet("/view/khachhang/monan")
public class MonAnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonAnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String monanIdStr = request.getParameter("monanId");
			int Id = Integer.parseInt(monanIdStr);

	        // Sử dụng DAO để truy vấn cơ sở dữ liệu và lấy danh sách món ăn
	        MonAnDAO122 ds = new MonAnDAO122();
	        MonAn122 monanchitiet = MonAnDAO122.getMonAn(Id);
	        System.out.println(monanchitiet);
	        // Đặt danh sách kết quả tìm kiếm vào yêu cầu
	        request.setAttribute("monanchitiet", monanchitiet);

	        // Chuyển hướng đến trang TimKiemMonAn122.jsp để hiển thị kết quả
	        request.getRequestDispatcher("/view/khachhang/GDChiTietMonAn122.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
