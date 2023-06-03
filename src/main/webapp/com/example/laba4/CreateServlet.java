package com.example.laba4;package com.example.untitled8;
import Entity.User;
import Model.Create;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Pages/create.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String data = request.getParameter("data");
        System.out.println(data);
        Gson gson = new Gson();
        User user = gson.fromJson(data, User.class);

        Create.add(user);
        response.getWriter().write("Кот добавлен");
    }
}
