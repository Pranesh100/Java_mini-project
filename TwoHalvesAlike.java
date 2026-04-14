public class TwoHalvesAlike{
    static boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    public static void main(String[] args){
        String s="book";
        int n=s.length();
        int c1=0,c2=0;

        for(int i=0;i<n/2;i++){
            if(isVowel(s.charAt(i))) c1++;
        }

        for(int i=n/2;i<n;i++){
            if(isVowel(s.charAt(i))) c2++;
        }

        System.out.println(c1==c2);
    }
}