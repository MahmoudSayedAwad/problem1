package problem1;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        boolean f = true;

        for (int j = 0; j < t; j++) {
            int n = scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
              
            }
             for (int k = 1; k < n; k++) {
                    if(arr[k]%arr[0]==0){
                    f=true;
                    }else{
                    f=false;
                    break;
                    }

                }
            if(f){
                System.out.println("YES");
            }else{
            System.out.println("NO");
            }

        }
    }

}

