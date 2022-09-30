public class ElectricPokemon extends Pokemon {

    private String lightningColor;
    private int ampere;


    public ElectricPokemon(String type, String name, int level, int hp, String sound, String lightningColor, int ampere) {
        super(type, name, level, hp, sound);
        this.lightningColor = lightningColor;
        this.ampere = ampere;
    }

}


