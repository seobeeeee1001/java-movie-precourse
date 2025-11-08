package persistence;

import domain.Seat;

public interface SeatDao {
    Seat getSeat(Long id);
    void insert(Seat seat);
}
