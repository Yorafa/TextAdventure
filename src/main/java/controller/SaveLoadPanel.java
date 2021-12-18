package controller;

import usecase.data.SaveLoadController;
import driver.Driver;
import usecase.map.MapManager;
import usecase.pokemon.PokemonManager;

import javax.swing.*;
import java.util.Date;

public class SaveLoadPanel extends JPanel {
    private final JComboBox<Date> comboBox = new JComboBox<>();
    private final SaveLoadController saveLoadController;
    private final MapManager mapManager;
    private final PokemonManager pokemonManager;


    public SaveLoadPanel(Driver driver) {
        this.saveLoadController = driver.getSaveLoadController();
        this.mapManager = driver.getMapManager();
        this.pokemonManager = driver.getPokemonManager();
        initialize();
    }

    private void initialize() {
        this.add(saveButton());
        this.add(comboBox);
        this.add(loadButton());
    }

    private JButton saveButton() {
        JButton save = new JButton("Save");
        save.addActionListener(e -> save());
        return save;
    }

    private JButton loadButton() {
        JButton load = new JButton("Load");
        load.addActionListener(e -> load((Date) comboBox.getSelectedItem()));
        return load;
    }

    private void save() {
        saveLoadController.save(pokemonManager.getPocket(), mapManager.getCurrentPlace());
        comboBox.addItem(new Date());
    }

    private void load(Date date) {
        saveLoadController.loadGameDataMemento(date);
        mapManager.setCurrentPlace(saveLoadController.getCurrentPlace());
        pokemonManager.setPocket(saveLoadController.getPocket());
    }
}
