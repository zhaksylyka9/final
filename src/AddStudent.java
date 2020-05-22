
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudent extends Container {
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel facultyLabel;
    private JLabel groupLabel;

    private JTextField nameText;
    private JTextField surnameText;
    private String[] faculties = {"SIS", "IS", "JOUR", "FINANCE"};
    private JComboBox facultyBox;
    private JTextField groupText;

    private JButton addButton;
    private JButton backButton;

    public AddStudent() {
        setSize(600, 400);
        setLayout(null);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(90,60,60,30);
        add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(150,60,150,30);
        add(nameText);

        surnameLabel = new JLabel("Surname:");
        surnameLabel.setBounds(90,100,60,30);
        add(surnameLabel);

        surnameText = new JTextField();
        surnameText.setBounds(150,100,150,30);
        add(surnameText);

        facultyLabel = new JLabel("Faculty:");
        facultyLabel.setBounds(90,140,60,30);
        add(facultyLabel);

        facultyBox = new JComboBox(faculties);
        facultyBox.setBounds(150,140,150,30);
        add(facultyBox);

        groupLabel = new JLabel("Group:");
        groupLabel.setBounds(90,180,60,30);
        add(groupLabel);

        groupText = new JTextField();
        groupText.setBounds(150,180,150,30);
        add(groupText);

        addButton = new JButton("ADD STUDENT");
        addButton.setBackground(new java.awt.Color(27, 204, 3));
        addButton.setBounds(90, 220, 210, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String surname = surnameText.getText();
                String faculty = (String) facultyBox.getSelectedItem();
                String group = groupText.getText();

                Student student = new Student(null, name, surname, faculty, group);
                PackageData pd = new PackageData("ADD", student);
                Main.connect(pd);



                nameText.setText("");
                surnameText.setText("");
                groupText.setText("");


            }
        });
        add(addButton);

        backButton = new JButton("BACK");
        backButton.setBackground(new java.awt.Color(231, 105, 105));
        backButton.setBounds(90, 260, 210, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.addStudentWindow.setVisible(false);
                Main.frame.studentWindow.setVisible(true);

            }
        });
        add(backButton);
    }
}
