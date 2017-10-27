package com.henrique;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Flow013 {
	
	//private static String fileName = "files/flow013.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
		NumberIO numberIO = new NumberIO(System.in);
		//NumberIO numberIO = new NumberIO(new FileInputStream(fileName));

		PrintWriter pw = new PrintWriter(System.out);
		
		int SUM_TRIANGLES = 180;
		
		long lines = numberIO.nextInt();
		for (int i = 0; i < lines; i++) {
			int c1 = numberIO.nextInt();
			int c2 = numberIO.nextInt();
			int c3 = numberIO.nextInt();
			
			
			if(c1 < SUM_TRIANGLES) {
				if((c1+c2) < SUM_TRIANGLES) {
					if((c1+c2+c3) == SUM_TRIANGLES) {
						pw.println("YES");
					} else {
						pw.println("NO");
					}
				} else {
					pw.println("NO");
				}
			} else {
				pw.println("NO");
			}
		}
		pw.close();
	}
	
	static final class NumberIO {
		private BufferedInputStream inp;
		private int offset = 0;
		private int size = 1024 * 50; // 50kB
		private byte[] buff = new byte[size];

		private NumberIO(InputStream inputStream) {
			inp = new BufferedInputStream(inputStream);
			try {
				inp.read(buff, 0, size);
			} catch (IOException e) {
			}
		}

		public int nextInt() {
			int i = offset;
			// skip any spaces
			while (i < buff.length && (buff[i] == ' ' || buff[i] == '\t' || buff[i] == '\n')) {
				i++;
			}
			int sign = 1;
			if (i < buff.length && buff[i] == '-') {
				sign = -1;
			}
			// read digits and parse number
			int parsedInt = 0;
			while (i < buff.length && buff[i] >= '0' && buff[i] <= '9') {
				parsedInt *= 10;
				parsedInt += buff[i] - '0';
				i++;
			}
			// check if we reached end of buffer
			if (i == buff.length) {
				// copy leftovers to buffer start
				int j = 0;
				for (; offset < buff.length; j++, offset++) {
					buff[j] = buff[offset];
				}
				// and now fil the buffer
				try {
					inp.read(buff, j, size - j);
				} catch (IOException ignore) {
				}
				// and attempt to parse int again
				offset = 0;
				parsedInt = nextInt();
			} else {
				offset = i;
			}
			return parsedInt * sign;
		}
	}
}
