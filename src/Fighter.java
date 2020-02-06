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
    public Fighter(String n, String cC, String r){
        super(n,cC,r);
    }

    public void calcStats(){

    }

    public String toString(){
        String str = "";
        return str;
    }
}