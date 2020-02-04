public class Wizard extends Race{
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
    public Wizard(String n, String cC, String align, String r){
        super(n,cC,align,r);
    }

    public void calcStats(){

    }

    public String toString(){
        String str = "";
        return str;
    }
}