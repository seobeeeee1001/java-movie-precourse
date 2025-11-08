package persistence.memory;

import domain.Seat;
import persistence.SeatDao;

public class SeatMemoryDao extends InMemoryDao<Seat> implements SeatDao {
    @Override
    public Seat getSeat(Long id) {
        return findOne(Seat->Seat.getId().equals(id));
    }
}
