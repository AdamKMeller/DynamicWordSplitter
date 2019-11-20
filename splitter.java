
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adammeller
 */
public class splitter {

    HashMap<String, String> map = new HashMap<>();
    Trie dict;

    public splitter(Trie t) {
        dict = t;
    }

    public String split(String test) {
        if (dict.contains(test)) {
            return (test);
        } else if (map.containsKey(test)) {
            return (map.get(test));
        } else {
            for (int i = 0; i < test.length(); i++) {
                String pre = test.substring(0, i);
                if (dict.contains(pre)) {
                    String end = test.substring(i);
                    String fixedEnd = split(end);
                        if(fixedEnd != null){
                            map.put(test, pre + " " + fixedEnd);
                            return pre + " " + fixedEnd;
                        }
                    
                }
            }

        }
        map.put(test,null);
        return null;
    }
}
