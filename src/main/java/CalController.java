

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/CalController"})
public class CalController extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        
        if(action.equals("add")){
            int a = Integer.parseInt(request.getParameter("n1"));
            int b = Integer.parseInt(request.getParameter("n2"));
            int c = a + b;
            response.sendRedirect("add.jsp?ans="+c);
        }else if(action.equals("sub")){
             int a = Integer.parseInt(request.getParameter("n1"));
            int b = Integer.parseInt(request.getParameter("n2"));
            int c = a - b;
            response.sendRedirect("add.jsp?ans="+c);
        }else if(action.equals("mul")){
             int a = Integer.parseInt(request.getParameter("n1"));
            int b = Integer.parseInt(request.getParameter("n2"));
            int c = a * b;
            response.sendRedirect("add.jsp?ans="+c);
        }else if(action.equals("div")){
             int a = Integer.parseInt(request.getParameter("n1"));
            int b = Integer.parseInt(request.getParameter("n2"));
            int c = a / b;
            response.sendRedirect("add.jsp?ans="+c);
        }else if(action.equals("mod")){
             int a = Integer.parseInt(request.getParameter("n1"));
            int b = Integer.parseInt(request.getParameter("n2"));
            int c = a % b;
            response.sendRedirect("add.jsp?ans="+c);
        }
        
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
