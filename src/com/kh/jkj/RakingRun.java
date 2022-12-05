package com.kh.jkj;

public class RakingRun {
	public static void main(String [] args) {
		RankingFunction rFunc = new RankingFunction();
		EXIT :
		while(true) {
			int choice = rFunc.printMenu();
			switch(choice) {
				case 1 :
					rFunc.inputScore();
					break;
				case 2 : 
					rFunc.printScore();
					break;
				case 3 : 
					rFunc.checkPass();
					break;
				case 4 : break EXIT;
				default : break;
			}
		}
	}
}
