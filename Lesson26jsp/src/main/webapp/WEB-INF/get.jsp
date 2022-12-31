<%@ page import="com.tms.CarConstr" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get Car</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-4">
            <form class="d-flex" role="search">
                <input name="id" class="form-control me-2" type="search" placeholder="enter the id"
                       aria-label="Search">
                <button class="btn-outline-secondary" type="submit">Search</button>
            </form>
        </div>
    </div>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Brand</th>
            <th scope="col">Year</th>
            <th scope="col">Country</th>
        </tr>
        </thead>
        <tbody>
        <%
            String id = String.valueOf(request.getAttribute("id"));
            if (id == null || id.isEmpty()) {
                List<CarConstr> car = (List<CarConstr>) request.getAttribute("car");
                for (CarConstr cars : car) {
                    out.println("<tr><th scope='row'>" + cars.getId() + "</th>");
                    out.println("<td>" + cars.getBrand() + "</td>");
                    out.println("<td>" + cars.getYear() + "</td>");
                    out.println("<td>" + cars.getCountry() + "</td>");
                }
            } else {
                CarConstr carbyid = (CarConstr) request.getAttribute("getid");
                out.println("<tr><th scope='row'>" + carbyid.getId() + "</th>");
                out.println("<td>" + carbyid.getBrand() + "</td>");
                out.println("<td>" + carbyid.getYear() + "</td>");
                out.println("<td>" + carbyid.getCountry() + "</td>");

            }

        %>
        </tbody>
    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
