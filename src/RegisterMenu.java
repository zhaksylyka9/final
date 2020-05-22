import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class RegisterMenu extends Container {
    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JLabel userNameLabel;
    private JLabel genderLabel;

    private JTextField loginField;
    private JPasswordField passwordField;
    private JTextField userNameField;


    private JButton submitButton;
    private JButton loginButton;
    private JButton backtoMenuButton;
    private JRadioButton male;
    private JRadioButton female;




    public RegisterMenu() {
        setSize(600, 400);
        setLayout(null);

        userNameLabel = new JLabel("FullName:");
        userNameLabel.setBounds(90,60,60,30);
        add(userNameLabel);

        userNameField = new JTextField();
        userNameField.setBounds(150,60,150,30);
        add(userNameField);

        loginLabel = new JLabel("Login:");
        loginLabel.setBounds(90,100,60,30);
        add(loginLabel);

        loginField = new JTextField();
        loginField.setBounds(150,100,150,30);
        add(loginField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(90,140,60,30);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150,140,150,30);
        add(passwordField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(90,180,60,30);
        add(genderLabel);

        male = new JRadioButton("TEACHER");
        male.setBounds(150,180,100,30);
        add(male);

        female = new JRadioButton("STUDENT");
        female.setBounds(250,180,100,30);
        add(female);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);



        submitButton = new JButton("SUBMIT");
        submitButton.setBackground(new java.awt.Color(27, 204, 3));
        submitButton.setBounds(90, 220, 210, 30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    ResultSet result = Main.statement.executeQuery("SELECT * FROM user WHERE login=" + loginField.getText());
                    if(!result.next()){
                        Main.statement.executeQuery("" +
                                "INSERT INTO user (id, userName, login, password, gender) " +
                                "VALUES (NULL, ?, ?, ?, ?)");
                    }
                    else JOptionPane.showMessageDialog(null, "Пользователь с таким логином уже есть!");
                }
                catch (Exception e1) {
                e1.printStackTrace();
                }

            }
        });
        add(submitButton);

        loginButton = new JButton("SIGN UP");
        loginButton.setBackground(new java.awt.Color(148, 148, 153));
        loginButton.setBounds(90, 260, 210, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.registerWindow.setVisible(false);
                Main.frame.signUpMenuWindow.setVisible(true);
            }
        });
        add(loginButton);

        backtoMenuButton = new JButton("BACK");
        backtoMenuButton.setBackground(new java.awt.Color(231, 105, 105));
        backtoMenuButton.setBounds(90, 300, 210, 30);
        backtoMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.registerWindow.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(backtoMenuButton);
    }
    }

