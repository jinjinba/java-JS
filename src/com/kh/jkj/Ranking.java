package com.kh.jkj;

// 메모장에 올린데로 하려했지만 생각보다 너무 어려워 등수매기기로 바꾸었습니다.

public class Ranking {
	private String name;
	private int firstScore;
	private int secondScore;
	private int thirdScore;
	
	public Ranking() {}
	
	public Ranking(String name) {
		this.name = name;
	}
	public Ranking(int firstScore, int secondScore, int thirdScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
		this.thirdScore = thirdScore;
	}
	
	public Ranking(String name, int firstScore) {
		this.name = name;
		this.firstScore = firstScore;
	}
	
	// getter 메소드
	public String getName() { //void 바뀜
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
	public int getThirdScore() {
		return this.thirdScore;
	}

	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	public void setThirdScore(int thirdScore) {
		this.thirdScore = thirdScore;
	}

}
