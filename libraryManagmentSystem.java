
import java.util.*;
import java.util.Scanner;
    class Book {

        int id;
        String title;
        String author;

        Book(int id,String title, String author) {

            this.id = id;
            this.title = title;
            this.author = author;
        }

        public String toString() {

            return "ID" + id +", Title" + title + ",Author: " +author;
        }
    }
public class libraryManagmentSystem{


public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    ArrayList<Book> library = new ArrayList<>();

    while(true) {

        System.out.println("\n==== library menu===");
        System.out.println("1 Add Book");
        System.out.println("2. View All Books");
        System.out.println("3. Search Book by ID");
        System.out.println("4. Remove Book by ID");
        System.out.println("5. Exit");
        System.out.println("Enter your choice");

        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice) {

            case 1:
            System.out.println("Enter book ID: ");
            int id = sc.nextInt();
            System.out.println("Enter Book Title: ");
            String title = sc.nextLine();
            System.out.println("Enter Book Author: ");
            String author = sc.nextLine();
            library.add(new Book(id, title, author));

            System.out.println("Book added successfully!");
            break;



            case 2:
            if(library.isEmpty())  {

                System.out.println("no boks in the library");
            }

            else{

                System.out.println("\n library books: ");

                for(Book b : library) {

                    System.out.println(b);
                }
            }
         

            case 3:
            System.out.print("Enter Book ID to search: ");
            int searchID = sc.nextInt();
            boolean found = false;

            for(Book b : library) {

                if(b.id == searchID) {

                    System.out.println("Book Found: "+b);
                    found = true;
                    break;
                }
            }

            if(!found) {

                System.out.println("Book not found!");
            }

            break;

            case 4:

            System.out.println("Enter book id to remove: ");
            int removeId = sc.nextInt();

            Book toRemove = null;

            for(Book b: library) {

                if(b.id == removeId) {

                    toRemove = b;
                    break;
                }
            }

            if(toRemove != null) {

                library.remove(toRemove);
                System.out.println("Book removed successfully!");
            }

            else{

                System.out.println("Book not found!");
            }

            break;
          
            case 5:

            System.out.println("Exiting Library System. goodbye!");
            sc.close();
            return;

            default:
            System.out.println("Invalid Choice! Please try again");

       
        }
    }
}
    
}