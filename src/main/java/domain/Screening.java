package domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Screening {
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    public Screening(LocalTime startTime, LocalTime endTime, LocalDate date) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public Screening(){

    };

    public boolean isMovieDay(){
        if(this.date.getDayOfMonth() == 10 ||  this.date.getDayOfMonth() == 20 ||   this.date.getDayOfMonth() == 30){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isSatisfiedTimeCondition(){
        if(this.startTime.getHour() < 8 || this.startTime.getHour() >= 20){
            return true;
        }
        else{
            return false;
        }
    }
}
