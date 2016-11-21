package selvert;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validar
 */
@WebServlet("/Validar")
public class Validar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String matricula = request.getParameter("matricula");
		String pago  = request.getParameter("pago");
		String enviar  = request.getParameter("enviar");
		String num_tarjeta = request.getParameter("num_tarjeta");
		
		 if(num_tarjeta !=null){
			 request.setAttribute("dato1", usuario);
			 request.setAttribute("dato2", pago);
			 request.setAttribute("dato3", "Tarjeta");
		 }
		 else{
			 request.setAttribute("dato1", usuario);
			 request.setAttribute("dato2", pago);
			 request.setAttribute("dato3", "Efectivo");
			 
		 }
		
		
	
		
		
		// TODO Auto-generated method stub
		request.getRequestDispatcher("html/combustible.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
