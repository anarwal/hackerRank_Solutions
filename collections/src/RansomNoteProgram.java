/**
 * Created by abhimanyunarwal on 2/2/17.
 * HackRank-Ransom Note problem
 */

import java.util.*;

public class RansomNoteProgram {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public RansomNoteProgram(String magazine, String note) {
        magazineMap =new HashMap<String, Integer>();
        noteMap=new HashMap<String, Integer>();


        addMap(magazineMap, magazine);
        addMap(noteMap, note);
    }

    public void addMap(Map<String, Integer> map, String words){

        if (words == null)  return;

        // Split given string and put words in array
        String[] wordSet= words.split(" ");


        // Iterate through array and put value in map, increasing counter for each repeated word
        for(String word: wordSet) {
            if(!map.containsKey(word)){
                map.put(word, 1);
            }
            else {
                Integer counter = map.get(word);
                map.put(word,counter+1);
            }
        }

    }


    // compare magazine map and note map
    public boolean solve() {
        while (noteMap.size() <= magazineMap.size()) {
            for (String key : noteMap.keySet()) {
                if (!magazineMap.containsKey(key)) {
                    return false;
                }
                Integer magazineCounter = magazineMap.get(key);
                Integer noteCounter = noteMap.get(key);

                if (magazineCounter < noteCounter) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        RansomNoteProgram s = new RansomNoteProgram(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}

