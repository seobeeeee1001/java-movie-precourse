package domain;

public class Reservation {
    Long id;
    Long screeningId;
    Long seatId;
    Long userId;
    int fee;

    public Reservation(Long screeningId, Long seatId, Long userId, int fee) {
        this(null,screeningId,seatId,userId,fee);
    }
    public Reservation(Long id,Long screeningId, Long seatId, Long userId, int fee) {
        this.id = id;
        this.screeningId = screeningId;
        this.seatId = seatId;
        this.userId = userId;
        this.fee = fee;
    }

    public  Long getId() {
        return id;
    }
}
