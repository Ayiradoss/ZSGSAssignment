package stringutils;
public class Stringut{
     public String Concatenating(String a, String b){
        return a+b;
     }
     public String Reverse(String a){
        String s = "";
        for(int i=a.length()-1; i>=0;i--){
            s+= a.charAt(i);
        }
        return s;
     }
     public int strLength(String a){
         return a.length();
     }
}
