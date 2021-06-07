package base.ex09;
/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Jerry Saffold
 *
 */

import java.util.Scanner;

/*
Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room? ");
        int length = input.nextInt();
        System.out.print("What is the width of the room? ");
        int width = input.nextInt();
        final int conversion_rate = 350;
        int total_paint_area = length * width;
        int paintneeded = total_paint_area / conversion_rate;
        int total_gallons_needed =(int)Math.ceil(paintneeded);


        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet", total_gallons_needed,
                total_paint_area);
    }
}
