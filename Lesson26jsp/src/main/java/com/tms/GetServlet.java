package com.tms;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/getcar")
public class GetServlet extends HttpServlet {


    @Override
    public void init(ServletConfig config) {
        System.out.println("---------DO INIT---------");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        CarsService carTest = new CarsService();
        List<CarConstr> carList = carTest.allCars();
        req.setAttribute("car",carList);
        String id = req.getParameter("id");
        req.setAttribute("id",id);

        CarConstr carConstr = carTest.getCarWithId(id);
        req.setAttribute("getid",carConstr);

        req.getRequestDispatcher("/get.jsp").forward(req,resp);

    }



}
