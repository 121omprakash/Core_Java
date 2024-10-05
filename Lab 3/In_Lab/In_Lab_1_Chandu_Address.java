package Lab_3;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.util.ArrayList;

public class In_Lab_1_Chandu_Address {
	public static void main(String Args[])
	{
		try {
			FileReader F_name = new FileReader("C:\\Users\\121de\\OneDrive\\Desktop\\Java\\Swing\\src\\Lab_3\\Name.txt");
			BufferedReader name = new BufferedReader(F_name);
			//Reading Address.txt//
			FileReader F_add = new FileReader("C:\\Users\\121de\\OneDrive\\Desktop\\Java\\Swing\\src\\Lab_3\\Address.txt");
			BufferedReader add = new BufferedReader(F_add);
			
			String S_name,S_add;
//			String [] res_name= {};
//			String [] res_add= {};
	        ArrayList<String> nameList = new ArrayList<>();
	        ArrayList<String> addList = new ArrayList<>();
			while((S_name = name.readLine())!=null)
			{
//				String res_name. S_name.split("\n");
				nameList.add(S_name);
			}
			F_name.close();
			while((S_add = add.readLine())!=null)
			{
				addList.add(S_add);
			}
			F_add.close();
			for(int i = 0;i<nameList.size();i++)
			{
				String nam1 = nameList.get(i);
				String add1 = addList.get(i);
				String [] nam2 = nam1.split("\t");
				String [] add2 = add1.split("\t");
				for(int j =0;j<nam2.length-1;j+=2)
				{
					if(nam2[j].equals(add2[j]))
					{
						String s= "Id: "+nam2[j]+"\nName: "+nam2[j+1]+"\nAddress: "+add2[j+1];
						System.out.println(s);
					}
//					System.out.println("Id: "+nam2[j]+"\nName: "+nam2[j+1]+"\nAddress: "+add2[j+1]);
				}
				
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found "+e.getMessage());
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}
	//Reading both files
	
}
