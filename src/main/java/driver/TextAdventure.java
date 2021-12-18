package driver;

import gui.TextAdventureFrame;

public class TextAdventure {

    public static void main(String[] args) {
        TextAdventureFrame frame = new TextAdventureFrame(new GuiDriver());
        frame.initialize();
    }
}
