import java.util.Scanner;
public class Prompter{
  private Jar jar;
  private Scanner scanner = new Scanner(System.in);
  public Prompter(){

  }
  public void startGame(){
       System.out.println("What type of item");
      String item = scanner.nextLine();
      System.out.printf("What is the maximum amount of %s? %n", item);
      int maxNum = scanner.nextInt();
      jar = new Jar(item, maxNum);
      jar.fill();
  }
  public int askForGuess(){
     System.out.printf("How many %s are in the jar? Pick a number between 1 and %d. %n", jar.getItem() , jar.getMaxItems());
    return scanner.nextInt();
    
  }
  
  public void printVictoryStatement(int guesses){
    System.out.printf("You got it in %d attempt(s) %n", guesses);
  }
  public boolean testGuess(int guess){
    if(guess > jar.getMaxItems()){
      throw new IllegalArgumentException("Your guess must be less than "+jar.getMaxItems());
    }
    if(guess > jar.getCount()){
      System.out.println("Your guess is too high"); 
    }
    else if(guess < jar.getCount()){
      System.out.println("Your guess is too low"); 
    }
    return guess==jar.getCount();
  }
  public void printTooHighMessage(){
    System.out.println("Your guess must be less than "+jar.getMaxItems());
    System.out.println("Attempt not counted");
  }
}
