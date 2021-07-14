import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class CalculateServlet extends HttpServlet {
	//private static final long serialVersionUID = 7223778025721767631L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
	//	response.setCharacterEncoding("GBK");
		PrintWriter out = response.getWriter();
		// Get the first number
		double firstNum = Double.valueOf(request.getParameter("firstNum"));
		// Get the first number
		double secondNum = Double.valueOf(request.getParameter("secondNum"));
		// Get operator
		String operator = request.getParameter("operator");
		// Calculation results
		double result = 0;
		// judgment operator
		switch(operator){
			  // performs addition between numbers
			  case "1":
			  result =firstNum + secondNum;
			  out.println(result);
			  break;
	  
			// performs subtraction between numbers
			case "2":
			  result = firstNum - secondNum;
			 out.println(result);
			  break;
	  
			// performs multiplication between numbers
			case "3":
			  result = firstNum * secondNum;
			  out.println( result);
			  break;
	  
			// performs division between numbers
			case "4":
			  result = firstNum / secondNum;
			  out.println( result);
			  break;
	  
			default:
			  out.println("Invalid operator!");
			  break;
		}
		// if("+".equals(operator)){
		// 	result = firstNum + secondNum;
		// }else if("-".equals(operator)){
		// 	result = firstNum - secondNum;
		// }else if("*".equals(operator)){
		// 	result = firstNum * secondNum;
		// }else if("/".equals(operator)){
		// 	result = firstNum / secondNum;
		// }
		// output calculation results
		//out.print(firstNum + " " + operator +  " " + secondNum + " = " + result);
		
		out.flush();
		out.close();
	}

}