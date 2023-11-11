public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Saulius", calculateHighScorePosition(7777));
        displayHighScorePosition("Tim", calculateHighScorePosition(50));
        displayHighScorePosition("Bill", calculateHighScorePosition(600));
        displayHighScorePosition("Martin", calculateHighScorePosition(1500));
        displayHighScorePosition("Alex", calculateHighScorePosition(120));
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
