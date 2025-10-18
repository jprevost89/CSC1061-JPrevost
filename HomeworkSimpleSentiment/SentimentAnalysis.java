/**
 * SentimentAnalysis.java
 * @author Jon Prevost
 * @since October 18, 2025
 */

import java.io.*;
import java.util.Scanner;

/**
 * Driver class for the SentimentAnalysis project.
 * Reads from sentiments file, writes them to a HashMap, 
 * and applies them to input text.
 */
public class SentimentAnalysis { // start class SentimentAnalysis
   
   /**
    * Main entry point of the program.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) throws IOException { // start
      MyHashMap<String, Integer> sentiments = new MyHashMap<>();

      BufferedReader br = new BufferedReader(new FileReader("sentiments.txt"));
      String line;
      while ((line = br.readLine()) != null) { // start while-loop
         String[] parts = line.split(",");
         if (parts.length == 2) {
            String phrase = parts[0].toLowerCase();
            int value = Integer.parseInt(parts[1]);
            sentiments.put(phrase, value);
         }
      } // end while-loop
      br.close();

      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter text (type END to stop):");

      int totalSentiment = 0;
      int wordCount = 0;
      String prevWord = "";

      while (true) { // start while-loop
         String input = scnr.nextLine();
         if (input.equals("END")) break;

         String[] words = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

         for (String word : words) { // start for-loop
            if (word.isEmpty()) continue;
               wordCount++;
   
            if (sentiments.containsKey(word)) {
               totalSentiment += sentiments.get(word);
            }
   
            if (!prevWord.isEmpty()) {
               String phrase = prevWord + " " + word;
               if (sentiments.containsKey(phrase)) {
                  totalSentiment += sentiments.get(phrase);
               }
            }
            prevWord = word;
         } // end for-loop
      } // end while-loop

      scnr.close();
      
      double average;
      if (wordCount == 0) {
         average = 0;
      } else {
         average = (double) totalSentiment / wordCount;
      }

      System.out.printf("Words: %d\nTotal sentiment: %d\nAverage sentiment: %.2f\n", wordCount, totalSentiment, average);
   } // end
} // start class SentimentAnalysis