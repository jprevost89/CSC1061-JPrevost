import java.util.ArrayList;


class Paragraph { //start class Paragraph


   private ArrayList<String> sentences = new ArrayList<String>();
   
   public void addSentence(String sentence) { //start addSentence
      sentences.add(sentence + "\n"); // add newline to end of each sentence to make paragraphs easier to create
   } //end addSentence
   
   public void print() { //start print
      for( int i = 0; i < sentences.size(); ++i ) {
         System.out.println(sentences.get(i));
      }
   } //end print
   
   public void clearSentences() { // start clearSentences
      sentences.clear();
   } // end clearSentences
   
   public ArrayList<String> getParagraph() { // start getParagraph
      return sentences;
   } // end getParagraph
   
   
} //end class Paragraph