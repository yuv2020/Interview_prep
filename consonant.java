/*  Count Consonants In a String
Given a string ‘STR’ which consists of uppercase and lowercase characters and spaces. 
Count the number of consonants in the string.A consonant is an English alphabet character that is 
not vowel (a, e, i, o, and u). Examples of constants are b, c, d, f, etc.
*/


public class consonant {
    public static void main(String[] args) {
        String str = "Hello World!";
        int count = count_consonant(str);
        System.out.println("Number of consonants in the string: " + count);

    }

    public static int count_consonant(String str){
        int count = 0;

        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
                || ch == 'A' || ch == 'E' || ch == 'I' || ch=='O' || ch == 'U')){
                count++;
            }
        }
        return count;
    }
    
}
