package Lab_3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class Pre_Lab_2_Student_Option_Pane {
    public static void main(String Args[]) {
        try {
            FileReader f = new FileReader("C:\\Users\\121de\\OneDrive\\Desktop\\Java\\Swing\\src\\Lab_3\\Student.txt");
            BufferedReader bf = new BufferedReader(f);
            
            String line;
            // Reading the file line by line and printing each line
            while((line = bf.readLine()) != null) {
            	String[] name = line.split("\n");
            	String res = "";
                for(String n: name )
                {
                	String []a =n.split(",");
                	JOptionPane.showMessageDialog(null, "Id:"+a[0]+"\nName: " + a[1] +"\nAge: "+a[2]+"\nGender: "+a[3] );
                }
              
            }
            
            // Closing the BufferedReader
            bf.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
