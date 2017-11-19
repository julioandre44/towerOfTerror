/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseofm;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author bryanc
 */

public class MFirstFloorExplore {    
    public static MSecondFloorExplore msfe = new MSecondFloorExplore();
    public static MInitialize mi = new MInitialize();
    public static MElevator getElevator = new MElevator();
    //images used in methods
    public static ImageIcon iconFD = new ImageIcon("1st floor front door.png");
    public static ImageIcon iconDR = new ImageIcon("1st floor dining room.png"); 
    public static ImageIcon iconLR = new ImageIcon("1st floor living room.png");
    public static ImageIcon iconST = new ImageIcon("1st floor stairs.png");
    public static ImageIcon iconKI = new ImageIcon("1st floor kitchen.png");
    public static ImageIcon iconPA = new ImageIcon("1st floor pantry.png");
    public static ImageIcon iconBA1 = new ImageIcon("1st floor bathroom.png");
    public static ImageIcon iconGhost = new ImageIcon("scaryGhost.jpg");
    public static ImageIcon iconMirror = new ImageIcon("bloodyMirror.jpg");
    public static ImageIcon iconShower = new ImageIcon("SteamyBathroom.jpg");
    public static ImageIcon iconCandelabra = new ImageIcon("candelabra.jpeg");
    public static ImageIcon iconFridge = new ImageIcon("fridge.jpg");
    public static ImageIcon iconCabinets = new ImageIcon("flyingDishes.jpg");
    public static ImageIcon iconBroom = new ImageIcon("enchantedBroom.jpg");
    public static ImageIcon iconBook = new ImageIcon("enchantedBook.jpg");
    
    //creates method for dining room floor
    public void diningRoom() {
        
        String playerResponseDR = "";
        String choicesDR = "\nGo back to \"elevator\"";
        JOptionPane.showMessageDialog(null, "", "magic lights appear out of nowhere", JOptionPane.INFORMATION_MESSAGE, iconCandelabra);
        playerResponseDR = JOptionPane.showInputDialog(mi.question + choicesDR);
        while (!playerResponseDR.toLowerCase().equals("elevator")) {
            playerResponseDR = JOptionPane.showInputDialog(mi.errorMessage + choicesDR);
        }
        switch (playerResponseDR.toLowerCase()) {
            case "elevator":
                getElevator.elevatorLoop();
                break;
            default:
                break;
        }
    }
    //creates method for living room floor
    public void livingRoom() {
        String playerResponseLR= "";
        String choicesLR =  " \nChoices: \n\"chest\" \n\"elevator\" \n\"bathroom\"";
        playerResponseLR = JOptionPane.showInputDialog(mi.question + choicesLR);
        do
        {
            switch (playerResponseLR.toLowerCase()) 
            {
            case "elevator":
                getElevator.elevatorLoop();
                break;
            case "bathroom":
                bathroom1();
                break;
            case "chest":
                JOptionPane.showMessageDialog(null, "", "BOOOOOOO", JOptionPane.INFORMATION_MESSAGE, iconGhost);
                livingRoom();
                break;
            default:
                JOptionPane.showMessageDialog(null,"wrong input try again" );
                livingRoom();
                break;
        }
        } while(!playerResponseLR.toLowerCase().equals("inspect") && !playerResponseLR.toLowerCase().equals("elevator") && !playerResponseLR.toLowerCase().equals("bathroom"));
            
        }
        
    
    
 //creates method for kitchen floor
    
    public void kitchen() {
        String playerResponseKI = "";
        String choicesKI = " \nChoices: \n\"fridge\" \n\"cabinets\" \n\"elevator\"";
        playerResponseKI = JOptionPane.showInputDialog(mi.question + choicesKI);
        while (!playerResponseKI.toLowerCase().equals("fridge") && !playerResponseKI.toLowerCase().equals("cabinets") && !playerResponseKI.toLowerCase().equals("elevator")) {
            playerResponseKI = JOptionPane.showInputDialog(mi.errorMessage + choicesKI);
        }
        switch (playerResponseKI.toLowerCase()) {
            case "fridge":
                JOptionPane.showMessageDialog(null, "", "Enjoy some soul food", JOptionPane.INFORMATION_MESSAGE, iconFridge);
                kitchen();
                break;
            case "cabinets":
                JOptionPane.showMessageDialog(null, "", "Flying Dishes everywhere", JOptionPane.INFORMATION_MESSAGE, iconCabinets);
                kitchen();
                break;
            case "elevator":
                getElevator.elevatorLoop();
            default:
                JOptionPane.showMessageDialog(null,"try again");
                kitchen();
                break;
        }
    }
    //creates method for pantry floor
    public void pantry() {
        String playerResponsePA = "";
        String choicesPA = " \nChoices: \n\"broom\" \n\"book\" \n\"elevator\"";
        playerResponsePA = JOptionPane.showInputDialog(mi.question + choicesPA);
        while (!playerResponsePA.toLowerCase().equals("broom") && !playerResponsePA.toLowerCase().equals("book") && !playerResponsePA.toLowerCase().equals("elevator")) {
            playerResponsePA = JOptionPane.showInputDialog(mi.errorMessage + choicesPA);
        }
        switch (playerResponsePA.toLowerCase()) {
            case "broom":
                 JOptionPane.showMessageDialog(null, "", "Fly Away", JOptionPane.INFORMATION_MESSAGE, iconBroom);
                pantry();
                break;
            case "book":
                 JOptionPane.showMessageDialog(null, "","here are the devils recipes " , JOptionPane.INFORMATION_MESSAGE, iconBook);
                 pantry();
                break;
            case "elevator":
                getElevator.elevatorLoop();
                break;
            default:
                break;
        }
    }
    //creates method for bedroom 1 bathroom
    public void bathroom1()
    {
        String playerResponseBr1= "";
        String choicesBr1 =  " \nChoices: \n\"mirror\" \n \"shower\" \n\"living\"";        
        playerResponseBr1 = JOptionPane.showInputDialog(mi.question + choicesBr1);
        switch(playerResponseBr1.toLowerCase())
        {
            case("mirror"):
                JOptionPane.showMessageDialog(null, "","look behind you", JOptionPane.INFORMATION_MESSAGE, iconMirror);
                bathroom1();
                break;
            case("shower"):
                JOptionPane.showMessageDialog(null, "Boo", "someone is behind you", JOptionPane.INFORMATION_MESSAGE, iconShower);
                bathroom1();
                break;
            case("living"):
                livingRoom();
                break;
             default:
                JOptionPane.showMessageDialog(null,"wrong input try again" );
                bathroom1();
                break;
            
                
        }
        
        
    }
}
