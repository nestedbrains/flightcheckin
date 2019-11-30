<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Check In</title>
</head>

<body>
<div class="container">
    <h2>Start CheckIn</h2>
    <form action="startCheckIn" method="post">

        <div class="form-group">
            <label for="from">Enter the Reservation Id</label>
            <input type="text" name="reservationId" class="form-control" id="from" placeholder="Enter Reservation Id">
        </div>

        <button type="submit" class="btn btn-primary">Start Check In</button>

    </form>
</div>
</body>
</html>