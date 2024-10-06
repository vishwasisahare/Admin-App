

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/VotingController"})
public class VotingController extends HttpServlet {

            String Message = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
           String action = request.getParameter("action");
            switch(action){
                case "age":
                    checkmax(request, response);
                    break;
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

    private void checkmax(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        int age = Integer.parseInt(request.getParameter("age"));
        String c = request.getParameter("country");
        
        if(age >=18){
            if(c.equals("i")){
                Message = "congress u are eligible";
            }else{
                Message = "sry u are not eligible,bcoz u are NRI";
            }
            
        }else{
            Message = "sry not eligible,bcoz u are below 18";
        }
        response.sendRedirect("vote.jsp?ans="+Message);
    }
        
    }
