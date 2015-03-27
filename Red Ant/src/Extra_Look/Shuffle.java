package Extra_Look;

import java.util.ArrayList;
import java.util.List;

public class Shuffle {
    static ArrayList or = new ArrayList();
    public static ArrayList back = new ArrayList();
    static ArrayList pointer = new ArrayList();
    
    public ArrayList main(String org) {
        back.clear();
        or.clear();
        pointer.clear();
        pointer.add("");
        Shuffle s = new Shuffle();
        //String org = "open calculator";
        //s.shuffle(org);
        String sg = "";
        for (int t = 0; t < org.length(); t++ ) {
            if(org.charAt(t) == ' '){
                or.add(sg);
                sg = "";
            }
            else{
                sg += "" + org.charAt(t);
            }
        }
        or.add(sg);
        for(int t = 0; t < or.size(); t++){
            pointer.add("" + pointer.get(t) + or.get(t) + " ");
            //System.out.println(pointer.get(t));
        }
        String adder = "";
        for (int t = 0; t < or.size(); t++ ) {
            s.shuffle("" + or.get(t), t);
        }
        back.add(org);
        return back;
//        for (int t = 0; t < back.size(); t++ ) {
//            System.out.println(back.get(t));
//        }
    }

    public void shuffle(String input, int x) {
        for (int t = 0; t < input.length(); t++ ) {
            List<Character> characters = new ArrayList<Character>();
            for (char c : input.toCharArray()) {
                characters.add(c);
            }
            StringBuilder output = new StringBuilder(input.length());
            while (characters.size() != 0) {
                int randPicker = (int) (Math.random() * characters.size());
                output.append(characters.remove(randPicker));
            }
           back.add(pointer.get(x) + output.toString() + ".:.:.");
        }
    }
}
