package kg.webproject.quiz.io.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "users")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private int score;

    @Column(nullable = false)
    private Date scoreDate;

    public UserEntity(long id, String username, int score, Date scoreDate) {
        this.id = id;
        this.username = username;
        this.score = score;
        this.scoreDate = scoreDate;
    }

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getScoreDate() {
        return scoreDate;
    }

    public void setScoreDate(Date scoreDate) {
        this.scoreDate = scoreDate;
    }

}
