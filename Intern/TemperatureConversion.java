import java.util.Scanner;

class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        float temperature = input.nextFloat();

        System.out.print("Is this temperature in Celsius (C) or Fahrenheit (F)? ");
        char unit = input.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.printf("%.2f°C is equal to %.2f°F\n", temperature, fahrenheit);
                break;
            case 'F':
                double celsius = fahrenheitToCelsius(temperature);
                System.out.printf("%.2f°F is equal to %.2f°C\n", temperature, celsius);
                break;
            default:
                System.out.println("Invalid unit! Please enter 'C' or 'F'.");
        }

    }

    public static double celsiusToFahrenheit(float temperature) {
        return (temperature * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(float temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
