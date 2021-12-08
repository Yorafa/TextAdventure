package Gui;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {
    private final TextAdventureFrame parent;

    public LoginPanel(TextAdventureFrame parent) {
        this.parent = parent;
        this.setLayout(new BorderLayout());
        // Setup mainPanel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1));
        setBoard();

        // Setup Text Field
        JTextField username = new JTextField();
        JPanel userPanel = createLine("Username: ", username);
        JTextField password = new JTextField();
        JPanel passPanel = createLine("Password: ", password);
        mainPanel.add(userPanel);
        mainPanel.add(passPanel);

        // Setup Button Field
        JPanel buttonPanel = new JPanel();
        JButton login = new JButton("Login");
        login.addActionListener((e) -> {
            parent.setUser(parent.login(username.getText(), password.getText()));
            login();
        });

        JButton register = new JButton("Register");
        register.addActionListener((e) -> {
            parent.setUser(parent.getUserController().register(username.getText(), password.getText()));
            register();
        });
        buttonPanel.add(login);
        buttonPanel.add(register);

        mainPanel.add(buttonPanel);
        this.add(mainPanel, BorderLayout.CENTER);
    }

    public JPanel createLine(String itemName, JTextField field) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(new JLabel(itemName));
        panel.add(field);
        return panel;
    }

    public void setBoard(){
        JLabel emptyLabel1 = new JLabel("");
        emptyLabel1.setPreferredSize(new Dimension(0,280));
        JLabel emptyLabel2 = new JLabel("");
        emptyLabel2.setPreferredSize(new Dimension(0,290));
        JLabel emptyLabel3 = new JLabel("");
        emptyLabel3.setPreferredSize(new Dimension(300,0));
        JLabel emptyLabel4 = new JLabel("");
        emptyLabel4.setPreferredSize(new Dimension(300,0));
        this.add(emptyLabel1, BorderLayout.NORTH);
        this.add(emptyLabel2, BorderLayout.SOUTH);
        this.add(emptyLabel3, BorderLayout.WEST);
        this.add(emptyLabel4, BorderLayout.EAST);
    }

    public void login(){
        if (parent.getUser() == null) {
            String message = "Either your username not exist or wrong password";
            JOptionPane.showMessageDialog(this, message, "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            parent.remove(this);
            parent.setUp();
            parent.setContentPane(new MapPanel(parent));
            parent.pack();
        }
    }

    public void register(){
        if (parent.getUser() == null) {
            String message = "Your name already been used or\n" +
                    "Your password is doesn't match requirement:\n" +
                    "length 6-16, consist with numbers and characters";
            JOptionPane.showMessageDialog(this, message, "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String message = "You are successful registered";
            JOptionPane.showMessageDialog(this, message, "Warning", JOptionPane.WARNING_MESSAGE);
            parent.remove(this);
            parent.newStart();
            parent.setContentPane(new InitialPanel(parent));
            parent.pack();
        }
    }
}
