package controller;

import driver.Driver;

import javax.swing.*;
import java.awt.*;

public abstract class BasePanel extends JPanel {
    protected final TextAdventureFrame parent;
    protected final Driver driver;

    protected BasePanel(TextAdventureFrame parent, Driver driver) {
        this.parent = parent;
        this.driver = driver;
        initialize();
    }

    private void initialize() {
        this.setLayout(new BorderLayout());
        JLabel emptyLabel1 = new JLabel("");
        emptyLabel1.setPreferredSize(new Dimension(0, 180));
        JLabel emptyLabel2 = new JLabel("");
        emptyLabel2.setPreferredSize(new Dimension(0, 190));
        JLabel emptyLabel3 = new JLabel("");
        emptyLabel3.setPreferredSize(new Dimension(150, 0));
        JLabel emptyLabel4 = new JLabel("");
        emptyLabel4.setPreferredSize(new Dimension(150, 0));
        this.add(emptyLabel1, BorderLayout.NORTH);
        this.add(emptyLabel2, BorderLayout.SOUTH);
        this.add(emptyLabel3, BorderLayout.WEST);
        this.add(emptyLabel4, BorderLayout.EAST);
    }

    @Override
    public Component add(Component comp) {
        this.add(comp, BorderLayout.CENTER);
        return comp;
    }
}
