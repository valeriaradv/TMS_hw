<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Add car</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>

<div class="container">

<form class="row g-3 needs-validation" novalidate action="/addcar" method="post">

  <div class="col-md-4 ">
    <label  class="form-label">ID</label><br>
    <input type="text" name="addnewcarid"required><br>

    <label  class="form-label">Brand</label><br>
    <input type="text"  name="addnewcarbrand" required><br>

    <label  class="form-label">Year</label><br>
    <input type="text" name="addnewcaryear" required><br>

    <label  class="form-label">Country</label><br>
    <input type="text"   name="addnewcarcountry" required><br>
  </div>

  <div class="col-12">
    <button class="btn btn-primary" type="submit">Submit form</button>
  </div>

</form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
</body>
</html>
