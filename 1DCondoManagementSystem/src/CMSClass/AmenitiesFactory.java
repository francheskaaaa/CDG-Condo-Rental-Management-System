/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMSClass;

import GUI.EditAmenities;
import javax.swing.JOptionPane;
import GUI.*;
/**
 *
 * @author Franchesca Shanne
 */

public class AmenitiesFactory {
    
    public static AddAmenities createAmenities() {
        // Create a message box to get the amenity name from the user
        String amenityName = JOptionPane.showInputDialog(null, "Enter Amenity Name:", "Add Amenity",
                JOptionPane.QUESTION_MESSAGE);

        // Create a new AddAmenities object
        AddAmenities addAmenities = new AddAmenities();

        // Set the amenity name in the AddAmenities object
       // addAmenities._editamenityName(amenityName);

        return addAmenities;
    }
}
    

