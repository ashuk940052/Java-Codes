package Tik_Tak_Toe;
import java.util.*;

public class TikTakTeo {
    private Player player1, player2;
    private Board board;

    public void StartGame() {
        Scanner sc = new Scanner(System.in);
        //Player Input
        player1 = takePlayerInput(1);
        player2 = takePlayerInput(2);

        while (player1.getSymbol() == player2.getSymbol()) {
            System.out.println("Symbol is already taken !! .. Pick another symbol : ");
            char Symbol = sc.next().charAt(0);
            player2.setSymbol(Symbol);
        }
        // Creat Board
        board = new Board(player1.getSymbol(), player1.getSymbol());

        // Conduct the Game

        boolean Player1Turn = true;
        int status = Board.INCOMPLETE;
        while (status == Board.INCOMPLETE || status == Board.INVALID) {
            if (Player1Turn) {
                System.out.println("Player 1 -" + player1.getName() + "'s Turn ");
                System.out.println("Enter x : ");
                int x = sc.nextInt();
                System.out.println("Enter y : ");
                int y = sc.nextInt();
                status = board.move(player1.getSymbol(), x, y);
                if (status != board.INVALID) {
                    Player1Turn = false;
                    Board.print();

                }
            }
            else{
                    System.out.println("Player 2 -" + player1.getName() + "'s Turn ");
                    System.out.println("Enter x : ");
                    int x = sc.nextInt();
                    System.out.println("Enter y : ");
                    int y = sc.nextInt();
                    status = board.move(player2.getSymbol(), x, y);
                    if (status == board.INVALID) {
                        Player1Turn = false;
                        Board.print();
                    }


                }

        }
    }
        private Player takePlayerInput ( int num){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Player" + num + " name");
            String name = sc.nextLine();
            System.out.println("Enter Player" + num + " Symbol");
            char Symbol = sc.next().charAt(0);
            Player p = new Player(name, Symbol);
            return p;

        }
    }


