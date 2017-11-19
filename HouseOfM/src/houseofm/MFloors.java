/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseofm;

import javax.swing.JOptionPane;

/**
 *
 * @author julioa
 */
//Create new class for add on floor from 3rd assignment
public class MFloors {  
    
    
     boolean masterKey = false;
    boolean secKey = false;
    public static MElevator getFloor = new MElevator();
    
    //creates method for basement floor
    public  void basement() 
    {
        getFloor.currentFloor = 0;
        String baseResponse = JOptionPane.showInputDialog("Would you like to go in the \"boiler\"  room or \"storage\" room or \"elevator\".");
        if(baseResponse.equals("boiler"))
        {
            boilerRoom();
        }
        else if(baseResponse.equals("storage"))
        {
            storageRoom();
        }
        else if(baseResponse.equals("elevator"))
        {
            getFloor.elevatorLoop();
        }
        else
        {
             JOptionPane.showMessageDialog(null,"invalid entry try again");
             basement();
        }
    }
    //creates method to be used in basement floor
    public  void boilerRoom()
    {
         JOptionPane.showMessageDialog(null,"There is nothing here for you");
         basement();
    }
    //creates method to be used in basement floor
    public  void storageRoom()
    {
        JOptionPane.showMessageDialog(null,"You just received a key to open a special door");
        masterKey = true;
        basement();
        
    }
    //creates a new floor method to be accesed by elevator
    public void attic()
    {
        if(masterKey == true)
        {
            JOptionPane.showMessageDialog(null,"You unlocked the chest with your key. \n Here is another mysterious key.");
            secKey = true;
            getFloor.elevatorLoop();
        } 
        else
        {
            JOptionPane.showMessageDialog(null,"You are faced with a locked door.");
            getFloor.elevatorLoop();
        }
    }
}
