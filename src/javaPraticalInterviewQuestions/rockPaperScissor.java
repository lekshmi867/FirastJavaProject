package javaPraticalInterviewQuestions;

import java.util.Scanner;

public class rockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Player 1: Choose one from Rock, Scissor, Paper: ");
        String player1 = sc.next().toLowerCase();
        System.out.println("Player 2: Choose one from Rock, Scissor, Paper:  ");
        String player2 = sc.next().toLowerCase();
     
        if (player1.equals(player2))
        {
            System.out.print("It is a tie");
        } else {
            switch (player1){
            case "rock":
                if (player2.equals("scissor"))
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case "scissor":
                if (player2.equals("paper"))
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case "paper":
                if (player2.equals("rock"))
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            }
        }
	}

}
