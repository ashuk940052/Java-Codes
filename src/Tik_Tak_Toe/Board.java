package Tik_Tak_Toe;

public class Board {
    public final static int PLAYER_1_WINS = 1;
    public final static int PLAYER_2_WINS = 2;
    public final static int DRAW = 3;
    public final static int INCOMPLETE = 4;
    public final static int INVALID = 5;
    private char[][] Board;
    private int boardSize = 3;
    private char P1symbol , P2symbol;
    private int count ;
    public Board(char p1symbol , char p2symbol){
        Board = new char[boardSize][boardSize];
        for (int i=0; i< boardSize ; i++){
            for (int j=0 ; j <boardSize ; j++ ){
                Board[i][j] = ' ';
            }
        }
        this.P1symbol = p1symbol;
        this.P2symbol = p2symbol;

    }
}
