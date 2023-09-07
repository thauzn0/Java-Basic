public class FirstClass {
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName +" " + "managed to get in to position "+ playerPosition + " on the high score list.");

    }
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000)
            return 1;
        if(playerScore >= 500 && playerScore < 1000)
            return 2;
        if(playerScore >= 100 && playerScore < 500)
            return 3;
        return 4;
    }
    public static void main(String[] args){
        displayHighScorePosition("Taha", 2);

        System.out.print(calculateHighScorePosition(750));
    }
}
