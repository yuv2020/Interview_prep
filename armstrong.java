public class armstrong {
    public static void main(String[] args){
        int n = 2;

        if(isarmstrong(n)){
            System.out.println(n + " is an Armstrong number");
        }

        else{
            System.out.println(n + " is not an Armstrong number");
        }
    }

    public static boolean isarmstrong(int num){
        int sum = 0;
        int digits = 0;

        int temp = num;
        while(temp > 0){
            digits++;
            temp/=10;
        }

        temp = num;
        while(temp>0){
            int digit = temp  % 10;
            sum += Math.pow(digit, digits);
            temp/=10;
        }

        return sum == num;
    }
    
}
