package model;

public class MovableRectangle implements Movable{
    private MovablePoint TopLeft;
    private MovablePoint BottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.TopLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.BottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return String.format("MovableRectangle=(TopLeft: %s, BottomRight: %s)", this.TopLeft, this.BottomRight);
    }

    @Override
    public void MoveUP() {
        TopLeft.MoveUP();
        BottomRight.MoveUP();
    }

    @Override
    public void MoveDown() {
        TopLeft.MoveDown();
        BottomRight.MoveDown();
    }

    @Override
    public void MoveLeft() {
        TopLeft.MoveLeft();
        BottomRight.MoveLeft();
    }

    @Override
    public void MoveRight() {
        TopLeft.MoveRight();
        BottomRight.MoveRight();
    }
}
