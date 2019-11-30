package com.sio.flightcheckin.integration;

import com.sio.flightcheckin.integration.dto.Reservation;
import com.sio.flightcheckin.integration.dto.ReservationUpdateRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReservationRESTClientImpl implements ReservationRESTClient {

    private final String RESERVATION_REST_URL = "http://localhost:8080/reservation/reservations/";

    @Override
    public Reservation findReservation(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(RESERVATION_REST_URL + id, Reservation.class);
    }

    @Override
    public Reservation updateReservation(ReservationUpdateRequest request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(RESERVATION_REST_URL, request, Reservation.class);
    }
}
