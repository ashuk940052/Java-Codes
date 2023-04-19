package Tik_Tak_Toe;

public class Board {
    public final static int PLAYER_1_WINS = 1;
    public final static int PLAYER_2_WINS = 2;
    public final static int DRAW = 3;
    public final static int INCOMPLETE = 4;
    public final static int INVALID = 5;
    private static char[][] Board;
    private static int boardSize = 3;
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
    public int move(char symbol ,int x , int y){
        if(x<0 || x>=boardSize || y<0 || y>=boardSize || Board[x][y] != ' '){
            return INVALID;
        }
        Board[x][y] = symbol;
        count++;
        //Check row
        if(Board[x][0] == Board[x][1] && Board[x][0] == Board[x][2] ){
            return symbol == P1symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        //Check column
        if(Board[0][y] == Board[1][y] && Board[0][y] == Board[2][y] ){
            return symbol == P1symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        //Check First Diagonal
        if(Board[0][0] != ' ' && Board[0][0] == Board[1][1] && Board[0][0] == Board[2][2] ){
            return symbol == P1symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        //Check Second Diagonal
        if(Board[0][2] != ' ' && Board[0][2] == Board[1][1] && Board[0][2] == Board[2][0] ){
            return symbol == P1symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
        }
        if(count == boardSize*boardSize){
            return DRAW;
        }
        return INCOMPLETE;
    }
    public static void print(){
        System.out.println("---------------");
        for (int i=0; i< boardSize ; i++){
            for (int j=0 ; j <boardSize ; j++ ){
                System.out.print("| " + Board[i][j] + " |");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("---------------");
    }
}
