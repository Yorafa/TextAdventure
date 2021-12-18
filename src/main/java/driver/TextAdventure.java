package driver;

import controller.TextAdventureFrame;

public class TextAdventure {

    public static void main(String[] args) {
        TextAdventureFrame frame = new TextAdventureFrame(new Driver());
        frame.initialize();
    }
}
