package domain;

public class User {
    private Long id;
    private String username;
    private int point;

    public User(){

    }
    public User(String username, int point){
        this.username = username;
        this.point = point;
    }
    public Long getId() {
        return id;
    }
    public int getPoint() {
        return point;
    }
}
