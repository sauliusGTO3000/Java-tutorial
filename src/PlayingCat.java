public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 54));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature < 25) {
            return false;
        }

        if ((summer && temperature <= 45) || (!summer && temperature <= 35) ){
            return true;
        }

        return false;
    }
}
