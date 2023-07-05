import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Readcsv {
        private  ArrayList<String> data = new ArrayList<String>();
        private String path = "";
        public Readcsv(String path){
            this.path = path;
        }

        private ArrayList<String> load_csv()  {
            try {
                Scanner sc = new Scanner(new File(this.path));
                System.out.println("readable file");//Debug return

                sc.useDelimiter(",");   //sets the delimiter pattern
                while (sc.hasNext())  //returns a boolean value
                {
                    this.data.add(sc.next());
                    //System.out.println(sc.next());  //find and returns the next complete token from this scanner
                }
                sc.close();  //closes the scanner
                return this.data;
            }
            catch(Exception e){
                System.out.println("Error csv can't read");
                return null;
            }

            //Hashmap usage of student details : https://www.geeksforgeeks.org/create-hashmap-with-multiple-values-associated-with-the-same-key-in-java/
            //Good handle for exception : https://howtodoinjava.com/best-practices/java-exception-handling-best-practices/
            //Debug tips https://stackify.com/java-debugging-tips/

        }

        public ArrayList<String> getCsvData(){
            return this.load_csv();
        }
}
//Develop 123 123 123123