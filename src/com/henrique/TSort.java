package com.henrique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TSort {
	public static void main(String[] args) {
		//String fileName = "files/tsort.txt";

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			// try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			br.readLine();

			String line;

			List<Integer> sortedList = new ArrayList<Integer>();
			while ((line = br.readLine()) != null) {
				sortedList.add(Integer.parseInt(line));
			}

			Collections.sort(sortedList);
			for (Integer number : sortedList) {
				System.out.println(number);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
