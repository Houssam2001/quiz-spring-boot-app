package kg.webproject.quiz.ui.models.request;

public class UserRequestModel {
    private String id;
    private String username;
    private String scores;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getScores() {
        return scores;
    }
    public void setScores(String scores) {
        this.scores = scores;
    }

}
