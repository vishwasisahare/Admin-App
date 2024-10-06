

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/MathController"})
public class MathController extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String opt = request.getParameter("operator");
            int num1 = Integer.parseInt(request.getParameter("n1"));
             int num2 = Integer.parseInt(request.getParameter("n2"));
             int result = 0;
             String message = null;
             switch(opt){
                 case "+":
                     result = num1 + num2;
                     message = "Addition of "+num1 +" and "+num2+ " is "+result;
                  break;
                  case "-":
                     result = num1 - num2;
                      message = "Substraction of "+num1 +" and "+num2+ " is "+result;
                  break;
                  case "*":
                     result = num1 * num2;
                      message = "Multiplication of "+num1 +" and "+num2+ " is "+result;
                  break;
                  case "/":
                     result = num1 / num2;
                      message = "Division of "+num1 +" and "+num2+ " is "+result;
                  break;
                  case "%":
                     result = num1 % num2;
                      message = "Modulus of "+num1 +" and "+num2+ " is "+result;
                  break;
        }
             response.sendRedirect("cal.jsp?msg="+message);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
