package com.kh.java15_01;

public class Q_15_1 {
	// 문제 15강 1번
	
//	[15-1] 문제 커맨드라인으로 부터 파일명과 숫자를 입력받아서 입력받은 파일의 내용의 처음 ,
//	부터 입력받은 숫자만큼의 라인을 출력하는 프로그램 을 작성하라 (FileHead.java) .
//	[Hint] BufferedReader readLIne() .
	
	
	// 실행 결과
//	C:\jdk1.8\work\ch15>java FileHead 10
//	USAGE: java FileHead 10 FILENAME
//	C:\jdk1.8\work\ch15>java FileHead 10 aaa
//	aaa / , . 은 는 디렉토리이거나 존재하지 않는 파일입니다
//	C:\jdk1.8\work\ch15>java FileHead 10 FileHead.java
//	1:import java.io.*;
//	2:
//	3:class FileHead
//	4:{
//	5: public static void main(String[] args)
//	6: {
//	7: try {
//	8: int line = Integer.parseInt(args[0]);
//	9: String fileName = args[1];
//	10:
//	C:\jdk1.8\work\ch15>
	
}
