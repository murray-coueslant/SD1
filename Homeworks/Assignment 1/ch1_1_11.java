/* write a program which displays the population for the next five years assuming
- a birth every seven seconds
- a death every 13 seconds
- an immigrant every 45 seconds
*/

public class ch1_1_11 {
    public static void main(String[] args) {
        System.out.println("The current population is: 312,032,486");
        int current_pop = 312032486;
        int seconds_in_day = 86400;
        FINAL int days_in_year = 365;
        int birth_rate = 7;
        int death_rate = 13;
        int immi_rate = 45;
        int births_per_year = (seconds_in_day * days_in_year) / birth_rate;
        int deaths_per_year = (seconds_in_day * days_in_year) / death_rate;
        int immi_per_year = (seconds_in_day * days_in_year) / immi_rate;
        int pop_change = births_per_year - deaths_per_year + immi_per_year;
        System.out.println("The population in a year from now will be:");
        current_pop += pop_change;
        System.out.println(current_pop);
        System.out.println("The population in two years from now will be:");
        current_pop += pop_change;
        System.out.println(current_pop);
        System.out.println("The population in three years from now will be:");
        current_pop += pop_change;
        System.out.println(current_pop);
        System.out.println("The population in four years from now will be:");
        current_pop += pop_change;
        System.out.println(current_pop);
        System.out.println("The population in five years from now will be:");
        current_pop += pop_change;
        System.out.println(current_pop);
    }
}