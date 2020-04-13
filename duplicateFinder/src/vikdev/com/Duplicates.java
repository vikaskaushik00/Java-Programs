package vikdev.com;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Duplicates {
    private static  Map<Character,Integer> map =  new HashMap<>();

    private String string;
    public Duplicates(String string){
        this.string = string.toUpperCase();
    }
    public void finder(){

        char[] character = this.string.toCharArray();
        for (Character ch : character){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println("Duplicates are : ");
        Set<Character> keys = map.keySet();
        for (Character ch : keys){
            if (map.get(ch) > 1 && ch != ' '){
                System.out.println(ch+" : is present "+map.get(ch)+" times");
            }
        }
    }
}
