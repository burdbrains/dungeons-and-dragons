import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> abilityScores = generateAbilityScores();

        int str = 10;
        int strRaceMod = 2;
        str += strRaceMod;

        int strMod = 0;

        switch(str)
        {
            case 1:
                strMod = -5;
                break;
            case 2:
            case 3:
                strMod = -4;
                break;
            default: // Last case
                break;
        }

    }

    public static ArrayList<Integer> generateAbilityScores(){
        ArrayList<Integer> l = new ArrayList<Integer>();
        return l;
    }
    public static int generateScore(){
        return 1;
    }
    public static ArrayList<Integer> dropLowest(ArrayList<Integer> l){
        return l;
    }
}