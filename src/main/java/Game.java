
public class Game {
    public static void main(String[] args) {
      Prompter prompter = new Prompter();
      prompter.startGame();
      boolean won = false;
      int guesses = 0;
      while(!won){
          try{
            won = prompter.testGuess(prompter.askForGuess());
            guesses++;
          }catch(IllegalArgumentException iae){
            prompter.printTooHighMessage();
          }
           
      }
      prompter.printVictoryStatement(guesses);

      
    }

}
