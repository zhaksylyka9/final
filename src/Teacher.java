import java.awt.*;

public class Teacher extends Container {
    private String teacherName;
    private String patronymic;
    private String subject;


    public Teacher(String teacherName, String patronymic, String subject) {
        this.teacherName = teacherName;
        this.patronymic = patronymic;
        this.subject = subject;
    }

    public Teacher() {
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
