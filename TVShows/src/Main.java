import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<TvShow> shows = new ArrayList<>();


        System.out.println("Please enter a show name and its corresponding information \n"
        + "Enter done in name field to complete adding to list");
       
        while(true) {
            System.out.println("Name of the show:");
            String nameShow = scan.nextLine();

            if (nameShow.equals("done")) {
                System.out.println("Done adding to list");
                break;
            }
            System.out.println("What is the genre?");
            String showType = scan.nextLine();
            System.out.println("How many episodes?");
            int numOfEps = scan.nextInt();
            scan.nextLine();

            if (showType.equals("")) {
                shows.add(new TvShow(nameShow, numOfEps));
            } else {
                shows.add(new TvShow(nameShow, numOfEps, showType));

            }
           
            

            


        }

        for (int i = 0; i < shows.size(); i++) {
            System.out.println(shows.get(i));
        }


    }
}
