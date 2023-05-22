package kg.webproject.quiz.ui.models.request;

public class UserRequestModel {
    private String Id;
    private String username;
    private String scores;
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
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
