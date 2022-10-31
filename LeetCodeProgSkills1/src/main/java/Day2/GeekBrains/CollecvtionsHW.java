package Day2.GeekBrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class CollecvtionsHW {
    public static void main(String[] args) {
     ArrayList<String> words = new ArrayList<>();
     words.add("java");
     words.add("java");
     words.add("linux");
     words.add("score");
     words.add("score");
     words.add("score");
     words.add("phone");
     words.add("bottle");
     words.add("time");
     words.add("sound");

     System.out.println(words);
     countWords(words);
    }

    public static void countWords(ArrayList<String> words){
        HashMap<String,Integer> wordsToCount = new HashMap<>();

        for (String word:words) {
            if(!wordsToCount.containsKey(word)){
                wordsToCount.put(word, 1);
            } else {
                wordsToCount.put(word, wordsToCount.get(word) + 1);
            }
        }

        System.out.println(wordsToCount);
    }
    public static void printList(ArrayList<String> words){
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).contains("java")){
                words.remove(i);
            } else if (words.get(i).contains("score")) {
                words.remove(i);
            }
        }
        System.out.println(words);
    }

    public static int countUnique(ArrayList<String> words){
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).contains("java")){
                count++;
            } else if (words.get(i).contains("score")) {
                count++;
            }
        }
        return count;
    }
}
