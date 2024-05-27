import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String words = scan.nextLine();
        String[] word = words.split("\\s+"); // Divide text to the words

        //Creating hashmap
        Map<String, Integer> wordCounts = new HashMap<>();


        for (String count : word) {
            if (wordCounts.containsKey(count)) {
                wordCounts.put(count, wordCounts.get(count) + 1);
            } else {
                wordCounts.put(count, 1);
            }
        }

        int maxCount = 0;
        String mostFrequentWord = "";

        // Finding most frequent word
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() >= maxCount) {

                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        System.out.println("En sık geçen kelime: " + mostFrequentWord + " (" + maxCount + " kez)");
    }
}