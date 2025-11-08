import domain.Reservation;
import domain.Screening;
import domain.Seat;
import domain.User;
import persistence.ReservationDao;
import persistence.ScreeningDao;
import persistence.SeatDao;
import persistence.UserDao;

public class ReservationService {
    private ScreeningDao screeningDao;
    private SeatDao seatDao;
    private UserDao userDao;
    private ReservationDao reservationDao;

    public ReservationService(ScreeningDao screeningDao, SeatDao seatDao, UserDao userDao) {
        this.screeningDao = screeningDao;
        this.seatDao = seatDao;
        this.userDao = userDao;
    }

    public Reservation reserveScreening(Long customerId, Long screeningId, Long seatId, String payment){
        Screening screening = screeningDao.getScreening(screeningId);
        Seat seat = seatDao.getSeat(seatId);
        User user = userDao.getUser(customerId);
        int fee = calcuateFee(screening, seat, user, payment);
        Reservation reservation = makeReservation(screening,seat,user,fee);
        reservationDao.insert(reservation);

        return reservation;
    }

    public int calcuateFee(Screening screening, Seat seat, User user, String payment){
        int originalFee = seat.getPrice();
        int fee = originalFee;
        if(screening.isMovieDay()){
            fee = (int)(originalFee * 0.9);
        }
        if(screening.isSatisfiedTimeCondition()){
            fee -= 2000;
        }
        fee -= user.getPoint();
        if(payment.equals("Cash")){
            fee = (int)(fee * 0.95);
        }
        else if(payment.equals("Card")){
            fee = (int)(fee * 0.98);
        }
        return fee;
    }

    public Reservation makeReservation(Screening screening, Seat seat, User user,int fee){
        return new Reservation(screening.getId(),seat.getId(),user.getId(),fee);
    }
}
