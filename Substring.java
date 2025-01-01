class Main{
    public static Boolean Solution(String s1,String s2){
        int pointer1=0;
        int pointer2=0;
        if(s1.length()>s2.length()){
            return false;
        }
        while(pointer2< s2.length()){
        if(s1.charAt(pointer1)==s2.charAt(pointer2)){
             pointer1++;
             if(pointer1==s1.length()){
                 return true;
             }
       } else{
            pointer2-=pointer1;
            pointer1=0;
        }
        pointer2++;
        }
        return false;
        }
    public static void main(String[] args){
        String s1="abc";
        String s2="xabdabczz";
        if (Solution(s1, s2)) {
            System.out.println("The string \"" + s1 + "\" is a substring of \"" + s2 + "\".");
        } else {
            System.out.println("The string \"" + s1 + "\" is not a substring of \"" + s2 + "\".");
        }
    }
}
