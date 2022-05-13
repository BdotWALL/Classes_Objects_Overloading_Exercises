import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();


    books.add(new Book("The 48 Laws of Power", 476,1998));
    books.add(new Book("Dracula", 488,1897));
    books.add(new Book("Fahrenheit 451", 196, 2003));
    books.add(new Book("The Great Gatsby", 288));
    books.add(new Book("As A Man Thinketh", 56));
    books.add(new Book("Monster"));
    books.add(new Book("The Art of War"));


    System.out.println("Welcome to the Book Database!");
    System.out.println("What would you like to print?");
    System.out.println("Enter  ''everything'' to print all book info available and ''name'' to print titles only:");
    String allOrTitle = scan.nextLine();
    if (allOrTitle.equals("everything")) {
      for (int i = 0; i < books.size(); i++) {
        Book booklist = books.get(i);
        System.out.println(booklist.getName() + ", " + booklist.getPages() + " pages, " + " published: " + booklist.getPubYear() );
      }
      
    }

    if (allOrTitle.equals("name")) {
    for (int i = 0; i < books.size(); i++) {
      Book booklist = books.get(i);
      System.out.println(booklist.getName());
    }

  }

}

}
