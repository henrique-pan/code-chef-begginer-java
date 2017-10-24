package com.henrique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Start01 {

	//private static final String fileName = "files/start01.txt";
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new FileReader(fileName));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		pw.println(br.readLine());

		br.close();
		pw.close();
	}
}
