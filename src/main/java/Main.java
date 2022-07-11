import com.threeinline.DefaultArgumentParser;

public class Main {
    public static void main(String[] args) {
//        if (args == null) {
//            System.out.println("You have not provided any arguments!");
//        } else {
//            System.out.println("There are " + args.length + " argument(s)!");
//            for (int i = 0; i < args.length; i++) {
//                System.out.println("Argument(" + (i + 1) + "):" + args[i]);
//            }
//        }
        var shapes = new DefaultArgumentParser().parse(args);
        shapes.forEach(shape -> printMessage(shape.playPaperRockScissors()));
    }

    private static void printMessage(int result) {
        if (result == 1) {
            System.out.println("Congratulations, you won");
        }
        if (result == 0) {
            System.out.println("That was a draw, try again");
        }
        if (result == -1) {
            System.out.println("Bad luck, you lost");
        }
    }
}
