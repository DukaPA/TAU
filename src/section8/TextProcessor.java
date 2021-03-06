package section8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I visited test automation university!");
        reverseString("Hello TAU");
        addSpaces("HelloDusan.It'sABrandNewDay!");
    }

    /**
     * Add space before each capitol letter
     * @param text  jumbled text
     */
    private static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(" ");
        System.out.println(modifiedText);
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words: ",numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }
    public static void reverseString(String text){
        for (int i = text.length()-1; i >=0 ; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
