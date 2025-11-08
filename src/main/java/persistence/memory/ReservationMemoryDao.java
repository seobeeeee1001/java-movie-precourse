package persistence.memory;

import domain.Reservation;
import persistence.ReservationDao;

public class ReservationMemoryDao extends InMemoryDao<Reservation> implements ReservationDao{
    @Override
    public Reservation getReservation(Long id) {
        return findOne(reservation -> reservation.getId().equals(id));
    }
}
