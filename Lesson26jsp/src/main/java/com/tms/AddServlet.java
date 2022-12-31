package com.tms;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addcar")
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/add.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String id = req.getParameter("addnewcarid");
        String brand = req.getParameter("addnewcarbrand");
        String year = req.getParameter("addnewcaryear");
        String country = req.getParameter("addnewcarcountry");
        CarsService carsService = new CarsService();
        CarConstr carConstr = new CarConstr(id,brand,year,country);
        carsService.save(carConstr);

        req.getRequestDispatcher("/get.jsp").forward(req,resp);

    }
}
