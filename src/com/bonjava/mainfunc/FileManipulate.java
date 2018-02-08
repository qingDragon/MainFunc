package com.bonjava.mainfunc;

import java.util.ArrayList;

public interface FileManipulate {
	abstract ArrayList<String> readExcel(String filePath); 
	abstract void writeToExcel(ArrayList<String> aList); 
	abstract ArrayList<String> read2Excel(String filePath); 
}
