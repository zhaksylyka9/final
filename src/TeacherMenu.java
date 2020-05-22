import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherMenu extends Container {
    private JButton addButton;
    private JButton listButton;
    private JButton orderButton;
    private JButton dancePoolButton;
    private JButton backButton;

    public TeacherMenu() {
        setSize(600,400);
        setLayout(null);

        addButton = new JButton("ADD TEACHER");
        addButton.setBackground(new java.awt.Color(148, 148, 153));
        addButton.setBounds(130, 80, 300, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.teacherWindow.setVisible(false);
                Main.frame.addTeacherWindow.setVisible(true);
            }
        });

        add(addButton);

        listButton = new JButton("LIST OF TEACHERS");
        listButton.setBackground(new java.awt.Color(148, 148, 153));
        listButton.setBounds(130, 120, 300, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.teacherWindow.setVisible(false);
                Main.frame.listTeacherWindow.setVisible(true);
            }
        });

        add(listButton);

        orderButton = new JButton("LIST OF ALCOHOL");
        orderButton.setBackground(new java.awt.Color(148, 148, 153));
        orderButton.setBounds(130, 160, 300, 30);
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.teacherWindow.setVisible(false);
                Main.frame.alcoholMenuWindow.setVisible(true);
            }
        });

        add(orderButton);

        dancePoolButton = new JButton("DANCE POOL MENU");
        dancePoolButton.setBackground(new java.awt.Color(148, 148, 153));
        dancePoolButton.setBounds(130, 200, 300, 30);
        dancePoolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.teacherWindow.setVisible(false);
                Main.frame.dancePoolMenuWindow.setVisible(true);
            }
        });

        add(dancePoolButton);




        backButton = new JButton("BACK");
        backButton.setBackground(new java.awt.Color(231, 105, 105));
        backButton.setBounds(130, 240, 300, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.teacherWindow.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(backButton);

    }


}
