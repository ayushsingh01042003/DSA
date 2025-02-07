import java.io.*;
import java.util.ArrayList;
import java.util.List;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(reader.readLine());

        long totalSum = (n * (n + 1)) / 2;

        if(totalSum % 2 == 1) {
            System.out.println("NO");
        } else {
            List<Long> set1 = new ArrayList<>();
            List<Long> set2 = new ArrayList<>();
            
            long maxElement = n;
            long set1Sum = 0;
            while(set1Sum < totalSum / 2) {
                long remainingSum = totalSum / 2 - set1Sum;
                
            }
        }
    }
}