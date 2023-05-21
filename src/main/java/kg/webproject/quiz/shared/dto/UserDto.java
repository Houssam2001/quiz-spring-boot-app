package kg.webproject.quiz.shared.dto;

public class UserDto {
    private long id;
    private String username;
    private int scores;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
