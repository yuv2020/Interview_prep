
// Check the String that it is palindrome or not

public class palindrome {
    public static void main(String[] args) {
        String str = "mdam";

        // if(isPalindrome(str)){
        //     System.out.println(str + " is a palindrome");
        // }
        // else{
        //     System.out.println(str + " is not a palindrome");
        // }

        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome);               
        
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
    
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
    
}
