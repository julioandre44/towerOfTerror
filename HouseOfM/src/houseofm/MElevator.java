/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseofm;

import houseofm.MFirstFloorExplore;
import houseofm.MSecondFloorExplore;
import javax.swing.JOptionPane;

/**
 *
 * @authors Julio A Zapata, Bryan consuegra
 */

//Declare objects for classes
public class MElevator {    
    
     public static MFloors getFloors = new MFloors();
     public static MFirstFloorExplore getFirstFloor = new MFirstFloorExplore();
     public static MSecondFloorExplore getSecondFloor = new MSecondFloorExplore();
     
     public static int currentFloor = 1;
     public static int e; 
  
   //shows elevator options and gets user input for desired floor
public  void elevatorLoop()
{
    
    e = Integer.parseInt(JOptionPane.showInputDialog("Enter the floor number you would like to go: 0-9"));
    while((e > 9) || (e < 0))
     {
        JOptionPane.showMessageDialog(null, "not in the range of floors");
        e = Integer.parseInt(JOptionPane.showInputDialog("Enter the floor number you would like to go: 0-9"));
     }
    elevatorFloor();
}
    
    public void elevatorFloor()
    {
        //Displays the an elevator counter going up/down floors until the player arrives at the desired floor
        int c = 0;
        if (currentFloor < e)
        {
            for(c = currentFloor; c <= e; ++c)
            {
                JOptionPane.showMessageDialog(null, "Now at floor " + c);
            }
        }
        else if (currentFloor > e)
        {
            for(c = currentFloor; c >= e; --c)
            {
                JOptionPane.showMessageDialog(null, "Now at floor " + c);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Now at floor " + c);
        }
        
    currentFloor = e;
        
    //displays a different floor depending on user input
    switch(e)
    {
         case 0:
             getFloors.basement();
            break;
         case 1:
             if(getFloors.secKey == true)
             {
                 JOptionPane.showMessageDialog(null," you are free to go");
             }
             else
             {
                JOptionPane.showMessageDialog(null," you are  in the first Floor, you cannot get out without a special key");
                elevatorLoop();
             }
            break;
         case 2:
             getFirstFloor.livingRoom();
            break;
         case 3:
             getFirstFloor.diningRoom();
            break;            
         case 4:
             getFirstFloor.kitchen();
            break;
         case 5:
             getFirstFloor.pantry();
            break;
         case 6:
             getSecondFloor.bedroom1();
            break;
         case 7:
             getSecondFloor.bedroom2();
            break;
         case 8:
             getSecondFloor.masterBedroom();
            break;
         case 9:
             getFloors.attic();
            break;
      
    }        
    }
            

}
