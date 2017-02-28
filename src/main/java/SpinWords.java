//import java.util.Arrays;
//
///**
// * Created by brunovasquez on 10/27/2016.
// */
//public class SpinWords {
//
//
//    public String spinWords(String sentence) {
//        String[] words = sentence.split(" ");
//        StringBuilder builder = new StringBuilder();
//
//        for(String word : words){
//           if(builder.length()> 5) {
//              builder.reverse().append(word);
//           }else{
//               builder.append(word);
//           }
//        }
//        return builder.toString();
//
//        Arrays.stream(words)
//                .forEach(word -> builder.append(word.length() >= 5 ? reverseWord(word) + " " : word + " ") );
//        return builder.toString().trim();
//    }
//
//    private String reverseWord(String word) {
//        return new StringBuffer(word).reverse().toString();
//    }
//    }
//}

import java.util.Arrays;

/**
 * Created by AlvaroDaza on 10/27/2016.
 */
class SpinWords {

    private static final int WORD_MINIMUM_LENGTH = 5;
    private static final String SPACE_BETWEEN_WORDS = " ";

    String spinWords(String sentence) {
        String[] words = sentence.split(SPACE_BETWEEN_WORDS);
        StringBuilder newSentence = new StringBuilder();

        Arrays.stream(words)
                .forEach(word -> newSentence.append(word.length() >= WORD_MINIMUM_LENGTH ?
                        new StringBuilder(word).reverse().toString().concat(SPACE_BETWEEN_WORDS) :
                        word.concat(SPACE_BETWEEN_WORDS)));
        return newSentence.toString().trim();
    }
}
