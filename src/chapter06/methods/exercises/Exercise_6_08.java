/*
(Conversions between Celsius and Fahrenheit) Write a class that contains the
following two methods:

public static double celsiusToFahrenheit(double celsius)

public static double fahrenheitToCelsius(double fahrenheit)

The formula for the conversion is as follows:
fahrenheit = (9.0 / 5) * celsius + 32
celsius = (5.0 / 9) * (fahrenheit – 32)

 */
package chapter06.methods.exercises;

public class Exercise_6_08 {
    public static void main(String[] args) {

        System.out.printf("%-10s%-10s | %13s %10s\n", "Celcius", "Fahrenheit", "Fahrenheit", "Celcius");
        System.out.println("----------------------------------------------------------");
        for (int c = 40, f = 120; c > 30; c--, f-=10) {
            System.out.printf("%-10.1f%-10.1f | %10.2f%12.2f\n", c*1.0, celsiusToFahrenheit(c),
                    f*1.0, fahrenheitToCelsius(f));
        }


    }

    /** Convert from Celcius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }
    /** Convert from Fahrenheit to Celcius */
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }

}

/* OUTPUT
Celcius   Fahrenheit |    Fahrenheit    Celcius
----------------------------------------------------------
40,0      104,0      |     120,00       48,89
39,0      102,2      |     110,00       43,33
38,0      100,4      |     100,00       37,78
37,0      98,6       |      90,00       32,22
36,0      96,8       |      80,00       26,67
35,0      95,0       |      70,00       21,11
34,0      93,2       |      60,00       15,56
33,0      91,4       |      50,00       10,00
32,0      89,6       |      40,00        4,44
31,0      87,8       |      30,00       -1,11

*/