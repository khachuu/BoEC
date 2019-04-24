package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.LoginDao;
import entities.Account;
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  public LoginServlet() {
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    String userName = request.getParameter("username");
    String password = request.getParameter("password");
//    LoginBean loginBean = new LoginBean();
//    loginBean.setUserName(userName);
//    loginBean.setPassword(password);

    Account account = new Account();
    account.setUsername(userName);
    account.setPassword(password);
    LoginDao loginDao = new LoginDao();

    try
    {
      String userValidate = loginDao.authenticateUser(account);
//      String userValidate = "Admin_Role";
      if(userValidate.equals("Admin_Role"))
      {
        System.out.println("Admin's Home");
        HttpSession session = request.getSession(); //Creating a session
        session.setAttribute("userName", userName); //setting session attribute userName
        session.setAttribute("role", userValidate); //setting session attribute role
        request.setAttribute("userName", userName);
        request.getRequestDispatcher("jsp/admin/pages/index.jsp").forward(request, response);
      }

      else if(userValidate.equals("User_Role"))
      {
        System.out.println("User's Home");
        HttpSession session = request.getSession();
//        session.setMaxInactiveInterval(10*60);
        session.setAttribute("userName", userName); //setting session attribute userName
        session.setAttribute("role", userValidate); //setting session attribute role
        request.setAttribute("userName", userName);
        request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
      }
      else
      {
        System.out.println("Error message = "+userValidate);
        request.setAttribute("errMessage", userValidate);
        request.getRequestDispatcher("index.jsp").forward(request, response);
      }
    }
    catch (IOException e1)
    {
      e1.printStackTrace();
    }
    catch (Exception e2)
    {
      e2.printStackTrace();
    }
  } //End of doPost()
}
