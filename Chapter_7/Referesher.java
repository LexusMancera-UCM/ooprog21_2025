import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public int countGreaterThanPreviousAverage(List<Integer> responseTimes) {
        
        if (responseTimes.size() < 2) {
            return 0;
        }

        int count = 0;

        for (int i = 1; i < responseTimes.size(); i++) {
            
            double sumOfPrevious = 0;
            int numOfPrevious = i;
            
            for (int j = 0; j < i; j++) {
                sumOfPrevious = sumOfPrevious + responseTimes.get(j);
            }
            
            double averageOfPrevious = sumOfPrevious / numOfPrevious;
            
            int currentElement = responseTimes.get(i);
            
            if (currentElement > averageOfPrevious) {
                count = count + 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        List<Integer> responseTimes1 = new ArrayList<>(Arrays.asList(100, 200, 150, 300));
        
        System.out.println("Input");
        System.out.println("responseTimes = [100, 200, 150,300]");
        
        System.out.println("\nOutput");
        System.out.println(sol.countGreaterThanPreviousAverage(responseTimes1));
    }
}
