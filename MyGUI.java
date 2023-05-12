import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class MyGUI extends JFrame implements java.io.Serializable
{

    public MyGUI()
    {
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        JButton b1 = new JButton("test button 1");

        mainPanel.add(b1);

        setContentPane(mainPanel);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        new MyGUI();
    }
}
