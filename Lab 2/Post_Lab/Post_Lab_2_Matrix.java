import java.util.*;

public class Post_Lab_2_Matrix
{
    public static void main(String Args[])
    {
        int row,col;
        System.out.prinrtln("Enter the row and col: ");
        row = s.nextInt();
        col = s.nextInt();
        int [][] matrix;
        matrix = new int [row][col];
        System.out.println("Enter the elements of matrix: ");
        for(int i =0;i<row;i++)
        {
            System.out.println("Enter the elements of row "+(i+1));
            for(int j =0;j<col;j++)
            {
                matrix[i][j] = s.nextInt();
            }
        }
        while(true)
        {
            System.out.println("Select an option to perform below: ");
            String srt = "1. Sum of all Elements:"+"\n2.Print the Matrix:"+"\n3. Print the diagonal of matrix: "+"\n4. Sum of Diagonal Elements"+"\n5. Exit()";
            System.out.println(srt);
            int opt;
            System.out.println("Select an option: ");
            opt = s.nextInt();
            if(opt ==1)
            {
                int sum = 0;
                for(int i=0;i<row;i++)
                {
                    for(int j =0;j<col;j++)
                    {
                        sum+=matrix[i][j];
                    }
                }
                System.out.println("Sum of matrix: "+sum);
            }
            else if(opt ==2)
            {
                for(int i=0;i<row;i++)
                {
                    for(int j =0;j<col;j++)
                    {
                        system.out.println(matrix[i][j]);
                    }
                }
            }
            else if(opt ==3)
            {
                for(int i=0;i<row;i++)
                {
                    for(int j =0;j<col;j++)
                    {
                        if(i==j)
                        {
                            System.out.println(matrix[i][j]);
                        }
                    }
                }
            }
            else if(opt ==4)
            {
                int sum =0;
                for(int i=0;i<row;i++)
                {
                    for(int j =0;j<col;j++)
                    {
                        if(i==j)
                        {
                            sum+=matrix[i][j];
                        }
                    }
                }
            }
            else if(opt==5)
            {
                break;
            }
            else
            {
                System.out.println("Enter a valid option");
            }
        }
    }
}