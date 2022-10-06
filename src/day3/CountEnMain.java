package day3;

import java.util.HashMap;

public class CountEnMain {
    public static void main(String[] args) {
        String str = "https://github.com/cvivis/git_exercices".toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (isAlphabet(str.charAt(i))) {
                if(map.get(str.charAt(i))!=null){ // 처음엔 아무것도 없어서 Null 가리킴
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                }else{
                    map.put(str.charAt(i), 1);
                }
            }
        }
        System.out.println(map);
    }
    public static boolean isAlphabet(char c){
        if(c >= 'a' && c <= 'z'){
            return true;
        }else{
            return false;
        }
    }
}
