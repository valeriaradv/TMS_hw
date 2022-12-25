package com.tms;

import com.tms.service.Cars;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.util.List;


@WebServlet("/cars")
public class MyServlet extends HttpServlet {
    private Cars carTest = new Cars();

    @Override
    public void init(ServletConfig config) {
        System.out.println("---------DO INIT---------");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.addCookie(new Cookie("lastsession", String.valueOf(LocalTime.now())));
        String id = req.getParameter("id");
        ServletOutputStream outputStream = resp.getOutputStream();
        List<CarConstr> car = carTest.allCars();
        outputStream.println(car.toString());
//        Enumeration<String> parameterNames = req.getParameterNames();
//        while (parameterNames.hasMoreElements()){
//        outputStream.println(parameterNames.nextElement());
        if (id == null || id.isEmpty()) {
            outputStream.println("no such element");
        } else{
            CarConstr carConstr = carTest.getCarWithId(id);
            outputStream.println(carConstr.toString());
        }

        req.getRequestDispatcher("/empty.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        String id = req.getParameter("id");
        String brand = req.getParameter("brand");
        String year = req.getParameter("year");
        String country = req.getParameter("country");
        CarConstr newCar = new CarConstr(id, brand, year, country);
        newCar = carTest.save(newCar);
        outputStream.println("new car was added\n" + newCar.toString());
        outputStream.close();
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        String id = req.getParameter("id");
        carTest.delete(id);
        outputStream.println("car " + id + " was deleted");
        outputStream.close();
    }
}
