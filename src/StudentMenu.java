import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentMenu extends Container {
    private JButton addStudentButton;
    private JButton listStudentButton;
    private JButton dancePoolButton;
    private JButton exitButton;

    public StudentMenu() {
        setSize(600, 400);
        setLayout(null);


        addStudentButton = new JButton("ADD");
        addStudentButton.setBackground(new java.awt.Color(148, 148, 153));
        addStudentButton.setBounds(130, 80, 300, 30);
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.studentWindow.setVisible(false);
                Main.frame.addStudentWindow.setVisible(true);

            }
        });

        add(addStudentButton);

        listStudentButton = new JButton("LIST");
        listStudentButton.setBackground(new java.awt.Color(148, 148, 153));
        listStudentButton.setBounds(130, 120, 300, 30);
        listStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.studentWindow.setVisible(false);
                Main.frame.listStudentWindow.setVisible(true);
            }
        });

        add(listStudentButton);


        dancePoolButton = new JButton("DANCE POOL MENU");
        dancePoolButton.setBackground(new java.awt.Color(148, 148, 153));
        dancePoolButton.setBounds(130, 160, 300, 30);
        dancePoolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.studentWindow.setVisible(false);
                Main.frame.studentDancePoolMenuWindow.setVisible(true);
            }
        });

        add(dancePoolButton);



        exitButton = new JButton("BACK");
        exitButton.setBackground(new java.awt.Color(231, 105, 105));
        exitButton.setBounds(130, 200, 300, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.studentWindow.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(exitButton);
    }
}
