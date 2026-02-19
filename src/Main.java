import model.*;

public class Main {
    public static void main(String[] args) {
        MovableRectangle MoveRec1 = new MovableRectangle(2,9,7,4,5,5);

        MoveRec1.MoveUP();
        MoveRec1.MoveLeft();
        System.out.println(MoveRec1.toString());
    }
}