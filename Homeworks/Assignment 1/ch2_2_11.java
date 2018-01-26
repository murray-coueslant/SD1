/* rewrite the program from 1.11 to allow the user to enter a desired amount of years to predict the population */
import java.text.DecimalFormat;
import java.util.Scanner;

public class ch2_2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");
        System.out.print("Enter the number of years: ");
        double num_years = input.nextDouble();
        double current_pop = 312032486;
        double birth_rate = 7;
        double death_rate = 13;
        double immi_rate = 45;
        double seconds_per_day = 86400;
        double days_per_year = 365;
        double births_per_year = (seconds_per_day * days_per_year) / birth_rate;
        double deaths_per_year = (seconds_per_day * days_per_year) / death_rate;
        double immi_per_year = (seconds_per_day * days_per_year) / immi_rate;
        double pop_change = births_per_year - deaths_per_year + immi_per_year;
        for (double x = 0; x < num_years; x++) {
            current_pop += pop_change;
        }
        System.out.println("The population after " + df.format(num_years) + " years is " + df.format(current_pop));
    }
}