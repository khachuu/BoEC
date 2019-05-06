/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import builder.Member;
import dao_impl.MemberDaoImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RegisterServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;
    MemberDaoImpl daoImpl = new MemberDaoImpl();
//    String userName = " ";
//    String password =" ";
//    String firstName = " ";
//    String lastName = " ";
//    String phone = " ";
//    String address = " ";
//    String email = " ";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {
    String userName = request.getParameter("username");
    String password = request.getParameter("password");
    String firstName = request.getParameter("firstname");
    String lastName = request.getParameter("lastname");
    String phone = request.getParameter("phone");
    String address = request.getParameter("address");
    String email = request.getParameter("email");
   
  try
    {
        
        if(!phone.isEmpty() && !address.isEmpty() & !email.isEmpty()){
            
        System.out.println("ca 3 cai deu khac rong");
        // check Account username đã tồn tại chưa? 
        Member member = new Member.MemberBuilder(firstName, lastName, userName, password).phone(phone).address(address).email(email).build();
      
        boolean check = daoImpl.addMember(member);
            if(check) {
                System.out.println("Register successful!");
                request.setAttribute("sucMessage", "Register successful!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else {
                System.out.println("Đăng kí thất bại!");
                request.setAttribute("errMessage", "Đăng kí thất bại!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
            
        }else if(!phone.isEmpty() && !address.isEmpty()) {
            System.out.println("phone va address khac rong");
            Member member = new Member.MemberBuilder(firstName, lastName, userName, password).phone(phone).address(address).build();
            boolean check = daoImpl.addMember(member);
              if(check) {
                System.out.println("Register successful!");
                request.setAttribute("sucMessage", "Register successful!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else {
                System.out.println("Register fail!");
                request.setAttribute("errMessage", "Register fail!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        }
        
        else if(!email.isEmpty() && !address.isEmpty()) {
            
            System.out.println("email va address khac rong");
             Member member = new Member.MemberBuilder(firstName, lastName, userName, password).address(address).email(email).build();
              boolean check = daoImpl.addMember(member);
              if(check) {
                System.out.println("Register successful!");
                request.setAttribute("sucMessage", "Register successful!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else {
                System.out.println("Register fail!");
                request.setAttribute("errMessage", "Register fail!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        }
        
        else if(!email.isEmpty() && !phone.isEmpty()) {
            System.out.println("email va phone khac rong");
             Member member = new Member.MemberBuilder(firstName, lastName, userName, password).phone(phone).email(email).build();
              boolean check = daoImpl.addMember(member);
              if(check) {
                System.out.println("Register successful!");
                request.setAttribute("sucMessage", "Register successful!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else {
                System.out.println("Register fail!");
                request.setAttribute("errMessage", "Register fail!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        }
        
        else if(!email.isEmpty()) {
            System.out.println("email  khac rong");
             Member member = new Member.MemberBuilder(firstName, lastName, userName, password).email(email).build();
              boolean check = daoImpl.addMember(member);
            if(check) {
                System.out.println("Register successful!");
                request.setAttribute("sucMessage", "Register successful!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else {
                System.out.println("Register fail!");
                request.setAttribute("errMessage", "Register fail!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        }
        
        else if(!address.isEmpty()) {
            System.out.println("address  khac rong");
             Member member = new Member.MemberBuilder(firstName, lastName, userName, password).address(address).build();
              boolean check = daoImpl.addMember(member);
            if(check) {
                System.out.println("Dang ki thanh cong");
            }else {
                System.out.println("Đăng kí thất bại!");
                request.setAttribute("errMessage", "Đăng kí thất bại!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        }
        
        else if(!phone.isEmpty()) {
            System.out.println("phone  khac rong");
             Member member = new Member.MemberBuilder(firstName, lastName, userName, password).phone(phone).build();
              boolean check = daoImpl.addMember(member);
             if(check) {
                System.out.println("Register successful!");
                request.setAttribute("sucMessage", "Register successful!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else {
                System.out.println("Register fail!");
                request.setAttribute("errMessage", "Register fail!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        } else {
             System.out.println("3  cai deu  rong");
             Member member = new Member.MemberBuilder(firstName, lastName, userName, password).build();
              boolean check = daoImpl.addMember(member);
              if(check) {
                System.out.println("Register successful!");
                request.setAttribute("sucMessage", "Register successful!");
                request.getRequestDispatcher("index.jsp").forward(request, response);
              }else {
                System.out.println("Register fail!");
                request.setAttribute("errMessage", "Register fail!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        }
        
//      String userValidate = "Admin_Role";
//      if(!userName.equals(" "))
//      {
//     
//        HttpSession session = request.getSession(); //Creating a session
//        session.setAttribute("userName", userName); //setting session attribute userName
////        session.setAttribute("role", userValidate); //setting session attribute role
//        request.setAttribute("userName", userName);
//          
//        request.getRequestDispatcher("index.jsp").forward(request, response);
//      }

    }
    catch (Exception e2)
    {
      e2.printStackTrace();
    }
     
  
  
  }
}
