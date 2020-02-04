import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> abilityScores = generateAbilityScores();
        System.out.println(abilityScores);

        // don't do this, use math excluding
        // the case of 1 (- 5), and 20 (+ 5)

        /*int str = 10;
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
        }*/
    }

    public static ArrayList<Integer> generateAbilityScores()
    {
        ArrayList<Integer> l = new ArrayList<Integer>();

        for (int i = 1; i <= 6; i++)
        {
            l.add(generateScore());
        }

        return l;
    }

    public static int generateScore(){
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i <= 4; i++)
        {
            int val = (int)((Math.random() * 6) + 1);
            l.add(val);
        }

        l = dropLowest(l);

        int score = 0;

        for (int v: l)
        {
            score += v;
        }

        return score;
    }

    public static ArrayList<Integer> dropLowest(ArrayList<Integer> l){
        Integer min = l.get(0);
        for (int v: l)
        {
            if (v < min)
            {
                min = v;
            }
        }
        l.remove(min);
        return l;
    }
}