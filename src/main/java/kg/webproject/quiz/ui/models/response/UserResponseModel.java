package kg.webproject.quiz.ui.models.response;

public class UserResponseModel {
    private String Id;
    private String username;
    private String score;
    
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
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    
}
