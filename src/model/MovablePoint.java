package model;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return String.format("MovablePoint=(x: %d, y: %d, xSpeed: %d, ySpeed: %d%n)",this.x, this.y, this.xSpeed, this.ySpeed);
    }

    @Override
    public void MoveUP() {
        this.y -= ySpeed;           //+ MoveDown
    }                               //-MoveUp

    @Override
    public void MoveDown() {
        this.y += ySpeed;
    }

    @Override
    public void MoveLeft() {
        this.x -= xSpeed;           //+ MoveRight
    }                               //- MoveLeft

    @Override
    public void MoveRight() {
        this.x += xSpeed;
    }
}