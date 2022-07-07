package Mypackage;

import java.util.Scanner;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) throws IOException {
		int ch=0, choice=0;
		//input
		Scanner sc =new Scanner(System.in);
		System.out.println("Created by pritesh ingale  \n");
		
		//selection of file
		while(true)
		{
			System.out.println("Please select anyone of options :");
			System.out.println("1. List files in directory");
			System.out.println("2. Main Menu");
			System.out.println("3. Exit Application ");
			try{    
				ch = sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }         
			
			switch(ch)
			{
			case 1: //All files in ascending order
				BusinessOperations.listFiles();
				break;
			case 2:
				
					System.out.println("Please choose anyone of options :");
					System.out.println("A. Add a File");
					System.out.println("B. Delete a File");
					System.out.println("C. Search a File");
					try{    
						 choice = sc.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("Null Exception occurred");  
	                  }          
					switch(choice)
					{
					case 1:
					
						System.out.println("Name of a file to be created: ");
						String fileCreate = sc.next();
						
						BusinessOperations.createFile(fileCreate);
						break;
						
					case 2:
						System.out.print("Name of a file to be deleted: ");
						String fileDelete = sc.next();
						
						
						BusinessOperations.deleteFile(fileDelete);
						break;
					case 3:
						
						System.out.println("Name of a file to be searched: ");
						String fileSearch = sc.next();
						
						
						BusinessOperations.searchFile(fileSearch);
						break;
						
				default:
						
						System.out.println("\n Invalid Name, Again the process\n");
						break;
				}
			
					break;
			case 3:
				
	
				sc.close();
				System.out.println("\n Nice try see you soon ...");
				System.exit(1);
				break;
			
			default:
			
				System.out.println("\n\n Select within the range of 1-3\n");
				break;
			
			}
		}
		
	}

}
