import java.io.*;
import java.util.Scanner;
public class Readcsv {
        public void load_csv(String path)  {
            try {
                Scanner sc = new Scanner(new File(path));
                System.out.println("readable file");
                sc.useDelimiter(",");   //sets the delimiter pattern
                while (sc.hasNext())  //returns a boolean value
                {
                    System.out.print(sc.next());  //find and returns the next complete token from this scanner
                }
                sc.close();  //closes the scanner
            }
            catch(Exception e){
                System.out.println("Error csv can't read");
            }

            //Hashmap usage of student details : https://www.geeksforgeeks.org/create-hashmap-with-multiple-values-associated-with-the-same-key-in-java/
            //Good handle for exception : https://howtodoinjava.com/best-practices/java-exception-handling-best-practices/
            //Debug tips https://stackify.com/java-debugging-tips/

        }
}
//Develop