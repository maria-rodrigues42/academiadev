package Courses;

import java.time.Duration;

public class Course {
    private String title;//deve ser um atributo unico
    private String description;
    private String instructorName;
    private Duration duration;//Duration.ofHours(5).plusMinutes(30); // 5 horas e 30 min
    private String difficultyLevel;//BEGINNER, INTERMEDIATE ou ADVANCED
    private String status; // ACTIVE ou INACTIVE

    public Course(String title, String description, String instructorName, Duration duration, String difficultyLevel, String status){
        this.title = title;
        this.description = description;
        this.instructorName = instructorName;
        this.duration = duration;
        this.difficultyLevel = difficultyLevel;
        this.status = status;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        instructorName = instructorName;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        difficultyLevel = difficultyLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
