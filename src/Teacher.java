import java.awt.*;

public class Teacher extends Container {
    private Integer id;
    private String teacherName;
    private String patronymic;
    private String subject;

    public Teacher(Integer id, String teacherName, String patronymic, String subject) {
        this.id = id;
        this.teacherName = teacherName;
        this.patronymic = patronymic;
        this.subject = subject;
    }

    public Teacher() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String toString(){
        return  teacherName + " " + patronymic + " " + subject;
    }
}
