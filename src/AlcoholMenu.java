import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlcoholMenu extends Container {
    private JLabel listAlcoholLabel;
    private JLabel snackLabel;

    private String[] alcohols = {" JACK DANIELS 0.7 - 41$ ", " MARTINI 0.7 - 25$ ", " HENNESSY 0.7 - 30$ ", "TEACHER'S - 105 "};
    private JComboBox listAlcoholBox;
    private String[] snacks = {" PICKLES - 2$ ", " HERRING - 5$ ", " FAT - 10$ ", " KEBAB - 15$"};
    private JComboBox snackBox;

    private JTextArea orderText;
    private JButton toOrderButton;
    private JButton backToMenu;

    public AlcoholMenu() {
        setSize(600,400);
        setLayout(null);

        listAlcoholLabel = new JLabel("List of Alcohol:");
        listAlcoholLabel.setBounds(100,70,60,30);
        add(listAlcoholLabel);

        listAlcoholBox = new JComboBox(alcohols);
        listAlcoholBox.setBounds(160,70,150,30);
        add(listAlcoholBox);

        snackLabel = new JLabel("List of Snack:");
        snackLabel.setBounds(100,110,60,30);
        add(snackLabel);

        snackBox = new JComboBox(snacks);
        snackBox.setBounds(160,110,150,30);
        add(snackBox);

        orderText = new JTextArea();
        orderText.setBounds(100, 150, 300, 100);
        add(orderText);

        toOrderButton = new JButton("ADD ORDER");
        toOrderButton.setBackground(new java.awt.Color(27, 204, 3));
        toOrderButton.setBounds(90, 260, 210, 30);
        toOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String alcohol = (String) listAlcoholBox.getSelectedItem();
                String snack = (String) snackBox.getSelectedItem();

                OrderMenu om = new OrderMenu(alcohol, snack);
                Main.addOrder(om);

                String s = "";
                for(int i = 0; i<Main.countOrders;i++){
                    s+=Main.orders[i] + "\n";
                }
                orderText.setText(s);
            }
        });
        add(toOrderButton);

        backToMenu = new JButton("BACK");
        backToMenu.setBackground(new java.awt.Color(231, 105, 105));
        backToMenu.setBounds(90, 300, 210, 30);
        backToMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.alcoholMenuWindow.setVisible(false);
                Main.frame.teacherWindow.setVisible(true);

            }
        });
        add(backToMenu);
    }
}
