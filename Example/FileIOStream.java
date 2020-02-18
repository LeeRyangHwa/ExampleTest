package Example;

import java.io.*;
import java.util.*;


public class FileIOStream {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			File file = new File("/Users/iryanghwa/Documents/FileStream.txt");
			int i = 0;
			fis = new FileInputStream(file);
			
			
			
			while((i=fis.read())!= -1) {
				System.out.write(i); //1바이트씩출력
				
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			}catch(IOException io) {
				io.printStackTrace();
			}
		}
		
		
	
	}
}
