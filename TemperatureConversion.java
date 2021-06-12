/**
 * Temperature Conversion
 * Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
 * Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
 * temperature value is user input
 *
 * @author: SAYANI KOLEY
 * @since: 12.06.2021
 */

import java.util.Scanner;

public class TemperatureConversion {
    private static final int Cel_To_Fah = 1;
    private static final int Fah_To_Cel = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter option: 1. Celsius to Fahrenheit" + "\n"+
                                "              2. Fahrenheit to Celsius : ");
        int option = input.nextInt();
        System.out.print("Enter the temperature value: ");
        switch (option) {
            case Cel_To_Fah:
                double celsius = input.nextDouble();
                convert_CelsiustoFahreinheit(celsius);
                break;
            case Fah_To_Cel:
                double fahreinheit = input.nextDouble();
                convert_FahreinheittoCelsius(fahreinheit);
                break;
        }
    }
    private static void convert_CelsiustoFahreinheit(double celsius) {
        double degF=((9/5) * celsius) + 32;
        System.out.println("Celsius to Fahrenheit: " +degF);
    }
    private static void convert_FahreinheittoCelsius(double fahreinheit) {
        double degC= (fahreinheit-32)*5/9;
        System.out.println("Fahrenheit to Celsius: " +degC);
    }

}









