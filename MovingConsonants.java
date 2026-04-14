public class MovingConsonants {
    public static void main(String[] args) {
        String s = "Rajkumar";
        char[] a = s.toCharArray();
        String v = "aeiouAEIOU";
        
        StringBuilder c = new StringBuilder();
        for(char ch : a) if(v.indexOf(ch)==-1) c.append(ch);
        
        if(c.length()>0){
            c.append(c.charAt(0));
            c.deleteCharAt(0);
        }
        
        int j=0;
        for(int i=0; i<a.length; i++)
            if(v.indexOf(a[i])==-1) a[i] = c.charAt(j++); 
        
        System.out.println(s + " → " + new String(a));
    }
}
