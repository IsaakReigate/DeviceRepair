package devicerepair;

import java.util.Scanner;

public class Devicerepair {

        public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        Device myDevice = new Device("12345", "Google Pixel 3A", "Isaak", "Broken Screen", "Any Notes");
        Device myDevice2 = new Device("12345", "Google Pixel 2A", "Isaak", "Broken Screen", "Any Notes");
        System.out.println(myDevice.toString());
        System.out.println(myDevice2.toString());
 
    }
    
    public static void MainMenu(){
        while(true){
            System.out.println("Please select an option: ");
            int userChoice = input.nextInt();
            switch(userChoice){
                case(1):
                    
            } 

        }
    }
    
    
}
