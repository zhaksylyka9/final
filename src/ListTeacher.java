import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListTeacher extends Container {
    public static JTextArea teacherText;
    private JButton listTeacherButton;
    private JButton backTeacherButton;

    public ListTeacher() {
        setSize(600,400);
        setLayout(null);


        teacherText = new JTextArea();
        teacherText.setBounds(90, 50, 300, 150);
        add(teacherText);

        listTeacherButton = new JButton("LIST TEACHERS");
        listTeacherButton.setBackground(new java.awt.Color(27, 204, 3));
        listTeacherButton.setBounds(90, 220, 145, 30);
        listTeacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                              String s = "";
                for(int i = 0; i<Main.countTeachers;i++){
                    s+=Main.teachers[i] + "\n";
                }
                teacherText.setText(s);

            }
        });
        add(listTeacherButton);

        backTeacherButton = new JButton("BACK");
        backTeacherButton.setBackground(new java.awt.Color(231, 105, 105));
        backTeacherButton.setBounds(245,220,145, 30);
        backTeacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.listTeacherWindow.setVisible(false);
                Main.frame.teacherWindow.setVisible(true);
            }
        });
        add(backTeacherButton);
    }
}
