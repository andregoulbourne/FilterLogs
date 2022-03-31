package com.andre.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Filter {
	
	private Filter() {
	    throw new IllegalStateException("Utility class");
	 }
	
	public static void filterLog(String fileName,String keyWord) {
		try (var br = new BufferedReader(new FileReader("input/"+fileName+".txt")); var writer = new PrintWriter("output/"+fileName+"Loglevel="+keyWord+".txt","UTF-8")) {
			String line;
			while((line = br.readLine()) != null) {
				if((line.contains(keyWord)) || ((keyWord.equals("ERROR") && !line.contains("INFO") && !line.contains("DEBUG")  && (line.contains("at") || line.contains("Exception"))))){
					System.out.println(line);
					writer.println(line+"\r\n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
