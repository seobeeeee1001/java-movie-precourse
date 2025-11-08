import domain.Screening;

public class ReservationService {

    public Reservation reserveScreening(Long customerId, Long screeningId, Long seatId, Payment payment){
        Screening screening;

        int fee = calcuateFee();
    }

    public int calcuateFee(){
        int originalFee = seat.getPrice();
        int fee = originalFee;
        if(screening.isMovieDay()){
            fee = (int)(originalFee * 0.9);
        }
        if(screening.isSatisfiedTimeCondition()){
            fee -= 2000;
        }
    }
}
