/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
#Draw a shape with given number of rows and columns
*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many rows you want:");
	int rows=sc.nextInt();
	
	System.out.println("Enter how many columns you want:");
	int cols=sc.nextInt();

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

	}
}
