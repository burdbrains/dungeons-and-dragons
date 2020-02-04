public abstract class Race extends Character {
    //    ATTRIBUTES
    //    RACE
    private String race;

    //    ABILITIES
    private int speed;
    private int STR;
    private int DEX;
    private int CON;
    private int INT;
    private int WIS;
    private int CHA;
    private int strMod = 0;
    private int dexMod = 0;
    private int conMod = 0;
    private int intMod = 0;
    private int wisMod = 0;
    private int chaMod = 0;
    private int STRraceMod = 0;
    private int DEXraceMod = 0;
    private int CONraceMod = 0;
    private int INTraceMod = 0;
    private int WISraceMod = 0;
    private int CHAraceMod = 0;

    //CONSTRUCTOR
    public Race(String n, String cC, String align, String r) {
        super(n,cC,align);
        this.race = r;
    }

    public void racialApp() {
        // Body of functions
        if (this.race == "Human")
        {}
        else if (this.race == "Dwarf")
        {}
        else if (this.race == "Elf")
        {}
        else if (this.race == "Gnome")
        {}
        else if (this.race == "Halfling")
        {}

        calcMods();
    }
    //
    public void calcMods() // calculate ability mods
    {
    }
    public abstract void calcStats();
}