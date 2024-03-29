package com.sio.flightcheckin.controller;

import com.sio.flightcheckin.integration.ReservationRESTClient;
import com.sio.flightcheckin.integration.dto.Reservation;
import com.sio.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckInController {

    @Autowired
    ReservationRESTClient restClient;

    @RequestMapping("/showStartCheckIn")
    public String showStartCheckIn() {
        return "startCheckIn";
    }

    @RequestMapping("/startCheckIn")
    public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
        Reservation reservation = restClient.findReservation(reservationId);
        modelMap.addAttribute("reservation", reservation);
        return "displayReservationDetails";
    }

    @RequestMapping("completeCheckIn")
    public String completeCheckIn
            (
                    @RequestParam("reservationId") Long reservationId,
                    ModelMap modelMap,
                    @RequestParam("numberOfBags") int numberOfBags
            ) {
        ReservationUpdateRequest reservationUpdateRequest = new ReservationUpdateRequest();
        reservationUpdateRequest.setId(reservationId);
        reservationUpdateRequest.setCheckedIn(true);
        reservationUpdateRequest.setNumberOfBags(numberOfBags);
        restClient.updateReservation(reservationUpdateRequest);
        return "checkInConfirmation";
    }
}
