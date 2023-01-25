package DAY_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class seaship_2 {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("1a_sonar");

		List<Integer> hh = new ArrayList<>();

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {

			String line = sc.nextLine();

			int temp = Integer.parseInt(line);

			hh.add(temp);

			//System.out.println(temp);
		}
		sc.close();

		int count = 0;

		for (int i = 0; i < hh.size() - 3; i++) {

			int first = hh.get(i) + hh.get(i + 1) + hh.get(i + 2);

			int second = hh.get(i + 1) + hh.get(i + 2) + hh.get(i + 3);

			if (second > first) {
				count++;

			}

		}

		System.out.println(count);
	}

}
