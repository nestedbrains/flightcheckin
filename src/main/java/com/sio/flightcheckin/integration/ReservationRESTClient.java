package com.sio.flightcheckin.integration;

import com.sio.flightcheckin.integration.dto.Reservation;
import com.sio.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRESTClient {

    public Reservation findReservation(Long id);

    public Reservation updateReservation(ReservationUpdateRequest request);
}
