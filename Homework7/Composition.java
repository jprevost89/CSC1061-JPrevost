import java.util.ArrayList;
import java.util.Scanner;


class Composition { // start class Composition


   Scanner scnr = new Scanner(System.in);
   Paragraph para = new Paragraph();
   
   private ArrayList<String> paragraphs = new ArrayList<String>();
   private int currentParagraph = 1;
   
   public void addSentence() { // start addSentence
      String sentence = scnr.nextLine();
      Sentence sent = new Sentence(sentence);
      sent.print();
      para.addSentence(sentence);
   } // end addSentence
   
   public void addParagraph() { // start addParagraph
      String result = "";
      ArrayList<String> fullComp = para.getParagraph();
      
      /* 
      Grab current Paragraph values and convert into 
      a single String and add that string to paragraphs 
      ArrayList 
      */
      
      for ( int i = 0; i < fullComp.size(); ++i ) {
         result += fullComp.get(i); 
      }
      paragraphs.add(result);
      
      para.clearSentences(); // clear sentences from Paragraph class since the values are now stored in Composition
      currentParagraph += 1;
   } // end addParagraph
   
   public void print() { // start print
      System.out.println();
      for ( int i = 0; i < paragraphs.size(); ++i ) {
         System.out.println(paragraphs.get(i));
      }
      System.out.println();
   } // end print
   
   
} // end class Composition