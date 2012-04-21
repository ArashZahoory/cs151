package my.rps;

/**
 * Abstract class Display - Any class that extends this 
 * abstract class:  communicates information to the user, 
 * and utilizes an Input object to retrieve the information 
 * that it asks from the user.  Also this abstract class 
 * contains a method to display help to the screen when 
 * requested by the user, which it inherits to its sublcasses.
 * 
 * Methods:  displayHelp
 *
 *  Primary Author: AZ
 *
 */
public abstract class Display
{
    // instance variables - replace the example below with your own

    /**
     * This method displays the rules of the game to the user.  It
     * then prints and returns the user to the last prompt that 
     * was given before the user requested help.
     * 
     */
    public void displayRules()
    {
        String rules = (
        "\nThe game of Rock-Paper-Scissors is not only simple to learn,\n"
        +"it is also fun to play too! The way that the game works is\n"
        +"that the player (you) must choose how many rounds that they\n"
        +"wish to play against the computer. The number of rounds that\n"
        +"the player chooses distinguishes how long a Match will be.\n\n"
        +"Each round consists of the player deciding between playing\n"
        +"either Rock, Paper, or Scissors as their weapon of choice.\n"
        +"The player with the more powerful weapon wins the round. It\n"
        +"is easy to remember which weapon wins in a round. Rock beats\n"
        +"Scissors, Scissors beats Paper, and Paper beats Rock. Now\n"
        +"that you know how to play Rock-Paper-Scissors, try your luck\n"
        +"against the Computer! Whoever wins the majority of rounds in\n"
        +"a match wins!!\n");
    }
    
    /**
     * This method displays information for the user on how to play the game.  
     * 
     */
    public void displayHelp()
    {
        System.out.println(
        "\nTo play the Rock-Paper-Scissors game, user needs to enter an\n"
        +"input when prompted for a 'throw' choice by the computer:\n"
        +"To play 'Rock' type in 'r'.\n"
        +"To play 'Paper' type in 'p'.\n"
        +"To play 'Scissors' type in 's'.\n");
    }
    
    public void invalidStartupError()
    {
        System.out.println("");
        System.out.println("Invalid startup");
        System.out.println("");
        System.out.println("  java GameSystem <Rounds per match> <Difficulty Level>");
        System.out.println("");
        System.out.println("    Rounds per match -- The number of rounds you would like to play (e.g. 5)");
        System.out.println("    Difficulty Level -- Enter \"random\" for easy, or enter \"smart\" for hard.");
        System.out.println("");
    }
    
    public void invalidSelection()
    {
        System.out.println("");
        System.out.println("Invalid selection.  Please try again.");
        System.out.println("");
    }
}