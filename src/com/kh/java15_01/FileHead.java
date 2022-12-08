package com.kh.java15_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHead {

	public static void main(String[] args) {
		try {
			int lineNum = Integer.parseInt(args[0]);
			String fileName = args[1];
			
			File f = new File(fileName);
			// 작업을 하기에 앞서 사용자로부터 입력받은 이름의 파일이 존재하는지, 디렉토리는 아닌지 확인해야함
			if (f.exists() && !f.isDirectory()) {
				BufferedReader br = new BufferedReader(new FileReader(fileName));
				// 파일을 라인단위로 읽기 위해 BufferedReader의 readLine()를 사용
				String line = "";
				int i = 1;
				while ((line = br.readLine()) != null && i <= lineNum) {
					System.out.println(i + ":" + line);
					i++;
				}
			} else {
				throw new FileNotFoundException(fileName + "은/는 디렉토리이거나, 존재하지 않는 파일입니다.");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("USAGE: java FileHead 10 FILENAME");
		}
	} 

}
