import java.util.ArrayList;

public class Cleric extends Race{
    // ATTRIBUTES
    private int hitPoints;
    public int proficiency;
    private int throwSTR;
    private int throwDEX;
    private int throwCON;
    private int throwWIS;
    private int throwINT;
    private int throwCHA;

    // CONSTRUCTOR
    public Cleric(String n, String cC, String r, ArrayList<Integer> statsArr){
        super(n,cC,r, statsArr);
    }

    public void calcStats(){
        racialApp();
        this.hitPoints = 8 + this.conMod;
        this.throwWIS = 2 + this.wisMod;
        this.throwCHA = 2 + this.chaMod;
    }

    public String toString(){
        calcStats();
        String str0 = "\nLevel 1 " + this.race + " Wizard" + "\nHitpoints: " + this.hitPoints;
        String str1 = "\nStrength: " + this.STR + "\nStrength Mod: " + this.strMod;
        String str2 = "\nDexterity: " + this.DEX + "\nDexterity Mod: " + this.dexMod;
        String str3 = "\nConstitution: " + this.CON + "\nConstitution Mod: " + this.conMod;
        String str4 = "\nWisdom: " + this.WIS + "\nWisdom Mod: " + this.throwWIS;
        String str5 = "\nIntelligence: " + this.INT + "\nIntelligence Mod: " + this.intMod;
        String str6 = "\nCharisma: " + this.CHA + "\nCharisma Mod: " + this.throwCHA;
        String str = str0 + str1 + str2 + str3 + str4 + str5 + str6;
        return str;
    }
}