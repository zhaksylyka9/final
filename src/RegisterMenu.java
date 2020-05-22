import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

            }
        });
        add(submitButton);

        loginButton = new JButton("SIGN UP");
        loginButton.setBackground(new java.awt.Color(231, 105, 105));
        loginButton.setBounds(90, 260, 210, 30);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.registerWindow.setVisible(false);
                Main.frame.signUpMenuWindow.setVisible(true);
            }
        });
        add(loginButton);
    }
    }

