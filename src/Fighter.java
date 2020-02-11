import java.util.ArrayList;

public class Fighter extends Race{
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
    public Fighter(String n, String cC, String r, ArrayList<Integer> statsArr){
        super(n,cC,r, statsArr);
    }

    public void calcStats(){
        racialApp();
        this.hitPoints = 10 + this.conMod;
        this.throwSTR = 2 + this.strMod;
        this.throwCHA = 2 + this.chaMod;
    }

    public String toString(){
        calcStats();
        String str0 = "\nLevel 1 " + this.race + " Fighter" + "\nHitpoints: " + this.hitPoints;
        String str1 = "\nStrength: " + this.STR + "\nStrength Mod: " + this.throwSTR;
        String str2 = "\nDexterity: " + this.DEX + "\nDexterity Mod: " + this.dexMod;
        String str3 = "\nConstitution: " + this.CON + "\nConstitution Mod: " + this.conMod;
        String str4 = "\nWisdom: " + this.WIS + "\nWisdom Mod: " + this.wisMod;
        String str5 = "\nIntelligence: " + this.INT + "\nIntelligence Mod: " + this.intMod;
        String str6 = "\nCharisma: " + this.CHA + "\nCharisma Mod: " + this.throwCHA;
        String str = str0 + str1 + str2 + str3 + str4 + str5 + str6;
        return str;
    }
}