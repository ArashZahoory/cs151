package my.rps;

/**
 * This class is used to display the main menu
 * 
 * Methods: displayMainMenu
 * 
 *  Primary Author: AZ
 */
public class MainMenu extends Display
{

    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu()
    {
    }

    /**
     * This method prints out the main menu screen. At this moment it is
     * just an introduction to the game.
     * 
     */
    public void displayMainMenu()
    {
        System.out.println(
        "\nHello and welcome to the most remarkable Rock-Paper-Scissors Game in\n"
        +"history! We have painstakingly developed, with years of research, and\n"
        +"almost infinite hours of programing time, a game that will not only\n"
        +"entertain you, but will also distract you from your most important\n"
        +"priorities in life! Yes it IS that fun! Your money back, guaranteed!\n");
    }
}