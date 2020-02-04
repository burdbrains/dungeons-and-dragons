public class Character {
    //ATTRIBUTES
    private String name;
    private String charClass;
    private String alignment;
    private final int LEVEL = 1;

    //CONSTRUCTORS
    public Character(String name, String cClass, String align){
        this.name = name;
        this.charClass = cClass;
        this.alignment=align;
    }

    //METHODS
    public void setName(String n) { name = n; }
    public String getName() { return name; }

    public void setCharClass(String c){ charClass = c; }
    public String getCharClass(){ return charClass; }

    public int getLevel(){ return LEVEL; }

    public void setAlignment(String a) { alignment = a; }
    public String getAlignment(){ return alignment; }
}