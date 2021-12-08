package Gui;

import GuiController.MapController;
import GuiController.UserController;
import GuiGateway.MapGate;
import GuiGateway.PokemonGate;
import GuiGateway.UserGate;
import entity.*;

import javax.swing.*;

public class TextAdventure {

    public static void main(String[] args) {
        UserController userController = UserGate.readUM();
        MapController mapController = MapGate.readMapController();
        PokemonBook pokemonBook = PokemonGate.toPokemonBook();
        JFrame frame = new TextAdventureFrame(userController, mapController, pokemonBook);
    }
}
