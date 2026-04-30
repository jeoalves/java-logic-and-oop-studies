import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> secretWords = new ArrayList<>();
        secretWords.add("snake");
        secretWords.add("elephant");
        secretWords.add("giraffe");

        Random random = new Random();
        int indexOfTheAlleatoryWord = random.nextInt(secretWords.size());
        String secretWord = secretWords.get(indexOfTheAlleatoryWord);

        ArrayList<Character> letters = new ArrayList<>();
        for( int i = 0; i < secretWord.length(); i++ ){
            letters.add('_');
        }

        int attempts = 6;
        boolean wordDiscovered = false;

        while (!wordDiscovered && attempts > 0) {
            System.out.println();
            System.out.println("Can you guess the word? " + letters );
            System.out.print("Please write the letter: ");
            char guess = scanner.next().charAt(0);

            boolean right = false;  
            for(int i = 0; i< secretWord.length(); i++ ){
                if(secretWord.charAt(i) == guess){
                    letters.set(i, guess);
                    right = true;
                }
            }
            if(!right){
                attempts--;
                System.out.println("You got it wrong, you have  " + attempts + " attempts" );
            }
            wordDiscovered = !letters.contains('_');
        }
        if(wordDiscovered){
            System.out.println("You got it! The secret word was " + secretWord);
        }else{
            System.out.println("You lose, please try again.");
        }
    }
}