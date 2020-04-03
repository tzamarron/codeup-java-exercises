package Notes;

import java.util.ArrayList;
import java.util.List;

public class testing {

    public boolean checkSum(Integer[] arr, int k){
        for(int a = 0; a < arr.length-1; ++a){
            for (int i = 1; i < arr.length; ++i){
                if (arr[a] + arr[i] == k){
                    System.out.println(arr[a] + " + " + arr[i] + " = " + k);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {


    }
}
