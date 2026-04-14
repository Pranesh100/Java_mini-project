public class FIrstFourWords {
    public static void main(String[] args){
        String input="hello how are you contestant";
        int k=4;
        String[] words=input.split(" ");
        for(int i=0;i<k;i++){
            System.out.print(words[i]+" ");
        }
    }
    
}

