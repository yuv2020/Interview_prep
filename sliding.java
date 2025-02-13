import java.util.*;

public class sliding {
    public static void main(String[] args) {
        int[] arr = {3,8,2,5,7,6,12};
        int w = 5;

        System.out.println("Maximum sum of a " + w + "-sized window is " + window(arr, w));
        // System.out.println(window(arr, w));

    }

    public static int window(int[] arr, int w){
        int curr = 0;

        for(int i = 0; i < w; i++){
            curr += arr[i];
        }
        int mxx = curr;
        int n = arr.length;
        for(int i=1; i<=n-w; i++){
            curr = curr-arr[i-1] + arr[i+w-1];
            if(curr > mxx){
                mxx = curr;
            }
        }
        return mxx;

    }
    
}
