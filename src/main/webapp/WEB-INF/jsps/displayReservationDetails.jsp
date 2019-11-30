<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Display Reservation details</title>
</head>

<body>
<div class="container">
    <h2>Flights Details</h2>
    <div class="row">
        Airline : ${reservation.flight.operatingAirlines}<br>
        departureCity : ${reservation.flight.departureCity}<br>
        arrivalCity : ${reservation.flight.arrivalCity}<br>
        Date of Departure : ${reservation.flight.dateOfDeparture}<br>
        estimateDepartureTime : ${reservation.flight.estimateDepartureTime}<br>
    </div>


    <h2>Passenger Details</h2>
    <div class="row">
        FirstName : ${reservation.passenger.firstName}<br>
        lastName : ${reservation.passenger.lastName}<br>
        email : ${reservation.passenger.email}<br>
        Phone : ${reservation.passenger.phone}<br>
    </div>

    <h2>Checked In form </h2>
    <form action="completeCheckIn" method="post">
        <div class="form-group">
            <label for="numberOfBags">numberOfBags</label>
            <input type="text" name="numberOfBags" class="form-control" id="numberOfBags"
                   placeholder="Enter Number of bags">
        </div>

        <input type="hidden"   name="reservationId" value="${reservation.id}">
        <button type="submit" class="btn btn-primary">Check In</button>
    </form>

</div>
</body>
</html>