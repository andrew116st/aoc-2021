package DAY_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class submarine_2 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/eclipse-workspace/adventofcode_2021/2a_depth.txt");

		List<String> hh = parseFileToStringList(file);
		//System.out.println(hh);
		
		int depth = 0;
		int horPos = 0;
		int target = 0;
		
		
		for (String temp : hh) {
			String[] array = temp.split(" ");
			
			String cmd = array[0];
			int value = Integer.parseInt(array[1]);
			
			switch (cmd) {
			case "forward":
				horPos += value;
				depth += target*value;
				break;
				
			case "up":
				target -= value;
				break;
				
			case "down":
				target += value;
				break;
				

			default:
				System.out.println("error command");
				return;
			}
			
		}
		System.out.println();
		System.out.println("Result - " + depth*horPos);	
	}

		public static  List<String> parseFileToStringList(File file) throws IOException {
			
			List<String> depthRoute = new ArrayList<String>();
			
			Scanner sc;
			
			try {
				sc = new Scanner(file);
				
			}catch (FileNotFoundException e)	{
				System.out.println("File_Not_Found"); 
				
				throw new IOException();
			}

			while(sc.hasNextLine()) {
				
				String line = sc.nextLine();
				
				String[] numbers = line.split(" ");
				
				System.out.println(Arrays.toString(numbers));
				
				depthRoute.add(line);	
		}
			sc.close();
			
			return depthRoute;
	}

		
		
}
