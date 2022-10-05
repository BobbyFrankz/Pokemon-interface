import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner {
   String name;
   List<Pokemon> pokemons;

    public PokemonGymOwner(String name) {
        this.name = name;
    }
    Pokemon charizard = new FirePokemon("charizard", 99, 320,"Lucifers", "GROAAWLLL!");
    Pokemon blastoise = new WaterPokemon("blastoise", 91, 290, "Bubbles","SPLASH!");
    Pokemon venusaur = new GrassPokemon("venusaur", 92, 280,"MEATLOAF", "GRAAASSSS!");
    Pokemon ditto = new GrassPokemon("ditto", 59, 180, "Fresh air","BLOB!");
    Pokemon raichu = new ElectricPokemon("raichu", 76, 270, "Thunder cakes","FETJOEW!");
    Pokemon gyarados = new WaterPokemon("gyarados", 95, 360,"Little Fish", "RAWRRR!");

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(Pokemon charizard) {
        this.charizard = charizard;
    }

    public Pokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(Pokemon blastoise) {
        this.blastoise = blastoise;
    }

    public Pokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(Pokemon venusaur) {
        this.venusaur = venusaur;
    }

    public Pokemon getDitto() {
        return ditto;
    }

    public void setDitto(Pokemon ditto) {
        this.ditto = ditto;
    }

    public Pokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(Pokemon raichu) {
        this.raichu = raichu;
    }

    public Pokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(Pokemon gyarados) {
        this.gyarados = gyarados;
    }

    public List<Pokemon> getPokemonList() {
    return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());


 }

}
