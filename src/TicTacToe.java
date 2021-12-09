public class TicTacToe {
    public static void main(String[] args) {
        play();
    }
    static void play(){
        playingfield();
    }
    static void playingfield(){
        String[][] field = new String[5][5];
        for(int i = 0;i<5;i++){
            for (int j = 0;j<5;j++){
                field[i][j] = "_";
            }
        }
        tictactoe(field);
    }
}
