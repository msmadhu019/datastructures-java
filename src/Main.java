import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many days Temperature");

        int numOfDays = s.nextInt();
        int[] temperature = new int[numOfDays];
        double average = 0;
        int sum=0;

        for (int i=0; i<numOfDays; i++) {
            System.out.print("Please enter the temperature of Day"+(i+1)+": ");
            temperature[i] = s.nextInt();
            sum += temperature[i];
        }
        System.out.println();
        System.out.println(Arrays.toString(temperature));

        average = (double) sum /temperature.length;
        System.out.println("The Average Temperature is: "+average);

        int aboveAverage=0;
        for (int i=0; i<numOfDays; i++) {
            if(temperature[i] > average){
                aboveAverage++;
            }
        }
        System.out.println("The number of Days above Average: "+aboveAverage);
    }

}