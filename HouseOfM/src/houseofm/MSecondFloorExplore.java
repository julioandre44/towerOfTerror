/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseofm;
import static houseofm.MFirstFloorExplore.iconMirror;
import static houseofm.MFirstFloorExplore.iconShower;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author bryanc,Julio A Zapata
 */
public class MSecondFloorExplore {
    //Declares objects based on different classes
    public static MFirstFloorExplore mffe = new MFirstFloorExplore();   
    public static MInitialize mi = new MInitialize();
    public static MElevator getElevator = new MElevator();
    //Images used when inspecting items
    public static ImageIcon iconChair = new ImageIcon("rockingChair.gif");
    public static ImageIcon iconWindow = new ImageIcon("kidsPlaying.png");
    public static ImageIcon iconDoll = new ImageIcon("ScaryDoll.gif");
    public static ImageIcon iconDresser = new ImageIcon("dresser.jpg");
    public static ImageIcon iconDiamond = new ImageIcon("MyPrecious.jpg");
    public static ImageIcon iconLamp = new ImageIcon("enchantedLamp.jpg");
    
    //Creates method for bedroom 1 floor
    public void bedroom1() {
        String choicesBD1 = " \nChoices: \n\"window\" \n\"bathroom\" \n\"chair\" \n\"elevator\"";
        String playerResponseBD1 = JOptionPane.showInputDialog(mi.question + choicesBD1);
        while (!playerResponseBD1.toLowerCase().equals("bathroom") && !playerResponseBD1.toLowerCase().equals("window") && !playerResponseBD1.toLowerCase().equals("chair") && !playerResponseBD1.toLowerCase().equals("elevator")) {
            playerResponseBD1 = JOptionPane.showInputDialog(mi.errorMessage + choicesBD1);
        }
        switch (playerResponseBD1.toLowerCase()) {
            case "chair":
                JOptionPane.showMessageDialog(null, "", "is there a ghost in the chair?", JOptionPane.INFORMATION_MESSAGE, iconChair);
                bedroom1();
                break;
            case "window":
                JOptionPane.showMessageDialog(null, "", "Ghost kids playing in the street", JOptionPane.INFORMATION_MESSAGE, iconWindow);
                bedroom1();
            case "bathroom":
                bathroom2();
                break;
            case "elevator":
                getElevator.elevatorLoop();
                break;
            default:
                break;
        }
    }
    
    //Creates method for bedroom 2 floor
    public void bedroom2() {
        String choicesBD1 = " \nChoices: \n\"dollhouse\" \n\"dresser\" \n\"bathroom\" \n\"elevator\"";
        String playerResponseBD1 = JOptionPane.showInputDialog(mi.question + choicesBD1);
        while (!playerResponseBD1.toLowerCase().equals("bathroom") && !playerResponseBD1.toLowerCase().equals("dollhouse") && !playerResponseBD1.toLowerCase().equals("dresser") && !playerResponseBD1.toLowerCase().equals("elevator")) {
            playerResponseBD1 = JOptionPane.showInputDialog(mi.errorMessage + choicesBD1);
        }
        switch (playerResponseBD1.toLowerCase()) {
            case "dollhouse":
                JOptionPane.showMessageDialog(null, "", "this doll is evil", JOptionPane.INFORMATION_MESSAGE, iconDoll);
                bedroom2();
                break;
            case "dresser":                
                JOptionPane.showMessageDialog(null, "", "Do you hear something?", JOptionPane.INFORMATION_MESSAGE, iconDresser);
                JOptionPane.showMessageDialog(null,"weird sounds coming from the bathroom. lets check it out");
                bathroom3();
                
            case "bathroom":
                bathroom3();
                break;
            case "elevator":
                getElevator.elevatorLoop();
                break;
            default:
                break;
        }
      
    }
    
