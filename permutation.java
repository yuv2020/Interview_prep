public class permutation{

    public static void permute(String input, String output){
        int n = input.length();
        if(n == 0){
            System.out.print(output + " ");
            return;
        }

        else{
            for(int i=0;i<n;i++){
                char ch =  input.charAt(i);
                String remaining = input.substring(0,i) + input.substring(i+1,n);
                permute(remaining, output + ch);
            }
        }

    }
    public static void main(String[] args){
        String str = "java";

        permute(str, "");
    }
}