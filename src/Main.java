import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Olivi on 20-10-2016.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String filename = input.nextLine();
        File inputFile = new File(filename);
        Scanner reader = new Scanner(inputFile);

        Integer numberOfVerties = 0;

        numberOfVerties += reader.nextInt();

        //UnweightedGraph g = new UnweightedGraph(reader, numberOfVerties);

        System.out.println("The number of verties is " + numberOfVerties);

        for (int i = 0; i <= numberOfVerties; i++) {
            for ()
            String s+i = reader.nextLine();
            System.out.println(reader.nextLine());
        }

    }

}


