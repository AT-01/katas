package org.fundacionjala.katas.quiz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Stop gninnipS My sdroW!
 * Description:
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 */
final class SpinWords {

    /**
     * Constructor private.
     */
    private SpinWords() {
    }

    /**
     * takes in a string of one or more words, and returns the same string,
     * but with all five or more letter words reversed.
     *
     * @param text String with text.
     * @return the same string, but with all five or more letter words reversed.
     */
    static String spinWords(final String text) {
        final String regularExpression = "(\\w{5,})";
        Matcher matcher = Pattern.compile(regularExpression).matcher(text);
        String newText = text;
        while (matcher.find()) {
            String word = matcher.group();
            newText = newText.replaceAll(word, new StringBuilder(word).reverse().toString());
        }
        return newText;
    }
}
