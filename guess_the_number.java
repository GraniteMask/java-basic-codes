package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    void Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100); //100 since we are defining range from 0 to 100
    }
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(int num){
        if(num==number){
            return true;
        }else{
            return  false;
        }
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

    }
}
