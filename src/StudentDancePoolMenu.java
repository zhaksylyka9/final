import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDancePoolMenu extends Container {
    private JLabel lightMusicLabel;
    private JLabel SongLabel;
    private JLabel TimeToDancingLabel;

    private String[] lightMusics = {" YES ", " NO "};
    private JComboBox lightMusicBox;
    private String[] songs = {" 70s DISCO ", " 80s DISCO ", " 90s DISCO ", " MODERN "};
    private JComboBox SongBox;
    private String[] hours = {" 3 hours ", " 5 hours ", " 7 hours "};
    private JComboBox TimeToDancingBox;

    private JTextArea dancePoolText;
    private JButton toOrderDancingButton;
    private JButton studentDancingBackToMenu;

    public StudentDancePoolMenu() {
        setSize(600,400);
        setLayout(null);

        lightMusicLabel = new JLabel("Do you want light music?");
        lightMusicLabel.setBounds(30,50,150,30);
        add(lightMusicLabel);

        lightMusicBox = new JComboBox(lightMusics);
        lightMusicBox.setBounds(180,50,250,30);
        add(lightMusicBox);

        SongLabel = new JLabel("What kind of music do you want to dance to?");
        SongLabel.setBounds(30,90,150,30);
        add(SongLabel);

        SongBox = new JComboBox(songs);
        SongBox.setBounds(180,90,250,30);
        add(SongBox);

        TimeToDancingLabel = new JLabel("How many hours do you want to dance?");
        TimeToDancingLabel.setBounds(30,130,150,30);
        add(TimeToDancingLabel);

        TimeToDancingBox = new JComboBox(hours);
        TimeToDancingBox.setBounds(180,130,250,30);
        add(TimeToDancingBox);

        dancePoolText = new JTextArea();
        dancePoolText.setBounds(50, 170, 400, 80);
        add(dancePoolText);

        toOrderDancingButton = new JButton("TO ORDER");
        toOrderDancingButton.setBackground(new java.awt.Color(27, 204, 3));
        toOrderDancingButton.setBounds(90, 260, 210, 30);
        toOrderDancingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String lightMusic = (String) lightMusicBox.getSelectedItem();
                String song = (String) SongBox.getSelectedItem();
                String time = (String) TimeToDancingBox.getSelectedItem();

                DancePoolItems dp = new DancePoolItems(lightMusic, song, time);
                Main.addItems(dp);

                String s = "";
                for(int i = 0; i<Main.countItems;i++){
                    s+=Main.items[i] + "\n";
                }
                dancePoolText.setText(s);
            }
        });
        add(toOrderDancingButton);

        studentDancingBackToMenu = new JButton("BACK");
        studentDancingBackToMenu.setBackground(new java.awt.Color(231, 105, 105));
        studentDancingBackToMenu.setBounds(90, 300, 210, 30);
        studentDancingBackToMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.studentDancePoolMenuWindow.setVisible(false);
                Main.frame.studentWindow.setVisible(true);
            }
        });
        add(studentDancingBackToMenu);
    }
}
