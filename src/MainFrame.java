import javax.swing.*;


public class MainFrame extends JFrame {
    public static MainMenu menuWindow;
    public static TeacherMenu teacherWindow;
    public static StudentMenu studentWindow;
    public static AddTeacher addTeacherWindow;
    public static AddStudent addStudentWindow;
    public static ListTeacher listTeacherWindow;
    public static ListStudent listStudentWindow;
    public static AlcoholMenu alcoholMenuWindow;
    public static DancePoolMenu dancePoolMenuWindow;
    public static StudentDancePoolMenu studentDancePoolMenuWindow;
    public static RegisterMenu registerWindow;
    public static SignUpMenu signUpMenuWindow;


    public MainFrame() {
        setSize(600, 400);
        setTitle("NAUGHTY CLUB APP");
        setBackground(new java.awt.Color(128,113,150));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        menuWindow = new MainMenu();
        menuWindow.setLocation(0, 0);
        add(menuWindow);

        teacherWindow = new TeacherMenu();
        teacherWindow.setLocation(0, 0);
        teacherWindow.setVisible(false);
        add(teacherWindow);

        studentWindow = new StudentMenu();
        studentWindow.setLocation(0, 0);
        studentWindow.setVisible(false);
        add(studentWindow);

        addTeacherWindow = new AddTeacher();
        addTeacherWindow.setLocation(0, 0);
        addTeacherWindow.setVisible(false);
        add(addTeacherWindow);

        addStudentWindow = new AddStudent();
        addStudentWindow.setLocation(0, 0);
        addStudentWindow.setVisible(false);
        add(addStudentWindow);

        listTeacherWindow = new ListTeacher();
        listTeacherWindow.setLocation(0, 0);
        listTeacherWindow.setVisible(false);
        add(listTeacherWindow);

        listStudentWindow = new ListStudent();
        listStudentWindow.setLocation(0, 0);
        listStudentWindow.setVisible(false);
        add(listStudentWindow);

        alcoholMenuWindow = new AlcoholMenu();
        alcoholMenuWindow.setLocation(0, 0);
        alcoholMenuWindow.setVisible(false);
        add(alcoholMenuWindow);

        dancePoolMenuWindow = new DancePoolMenu();
        dancePoolMenuWindow.setLocation(0, 0);
        dancePoolMenuWindow.setVisible(false);
        add(dancePoolMenuWindow);

        studentDancePoolMenuWindow = new StudentDancePoolMenu();
        studentDancePoolMenuWindow.setLocation(0, 0);
        studentDancePoolMenuWindow.setVisible(false);
        add(studentDancePoolMenuWindow);

        registerWindow = new RegisterMenu();
        registerWindow.setLocation(0, 0);
        registerWindow.setVisible(false);
        add(registerWindow);

        signUpMenuWindow = new SignUpMenu();
        signUpMenuWindow.setLocation(0, 0);
        signUpMenuWindow.setVisible(false);
        add(signUpMenuWindow);


    }
}
