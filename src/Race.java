import java.util.ArrayList;

public abstract class Race extends Character {
    //    ATTRIBUTES
    //    RACe
    protected String race;

    //    ABILITIES
    private int speed;
    protected int STR;
    protected int DEX;
    protected int CON;
    protected int INT;
    protected int WIS;
    protected int CHA;
    protected int strMod;
    protected int dexMod;
    protected int conMod;
    protected int intMod;
    protected int wisMod;
    protected int chaMod;
    /*private int STRraceMod = 0;
    private int DEXraceMod = 0;
    private int CONraceMod = 0;
    private int INTraceMod = 0;
    private int WISraceMod = 0;
    private int CHAraceMod = 0;*/

    //CONSTRUCTOR
    public Race(String n, String cC, String r, ArrayList<Integer> statsArr) {
        super(n,cC);
        this.race = r;
        this.STR = statsArr.get(0);
        this.DEX = statsArr.get(1);
        this.CON = statsArr.get(2);
        this.INT = statsArr.get(3);
        this.WIS = statsArr.get(4);
        this.CHA = statsArr.get(5);
    }

    public void racialApp() {
        // Body of functions
        if (this.race == "Human")
        {
            this.speed = 30;
        }
        else if (this.race == "Dwarf")
        {
            this.speed = 20;
            this.CON += 2;
            this.CHA -= 2;
        }
        else if (this.race == "Elf")
        {
            this.speed = 30;
            this.DEX += 2;
            this.CON -= 2;
        }
        else if (this.race == "Gnome")
        {
            this.speed = 20;
            this.DEX += 2;
            this.STR -= 2;
        }
        else if (this.race == "Halfling")
        {
            this.speed = 20;
            this.DEX += 2;
            this.STR -= 2;
        }

        calcMods();
    }
    //
    public void calcMods() // calculate ability mods
    {
        this.strMod = ((this.STR/2) + (-5));
        this.dexMod = ((this.DEX/2) + (-5));
        this.conMod = ((this.CON/2) + (-5));
        this.intMod = ((this.INT/2) + (-5));
        this.wisMod = ((this.WIS/2) + (-5));
        this.chaMod = ((this.CHA/2) + (-5));
    }
    public abstract void calcStats();
}