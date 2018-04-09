public class Speak {
    public static void main(String[] args) {
        Speak speakIT = new Tell();
        Tell tellIt = new Tell();
        Truth truth = new Tell();
        ((Truth) speakIT).tellItLikeItIs();
        tellIt.tellItLikeItIs();
        ((Truth) tellIt).tellItLikeItIs();
        truth.tellItLikeItIs();
        ((Tell) truth).tellItLikeItIs();
    }
}

class Tell extends Speak implements Truth {
    public void tellItLikeItIs() {
        System.out.println("Right on!");
    }
}

interface Truth {
    public void tellItLikeItIs();
};