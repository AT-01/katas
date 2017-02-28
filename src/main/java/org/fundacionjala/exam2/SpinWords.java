package org.fundacionjala.exam2;

import java.util.Arrays;

/**
 * Reverse one or more words in a sentence.
 */
class SpinWords {

    private static final int WORD_MINIMUM_LENGTH = 5;
    private static final String SPACE_BETWEEN_WORDS = " ";

    /**
     * Construct the new sentence.
     *
     * @param sentenceToConvert String whit the sentence.
     * @return String Whit the new sentence.
     */
    String spinWords(final String sentenceToConvert) {
        String[] sentence = sentenceToConvert.split(" ");
        StringBuilder newSentence = new StringBuilder();
        Arrays.stream(sentence)
                .forEach(word -> newSentence.append(word.length() >= WORD_MINIMUM_LENGTH ? reverseWord(word)
                        + SPACE_BETWEEN_WORDS : word + SPACE_BETWEEN_WORDS));
        return newSentence.toString().trim();
    }

    /**
     * Reverse a word.
     *
     * @param word String whit the word.
     * @return String A reversed word.
     */
    private String reverseWord(final String word) {
        return new StringBuffer(word).reverse().toString();
    }
}
