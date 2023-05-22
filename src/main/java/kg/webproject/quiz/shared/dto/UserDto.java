package kg.webproject.quiz.shared.dto;

public class UserDto {
    private long Id;
    private String username;
    private int scores;
    public long getId() {
        return Id;
    }
    public void setId(long Id) {
        this.Id = Id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getScores() {
        return scores;
    }
    public void setScores(int scores) {
        this.scores = scores;
    }
}
