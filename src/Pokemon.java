public abstract class Pokemon {



    private final String type;
    private final String name;
    private int level;
    private int hp;
    private String sound;
    private String food;



    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Pokemon(String type, String name, int level, int hp, String food, String sound) {
        this.type = type;
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

}

