import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Book book1 = new Book("The 48 Laws of Power", 476,1998);
    Book book2 = new Book("Dracula", 418, 1897);
    Book book3 = new Book("Fahrenheit 451", 190, 2003);
    
    
    System.out.println("What would you like to print?");
    System.out.println("Enter  ''everything'' to print everything and ''name'' to print titles only:");
    String allOrTitle = scan.nextLine();
    if (allOrTitle.equals("everything")) {
      System.out.println(book1.toString() + "\n" + book2.toString() + "\n" +  book3.toString());
    }

    if(allOrTitle.equals("name")) {
      System.out.println(book1.getName() + "\n" + book2.getName() + "\n" + book3.getName());
    }


  }
}
