import java.util.HashSet;
import java.util.Scanner;

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
    static void tictactoe(String[][] field){
        Scanner scanner = new Scanner(System.in);
        HashSet<String> repit = new HashSet<String>();
        String[] xo = {"X"};
        for (int g = 0;g <= 8;){
            System.out.print("Enter the coordinates: ");
            final String intLine = scanner.nextLine();
            if(repit.contains(intLine)){
                System.out.println("This cell is occupied! Choose another one!");
            }else {
                repit.add(intLine);
                final String[] splitIntLine = intLine.split(" ");
                final int[] coordinates = new int[splitIntLine.length];
                try{
                    for (int i = 0; i < splitIntLine.length; i++) {
                        coordinates[i] = Integer.parseInt(splitIntLine[i]);
                    }
                }catch (NumberFormatException n){
                    System.out.println("You should enter numbers!");
                    continue;
                }
                if(coordinates[0] < 1 || coordinates[1] < 1){
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                if(coordinates[0] > 3 || coordinates[1] > 3){
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                replacechar(xo,field,coordinates);
                replacefield(field);
                System.out.println();
                checkwin(field);
                g++;
                if(g == 9){
                    System.out.println("Impossible");
                }
            }
        }
    }
}
