import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLOutput;

public class SignUpMenu extends Container {
    private JLabel putLoginLabel;
    private JLabel putPasswordLabel;


    private JTextField putLoginText;
    private JPasswordField putPasswordField;

    private JButton signInButton;
    private JButton backToRegister;

    public SignUpMenu() {
        setSize(600, 400);
        setLayout(null);

        putLoginLabel = new JLabel("Login:");
        putLoginLabel.setBounds(90,60,100,30);
        add(putLoginLabel);

        putLoginText = new JTextField();
        putLoginText.setBounds(190,60,150,30);
        add(putLoginText);

        putPasswordLabel = new JLabel("Password:");
        putPasswordLabel.setBounds(90,100,100,30);
        add(putPasswordLabel);

        putPasswordField = new JPasswordField();
        putPasswordField.setBounds(190,100,150,30);
        add(putPasswordField);

        signInButton = new JButton("SIGN IN");
        signInButton.setBackground(new java.awt.Color(27, 204, 3));
        signInButton.setBounds(90, 140, 250, 30);
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(signInButton);

        backToRegister = new JButton("BACK TO REGISTER");
        backToRegister.setBackground(new java.awt.Color(231, 105, 105));
        backToRegister.setBounds(90, 180, 250, 30);
        backToRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.signUpMenuWindow.setVisible(false);
                Main.frame.registerWindow.setVisible(true);
            }
        });
        add(backToRegister);
    }
}
