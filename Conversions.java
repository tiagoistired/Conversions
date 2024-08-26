import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Miles to Feet");
        System.out.println("8. Feet to Miles");
        System.out.println("9. Years to Generations");
        System.out.println("10. Generations to years");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the end-line and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Farenheit: ");
            double farenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (farenheit - 32) * (5.0 / 9.0);
            System.out.println(farenheit + " degrees fareinheit is " + celsius + " degrees celsius");
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meter = feet * 0.3048;
            System.out.println(feet + "ft long is " + meter + "m long");
        }
        if (selection == 4)
        {
            System.out.println("Enter meters: ");
            double meter = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meter * 3.28084;
            System.out.println(meter + "m long is " + feet + "ft long");
        }
        if (selection ==5)
        {
            System.out.println("Enter ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double Milliliters = ounces * 29.5735;
            System.out.println(ounces + " ounces is " + Milliliters + "mL");
        }
        if (selection ==6)
        {
            System.out.println("Enter Milliliters: ");
            double Milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = Milliliters/29.574;
            System.out.println(Milliliters + "mL is " + ounces + " ounces");
        }
        if (selection ==7)
        {
            System.out.println("Enter miles: ");
            double miles = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = miles * 5280;
            System.out.println(miles + " miles is " + feet + "ft long");
        }
        if (selection ==8)
        {
            System.out.println("Enter feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double miles = feet/5280;
            System.out.println(feet + "ft is " + miles + " miles long");
        }
        if (selection ==9)
        {
            System.out.println("Enter years: ");
            double years = keyboard.nextDouble();
            keyboard.nextLine();
            double Generations = years * 3/100;
            System.out.println(years + " years is " + Generations + " generations");
        }
        if (selection ==10)
        {
            System.out.println("Enter generations: ");
            double generations = keyboard.nextDouble();
            keyboard.nextLine();
            double years = generations * 100/3;
            System.out.println(generations + " generations is " + years + " years");
        }
    }
}