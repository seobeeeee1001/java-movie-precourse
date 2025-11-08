package persistence;

import domain.Reservation;

public interface ReservationDao {
    Reservation getReservation(Long id);
    void insert(Reservation reservation);
}
