public class permutation{

    public static void permute(String input, String output){
        int n = input.length();
        if(n == 0){
            System.out.println(output);
            return;
        }

        else{
            for(int i=0;i<n;i++){
                permute(input.substring(0,i) + " " + input.substring(i+1) + " " + input.charAt(i));
            }
        }

    }
    public static void main(String[] args){
               
    }
}