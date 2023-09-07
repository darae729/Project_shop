package org.sp.springapp.util;

public class FileManager {

	//확장자 구하기 1234.jpg
	public static String getExt(String path) {
		int index = path.lastIndexOf(".");
		return path.substring(index+1, path.length()); //exclusive
	}
	
	//최종적인 파일명 만들기
	public static String createFilename(String filename) {
		long time = System.currentTimeMillis();
		
		return time+"."+getExt(filename);
	}
}
