package org.fundacionjala.exam;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Class to reverse words that have more than 5 letters -- SpinWord kata.
 */
public class SpinWords {

    /**
     * Method tha make the operations to revert words.
     *
     * @param word String with the word to be reverted.
     * @return a String with the word reverted.
     */
    public static String spinWords(String word) {
        String[] partialString = word.split(" ");
        return Arrays.stream(partialString)
                .map(text -> text.length() >= 5 ? new StringBuilder(text).reverse() : text)
                .collect(Collectors.joining(" "))
                .trim();
    }
}
