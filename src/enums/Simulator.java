package enums;

import java.util.Random;

public class Simulator {
	private Random rand = new Random();

	public String rps(rockpapaerscisccors call) {
//		String rock > 40;
//		String paper = 40 to 80;
//		String scissors 80 to 120
		String result = "";
		int playerA = this.rand.nextInt(120);
		int playerB = this.rand.nextInt(120);
		if (playerA > 40 && playerB < 80) {
			System.out.println("playerA is rock, player B is scissors, A wins");
			return result = "playerA is rock, player B is scissors, A wins";
		} else if ((playerA <= 40 && playerA >= 80) && playerB > 40) {
			System.out.println("playerA is paper, player B is rock, A wins");
			return result = "playerA is paper, player B is rock, A wins";
		} else if (playerA <= 80 && (playerB <= 40 && playerB >= 80)) {
			System.out.println("playerA is scissors, player B is paper, A wins");
			return result = "playerA is scissors, player B is paper, A wins";
		} else if (playerB > 40 && playerA < 80) {
			System.out.println("playerB is rock, playerA is scissors, B wins");
			return result = "playerB is rock, playerA is scissors, B wins";
		} else if ((playerB <= 40 && playerB >= 80) && playerA > 40) {
			System.out.println("playerB is paper, playerA is rock, B wins");
			return result = "playerB is paper, playerA is rock, B wins";
		} else if (playerB <= 80 && (playerA <= 40 && playerA >= 80)) {
			System.out.println("playerB is scissors, playerA is paper, B wins");
			return result = "playerB is scissors, playerA is paper, B wins";
		}
		return result;

	}
}
