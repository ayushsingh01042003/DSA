import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- > 0) {
            int n = in.nextInt();
            in.nextLine();

            char[][] arr = new char[n][4];
            for(int i = 0; i < n; i++) {
                String s = in.nextLine();
                for(int j = 0; j < 4; j++) {
                    arr[i][j] = s.charAt(j); 
                }
            }

            for(int i = n - 1; i >= 0; i++) {
                for(int j = 0; j < 4; j++) {
                    if(arr[i][j] == '#') {
                        System.out.print((j + 1) + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}