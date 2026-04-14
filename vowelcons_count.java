import java.io.*;
public class vowelcons_count{
    public static void main(String[] args) {
        int v=0,c=0;
        try{
            FileReader fr=new FileReader("student_info.txt");
            BufferedReader br=new BufferedReader(fr);
            String s=br.readLine();
            while(s!=null){
                String arr[]=s.split(" ");
                for(int i=0;i<arr.length;i++){
                    String word=arr[i];
                    for(int j=0;j<word.length();j++){
                        char ch=word.charAt(j);
                        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U'){
                            v++;
                        }else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                            c++;
                        }
                    }
                }
                s=br.readLine();
            }
            System.out.println(v);
            System.out.println(c);
        }catch(IOException e){
            System.out.println("Error");
    }
}
}