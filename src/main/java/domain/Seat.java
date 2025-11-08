package domain;

public class Seat {
    public enum Grade {S, A, B}

    Long id;
    String seatCode;
    Grade grade;
    Boolean isReserved;

    public Seat(Long id, String seatCode, Grade grade, Boolean isReserved) {}
    public int getPrice(){
        if(Grade.S.equals(grade)){
            return 18000;
        }
        else if(Grade.A.equals(grade)){
            return 15000;
        }
        else if(Grade.B.equals(grade)){
            return 12000;
        }
        else {
            return 0;
        }
    }

}
