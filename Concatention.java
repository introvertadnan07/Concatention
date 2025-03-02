import java.util.*;

public class Concatention { 
    
    public static void main(String args[]) {
        // Concatenation

        String firstName = "Md";
        String middleName = "Adnan";
        String lastName = "Qaisar";
        
        // Properly concatenated fullName
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));

        }
    }
}
