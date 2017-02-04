/**
 * Created by abhimanyunarwal on 2/2/17.
 */

//HackRank-Ransom Note problem

import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public Solution(String magazine, String note) {
        magazineMap =new HashMap<String, Integer>();
        noteMap=new HashMap<String, Integer>();
        String[] magazineValues= magazine.split(" ");
        String[] noteValues=note.split(" ");
        for(int i=0; i<=magazineValues.length-1;i++){
            magazineMap.put(magazineValues[i], i+1);
        }
        for(int j=0; j<noteValues.length-1; j++){
            noteMap.put(noteValues[j], j+1);
        }
    }


    public boolean solve() {

        while (noteMap.size() <= magazineMap.size()) {
            for (String y : noteMap.keySet()) {
                if (!magazineMap.containsKey(y)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}

