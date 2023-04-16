package Tik_Tak_Toe;


public class Player {
    private String name;
    private char symbol;
    public Player(String name , char symbol){
        setname(name);
        setSymbol(symbol);
    }
    private void setSymbol(char symbol) {
        if(symbol != '\0'){
            this.symbol = symbol;
        }
    }
    public void setname(String name){
        if(!name.isEmpty()){
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }
    public char getSymbol(){
        return this.symbol;
    }

}
