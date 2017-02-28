import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Stop gninnipS My sdroW!
 * <p>
 * Description:
 * <p>
 * Write a function that takes in a string of one or more words, and returns the same string, but with all five or more
 * letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 * <p>
 * Examples:
 * <p>
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 * spinWords( "This is a test") => returns "This is a test"
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 */
public class SpinWords {

    private static final int LIMIT_LETTERS = 5;
    private static final String SPACE = " ";

    /**
     * Reverse all the words in a string that has more or equal to 5 letters.
     *
     * @param welcome is the input string to reverse.
     * @return the string with the correct word reversed.
     */
    static String spinWords(String welcome) {
        return Arrays.stream(welcome.split(SPACE))
                .map(word -> word.length() >= LIMIT_LETTERS ? new StringBuilder(word).reverse() : word)
                .collect(Collectors.joining(SPACE));
    }
}
