
import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Atm extends HttpServlet {
	User_Account user=new User_Account();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String opt=request.getParameter("opti");
		if( opt.equals("option1")) {
			String a=request.getParameter("amount");
			Float amount=Float.parseFloat(a);
//			System.out.println("amount:"+amount);
			if(amount>=0) {
				if(amount<=user.balance && amount>0) {
					user.withdraw(amount);
					out.println("Withdrawn Successfully<br>");
					out.println(user);
//					System.out.println(user);
				}
				else {
					out.println("Insufficience balance");
				}
			}
			else {
				out.println("Enter valid amount");
			}
		}
		else if(opt.equals("option2")) {
			String a=request.getParameter("amount");
			Float amount=Float.parseFloat(a);
			if(amount>0) {
				user.deposit(amount);
				out.println("Deposited Successfully<br>");
				out.println(user);
//				System.out.println(user);
			}
			else {
				out.println("Enter valid amount");
			}
		}
		else if(opt.equals("option3")) {
				out.println(user);
//				System.out.println(user);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
