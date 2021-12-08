package GuiUsecase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TextAdventureMap implements Serializable {
    private String mapName;
    private List<List<String>> pokemons;
    private final int MIN_ExperiencePoint;
    private final int MAX_ExperiencePoint;

    public TextAdventureMap(){
        this.mapName = "";
        this.pokemons = new ArrayList<>();
        this.MIN_ExperiencePoint = 0;
        this.MAX_ExperiencePoint = 0;
    }

    /**
     * Construct TextAdventureMap, given them the given mapName,
     * pokemons, MIN_ExperiencePoint and MAX_ExperiencePoint
     *
     * @param mapName the map name
     * @param pokemons the pokemon that this map has
     * @param MIN_ExperiencePoint the minimum exp that the pokemon in this should have
     * @param MAX_ExperiencePoint the maximum exp that the pokemon in this should have
     */
    public TextAdventureMap(String mapName, List<List<String>> pokemons,
                            int MIN_ExperiencePoint, int MAX_ExperiencePoint){
        this.mapName = mapName;
        this.pokemons = pokemons;
        this.MIN_ExperiencePoint = MIN_ExperiencePoint;
        this.MAX_ExperiencePoint = MAX_ExperiencePoint;
    }

    public int getMAX_ExperiencePoint() {
        return MAX_ExperiencePoint;
    }

    public int getMIN_ExperiencePoint() {
        return MIN_ExperiencePoint;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public void setPokemons(List<List<String>> pokemons) {
        this.pokemons = pokemons;
    }

    public String getMapName() {
        return mapName;
    }

    public List<List<String>> getPokemons() {
        return pokemons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextAdventureMap textAdventureMap = (TextAdventureMap) o;
        return this.getMapName().equals(textAdventureMap.getMapName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapName, pokemons);
    }

    @Override
    public String toString() {
        return "Map{" +
                "mapName='" + mapName + '\'' +
                ", pokemons=" + pokemons +
                '}';
    }
}
