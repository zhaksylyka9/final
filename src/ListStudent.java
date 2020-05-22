import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListStudent extends Container {
    public static JTextArea studentText;
    private JButton listStudentButton;
    private JButton backStudentButton;

    public ListStudent() {
        setSize(600,400);
        setLayout(null);

        studentText = new JTextArea();
        studentText.setBounds(90, 50, 300, 150);
        add(studentText);

        listStudentButton = new JButton("LIST STUDENT");
        listStudentButton.setBackground(new java.awt.Color(27, 204, 3));
        listStudentButton.setBounds(90, 220, 145, 30);
        listStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PackageData pd = new PackageData("LIST");
                Main.connect(pd);

            }
        });
        add(listStudentButton);

        backStudentButton = new JButton("BACK");
        backStudentButton.setBackground(new java.awt.Color(231, 105, 105));
        backStudentButton.setBounds(245,220,145, 30);
        backStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.listStudentWindow.setVisible(false);
                Main.frame.studentWindow.setVisible(true);
            }
        });
        add(backStudentButton);
    }
}
