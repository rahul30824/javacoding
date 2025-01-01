import java.util.*;
class Main{
    public static String Solution(String s){
        HashSet<Character>set=new HashSet<>();
        StringBuilder unique=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
     if(!set.contains(c)){
         set.add(c);
         unique.append(c);
     }
    }
    return unique.toString();
    }
   public static void main(String[] args) {
       String s="programming";
        System.out.print(Solution(s));
   }
}
