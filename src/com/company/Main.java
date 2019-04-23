package com.company;

import com.sun.media.sound.SoftTuning;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    /*
    Create an application which will prompt the user to enter the name of their favorite Movie. Add the Movie to an array
    list.  Use a loop to continue adding movies to the array until the user presses q or Q.
    Once the user presses Q then print the list of movies before exiting the program.
    HINT: You can use the .toLowerCase() method of the String class to convert the 'Q' to 'q'. So if your response is
    stored in a variable called userAnswer then userAnswer.toLowerCase() will evaluate to a 'q'. Alternatively, you can
    use the userAnswer.equalsIgnoreCase("q") method.

     BONUS: Print out the list of movies sorted in alphabetical order.

     BONUS x2: Suggest a movie to the user to watch by randomly selecting a movie from the list of movies entered.
     */
        Random randomGen;
        Boolean movies = true;
        String myMovie;


        randomGen = new Random();
        ArrayList<String> usermovies = new <String>ArrayList();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("If you would like to exit enter 'q' ");
        System.out.println("Enter the name of your favorite Movie:");

        while(movies ==true){
            myMovie = keyboard.nextLine();

            if (myMovie.equalsIgnoreCase("q")){
                movies = false;
                Collections.sort(usermovies);
                System.out.println(usermovies);
                int randomNum = randomGen.nextInt(usermovies.size());
                System.out.println("You should watch: " + usermovies.get(randomNum));

                break;
            }

            else{
                usermovies.add(myMovie);
                System.out.println("Movie added!");


            }


        }



    }
}
