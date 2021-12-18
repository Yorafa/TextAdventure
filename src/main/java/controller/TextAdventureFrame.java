package controller;

import driver.Driver;

import javax.swing.*;
import java.awt.*;

public class TextAdventureFrame extends JFrame {
    private final Driver driver;
    private JPanel panel;

    /**
     * Construct a TextAdventureFrame, given them the given guiDriver
     *
     * @param driver the main driver of game
     */
    public TextAdventureFrame(Driver driver) {
        this.driver = driver;
    }

    public void loginPanel() {
        this.panel = new LoginPanel(this, driver);
        this.setContentPane();
        this.pack();
    }

    public void initialPanel() {
        this.panel = new InitialPanel(this, driver);
        this.setContentPane();
        this.pack();
    }

    public void browsePokemonPanel() {
        BrowsePokemonDialog dialog = new BrowsePokemonDialog(this, driver);
        dialog.setTitle("Check the Pokemon Book/Change the battle pokemon");
        dialog.setModal(true);
        dialog.setSize(500, 150);
        dialog.setVisible(true);
    }

    public void explorePanel() {
        this.panel = new ExplorePanel(this, driver);
        this.setContentPane();
        this.pack();
    }

    public void battlePanel() {
        this.panel = new BattlePanel(this, driver);
        this.setContentPane();
        this.pack();
    }

    private void setContentPane() {
        this.setContentPane(panel);
    }

    public void initialize() {
        this.setTitle("Text Adventure");
        this.setSize(new Dimension(1280, 720));
        this.setPreferredSize(new Dimension(1280, 720));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPanel();
        this.setContentPane();
        this.pack();
        this.setVisible(true);
    }
}