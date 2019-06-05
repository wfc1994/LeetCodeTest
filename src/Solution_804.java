import java.util.ArrayList;
import java.util.HashMap;

public class Solution_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] word = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashMap<Character,String> morse = new HashMap();
        for(int i=0;i< code.length;i++){
            morse.put(word[i],code[i]);
        }

        ArrayList<String> list = new ArrayList<>();
        for(String w : words){
            char[] temp = w.toCharArray();
            String s = "";
            for(char v : temp){
                s = s + morse.get(v);
            }
            list.add(s);
        }

        int[] count = new int[list.size()];
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    count[j]=1;
                }
            }
        }

        int result = 0;
        for(int i=0;i<count.length;i++){
            if(count[i]==0){
                result = result+1;
            }
        }
        return result;
    }

    public static void main(String[] args){
        String[] words = {"gin", "zen", "gig", "msg"};
        Solution_804 solution = new Solution_804();
        solution.uniqueMorseRepresentations(words);
    }

}
