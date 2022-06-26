package team3.passpasspass.VM.controller.GUI;

import javax.swing.*;
import java.awt.*;

public class T3Frame extends JFrame {

    public T3Frame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 1000);
        this.setVisible(true);
//        this.setResizable(false);
        // set location
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = screenSize.width/5;
        int centerY = screenSize.height/5;
        this.setLocation(centerX, centerY);
        // set Layout
        this.setLayout(new VerticalLayout());
        // add ourTeamMark
        JLabel T3Mark = new TextFactory("@Copyright(c) Team #3 Work",0);
        this.add(T3Mark);
    }
}
