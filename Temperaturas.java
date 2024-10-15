import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarações das variáveis das temperaturas em Celsius, Kelvin e Fahrenheit
        int TemperaturaCelsius;
        double Kelvin, Fahrenheit;

        // O usuário irá digitar a temperatura em celsius que ele deseja converter
        System.out.print("Digite o temperatura em Celsius: ");
        TemperaturaCelsius = sc.nextInt();

        // Fórmulas para conversão das temperaturas
        Fahrenheit = TemperaturaCelsius * 1.8 + 32;
        Kelvin = TemperaturaCelsius + 273.15;

        // A temperatura de Celsius para Farenheit
        System.out.println("A sua temperatura em Celsius é de " + TemperaturaCelsius + " e transformada para Farenheit é de: " + Fahrenheit);

        // A temperatura de Celsius para Kelvin
        System.out.println("A sua temperatura em Celsius é de " + TemperaturaCelsius + " e transformada para Kelvin é de: " + Kelvin);
    }
}
