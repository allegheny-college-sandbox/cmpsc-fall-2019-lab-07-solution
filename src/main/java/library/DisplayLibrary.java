package bibliotech;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/** Creates and organizes a library.
 *
 * @author Douglas Luman
 */
public class DisplayLibrary {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Set up files and file I/O
    File bookFile = null;
    Scanner input = null;
    try {
      bookFile = new File("inputs/book.list");
      input = new Scanner(bookFile);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    // Initialize all necessary identifiers
    int field = 0;
    Scanner line = null;
    ArrayList<Book> library = new ArrayList<Book>();
    // Loop over file
    while (input.hasNextLine()){
      // Get lines
      String info = input.nextLine();
      // Scan and split lines at commas
      line = new Scanner(info);
      line.useDelimiter(",");
      // Set up placeholder book object
      Book book = new Book();
      // Loop over line
      while (line.hasNext()) {
        String data = line.next();
        // Use conditional logic to get data to the right place
        if (field == 0) {
          book.setTitle(data);
        } else if (field == 1) {
          book.setAuthor(data);
        } else if (field == 2) {
          // Don't forget to transform String -> int
          book.setPages(Integer.parseInt(data));
        }
        // Increment field
        field++;
      }
      // Add book to ArrayList
      library.add(book);
      // Reset the field counter
      field = 0;
    }
    // Initialize identifier tracking which book we're on
    int count = 0;
    double shelfSpace = 0;
    // Print the count of items
    System.out.println("There are " + library.size() + " books:\n");
    // Loop over the library
    while(count < library.size()) {
      // Get object to print
      Book entry = library.get(count);
      shelfSpace += entry.getWidth();
      // Print object
      System.out.println(entry);
      System.out.println();
      // Increase the counter to move on
      count++;
    }
    shelfSpace /= 12;
    DecimalFormat fmt = new DecimalFormat("#.##");
    System.out.print("Shelf width is " + fmt.format(shelfSpace) + " feet.");
  }
}