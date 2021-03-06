public class Character {
    //ATTRIBUTES
    private String name;
    private String charClass;
    private final int LEVEL = 1;

    //CONSTRUCTORS
    public Character(String name, String cClass){
        this.name = name;
        this.charClass = cClass;
    }

    //METHODS
    public void setName(String n) { name = n; }
    public String getName() { return name; }

    public void setCharClass(String c){ charClass = c; }
    public String getCharClass(){ return charClass; }

    public int getLevel(){ return LEVEL; }
}