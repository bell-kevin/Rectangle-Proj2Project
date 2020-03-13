package rectangle;

/******************************************************************************
 * Rectangle.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This simple program is for learning how to test using JUnit
 *****************************************************************************/

import java.util.*; //Scanner

public class Rectangle 
{
    public static void main(String[] args) 
    {
        System.out.println("Box JUnit Tests by JC Boyd\n");
        
        Scanner stdIn = new Scanner(System.in);
        int length, width, height, area, perimeter, volume;
        
        System.out.print("What is the length: ");
        length = Integer.parseInt(stdIn.nextLine());
        System.out.print("What is the width: ");
        width = Integer.parseInt(stdIn.nextLine());
        System.out.print("What is the height: ");
        height = Integer.parseInt(stdIn.nextLine());
        
        Box aBox = new Box(length, width, height);
        
        area = aBox.area();
        perimeter = aBox.perimeter();
        volume = aBox.volume();
        
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Volume = " + volume);
               
    } //end main

} //end class Rectangle

