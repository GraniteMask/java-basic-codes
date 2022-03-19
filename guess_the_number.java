package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100); //100 since we are defining range from 0 to 100
    }
    int takeUserInput(){
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return  inputNumber;
    }
    boolean isCorrectNumber(int num){
        noOfGuesses ++;
        if(num==number){
            System.out.format("Yes you guessed it right. It was: %d\nYou Guessed it in %d attempts:", number, noOfGuesses);
            return true;
        }else if(num<number){
            System.out.println("Too Low...");
        }else if(num>number){
            System.out.println("Too High...");
        }
        return  false;
    }
}


public class guess_the_number {
    public static void main(String[] args){
      /*
          Create a class game, which allows a user to play "Guess the number" game once. Game should have the
          following methods:

          1. Constructor to generate the random number
          2. takeUserInput() to take a user input of number
          3. isCorrectNumber() to detect whether the number entered by the user is true
          4. getter and setter for noOfGuesses
          Use properties such as noOfGuesses(int), etc to get this task done!
       */
        Game g = new Game();
        boolean b = false;
        while(!b){
            int num = g.takeUserInput();
            b = g.isCorrectNumber(num);
            System.out.println(g);
        }

    }
}
