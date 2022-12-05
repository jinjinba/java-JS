package com.kh.jkj;

import java.util.Scanner;

public class RankingFunction {
	Ranking [] rankings;	// 배열선언
	
	public RankingFunction() {
		rankings = new Ranking[3];	// 배열할당
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 미용 대회 등수 확인 프로그램 =====");
		System.out.println("1. 미용사 성적 입력");
		System.out.println("2. 미용사 성적 출력");
		System.out.println("3. 등수 확인");
		System.out.println("4. 프로그램 종료");
		System.out.println("메뉴 입력 : ");
		int menu = sc.nextInt();
		return menu;
	}
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < rankings.length; i++) {
			System.out.println("=====" + (i+1) + " 번째 미용사 정보 입력 =====");
			System.out.println("미용사 이름 입력 : ");
			String name = sc.next();
			System.out.println((i+1) + "미용사의 점수 입력 : ");
			int firstScore = sc.nextInt();
			rankings[i] = new Ranking();
			rankings[i].setName(name);
			rankings[i].setFirstScore(firstScore);
		}	
	}	
	public void printScore() {
		for(int i = 0; i < rankings.length; i++) {
			System.out.println("=====" + (i+1) + "번째 미용사 점수 출력 =====");
			System.out.println(rankings[i].getName() + "미용사의 점수는 :" + rankings[i].getFirstScore());
		}
	}
	public void checkPass() {
		int[] rank = new int[3];
		System.out.println("===== 미용 대회 순위 =====");
			 for(int i = 0 ; i < 3 ; i++){
				   for(int j = 0 ; j < 3 ; j++){
					   if(rankings[i].getFirstScore() < rankings[j].getFirstScore()) {
						   rank[i] = rank[i] + 1;
					   }
				   }
			 }
				  for(int i = 0 ; i < 3 ; i++){
				   System.out.println("미용사 " + rankings[i].getName() + "님의 순위는 " + (rank[i] + 1) + "등입니다.");
				  }
		
	}
}
