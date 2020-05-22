import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class AddTeacher extends Container {
    private JLabel teacherNameLabel;
    private JLabel teacherPatronymicLabel;
    private JLabel subjectLabel;

    private JTextField teacherNameText;
    private JTextField teacherPatronymicText;
    private String[] subjects = {"PROGRAMMING", "MATH", "ICT", "GYMTEACHER"};
    private JComboBox subjectBox;

    private JButton addTeacherButton;
    private JButton backButton;


    public AddTeacher() {
        setSize(600,400);
        setLayout(null);

        teacherNameLabel = new JLabel("Name:");
        teacherNameLabel.setBounds(90,60,60,30);
        add(teacherNameLabel);

        teacherNameText = new JTextField();
        teacherNameText.setBounds(150,60,150,30);
        add(teacherNameText);

        teacherPatronymicLabel = new JLabel("Surname:");
        teacherPatronymicLabel.setBounds(90,100,60,30);
        add(teacherPatronymicLabel);

        teacherPatronymicText = new JTextField();
        teacherPatronymicText.setBounds(150,100,150,30);
        add(teacherPatronymicText);

        subjectLabel = new JLabel("Faculty:");
        subjectLabel.setBounds(90,140,60,30);
        add(subjectLabel);

        subjectBox = new JComboBox(subjects);
        subjectBox.setBounds(150,140,150,30);
        add(subjectBox);


        addTeacherButton = new JButton("ADD TEACHER");
        addTeacherButton.setBackground(new java.awt.Color(27, 204, 3));
        addTeacherButton.setBounds(90, 220, 210, 30);
        addTeacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teacherName = teacherNameText.getText();
                String patronymic = teacherPatronymicText.getText();
                String subject = (String) subjectBox.getSelectedItem();

                Teacher teacher = new Teacher(null, teacherName, patronymic, subject);




                teacherNameText.setText("");
                teacherPatronymicText.setText("");
            }
        });
        add(addTeacherButton);

        backButton = new JButton("BACK");
        backButton.setBackground(new java.awt.Color(231, 105, 105));
        backButton.setBounds(90, 260, 210, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addTeacherWindow.setVisible(false);
                Main.frame.teacherWindow.setVisible(true);

            }
        });
        add(backButton);
    }

}
