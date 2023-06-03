package com.example.untitled8;
import Entity.User;
import Model.Delete;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Pages/delete.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String data = request.getParameter("data");
        System.out.println(data);
        Gson gson = new Gson();
        User user = gson.fromJson(data, User.class);

        Delete.delete(user);
        response.getWriter().write("Кот удалён (???????)");
    }
}