    //Creates method for bathroom 2
    public void bathroom2() {
       String playerResponseBr1= "";
        String choicesBr1 =  " \nChoices: \n\"mirror\" \n \"shower\" \n\"bedroom\"";        
        playerResponseBr1 = JOptionPane.showInputDialog(mi.question + choicesBr1);
        while (!playerResponseBr1.toLowerCase().equals("bedroom") && !playerResponseBr1.toLowerCase().equals("mirror") && !playerResponseBr1.toLowerCase().equals("shower")) {
            playerResponseBr1 = JOptionPane.showInputDialog(mi.errorMessage + choicesBr1);
        }
        switch(playerResponseBr1.toLowerCase())
        {
            case("mirror"):
                JOptionPane.showMessageDialog(null, "", "is someone there?", JOptionPane.INFORMATION_MESSAGE, iconMirror);
                bathroom2();
                break;
            case("shower"):
                JOptionPane.showMessageDialog(null, "Boo","someone will touch you", JOptionPane.INFORMATION_MESSAGE, iconShower);
                bathroom2();
                break;
            case("bedroom"):
                bedroom1();
             default:
                playerResponseBr1 = JOptionPane.showInputDialog(mi.errorMessage + choicesBr1);;
                break;
            
                
        }
    }
    
    //Creates method for bathroom 3
    public void bathroom3() {
       String playerResponseBr1= "";
        String choicesBr1 =  " \nChoices: \n\"mirror\" \ngo to:\n \"shower\" \n\"bedroom\"";        
        playerResponseBr1 = JOptionPane.showInputDialog(mi.question + choicesBr1);
        while (!playerResponseBr1.toLowerCase().equals("bedroom") && !playerResponseBr1.toLowerCase().equals("shower") && !playerResponseBr1.toLowerCase().equals("mirror")) {
            playerResponseBr1 = JOptionPane.showInputDialog(mi.errorMessage + choicesBr1);
        }
        switch(playerResponseBr1.toLowerCase())
        {
            case("mirror"):
                JOptionPane.showMessageDialog(null, "", "is anybody here", JOptionPane.INFORMATION_MESSAGE, iconMirror);
                bathroom3();
                break;
            case("shower"):
                JOptionPane.showMessageDialog(null, "Boo", "Someone will touch you", JOptionPane.INFORMATION_MESSAGE, iconShower);
                bathroom3();
                break;
            case("bedroom"):
                bedroom2();
             default:
                playerResponseBr1 = JOptionPane.showInputDialog(mi.errorMessage + choicesBr1);;
                break;
            
                
        }
    }
    
    //Creates method for master bedroom floor
    public void masterBedroom() {
        String choicesMBD = " \nChoices: \n\"bathroom\" \n\"jewelry box\" \n\"elevator\"";    
        String playerResponseMBD = JOptionPane.showInputDialog(mi.question + choicesMBD);
        while (!playerResponseMBD.toLowerCase().equals("bathroom") && !playerResponseMBD.toLowerCase().equals("jewelry box") && !playerResponseMBD.toLowerCase().equals("elevator")) {
            playerResponseMBD = JOptionPane.showInputDialog(mi.errorMessage + choicesMBD);
        }
        switch (playerResponseMBD.toLowerCase()) {
            case "bathroom":
                masterBathroom();
                break;
            case "elevator":
               getElevator.elevatorLoop();
               break;
            case "jewelry box":
                JOptionPane.showMessageDialog(null, "", "I found my precious", JOptionPane.INFORMATION_MESSAGE, iconDiamond);
                masterBedroom();
                break;
            default:
                break;
        }
    }
    
    //Creates method for master bathroom
    public void masterBathroom() {
        String choicesMBA = " \nChoices: \n\"lamp\" \n\"bedroom\" \n\"shower\"";
        String playerResponseMBA = JOptionPane.showInputDialog(mi.question + choicesMBA);
        while (!playerResponseMBA.toLowerCase().equals("bedroom") && !playerResponseMBA.toLowerCase().equals("lamp") && !playerResponseMBA.toLowerCase().equals("shower")) {
            playerResponseMBA = JOptionPane.showInputDialog(mi.errorMessage + choicesMBA);
        }
        switch (playerResponseMBA.toLowerCase()) {
            case "bedroom":
                masterBedroom();
                break;
            case "lamp":
                JOptionPane.showMessageDialog(null, "", "Rub the lamp. a genie should grant you 3 wishes", JOptionPane.INFORMATION_MESSAGE, iconLamp);
                masterBathroom();
                break;
            case("shower"):
                JOptionPane.showMessageDialog(null, "Boo", "Someone will touch you", JOptionPane.INFORMATION_MESSAGE, iconShower);
                masterBathroom();
                break;
            default:
                break;
        }
    }
}
