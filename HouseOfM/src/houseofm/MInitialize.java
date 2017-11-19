/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseofm;
import javax.swing.JOptionPane;
/**
 *
 * @author bryanc
 */
//Initializes values used in introduction of program
public class MInitialize {
    
    public static MFirstFloorExplore mffe = new MFirstFloorExplore();
    public MElevator getElevator = new MElevator();
    public String playerName;
    //Note: Each room, including the front door, will ask the player where they want to go.
    //This first introduction is mostly the backstory of the house and the player entering the house.
    public String errorMessage = "Sorry, invalid input. Try again.";
    public String question = "What will you do?";
    public String cl = "Current location:";
    
    //Introduction method
    public void Introduction()
    {
        playerName = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "\"Welcome to the Haunted Tower, " + playerName + "! are you ready?\"");
        getElevator.elevatorLoop();
        
    }
    
    
}
