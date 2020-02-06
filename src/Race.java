import java.util.ArrayList;

public abstract class Race extends Character {
    //    ATTRIBUTES
    //    RACe
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
        this.strMod += ((this.strMod/2) + (-5));
        this.dexMod += ((this.dexMod/2) + (-5));
        this.conMod += ((this.conMod/2) + (-5));
        this.intMod += ((this.intMod/2) + (-5));
        this.wisMod += ((this.wisMod/2) + (-5));
        this.chaMod += ((this.chaMod/2) + (-5));
    }
    public abstract void calcStats();
}