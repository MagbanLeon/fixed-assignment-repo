public class BlackBishop implements MoveCommand {
    private Board chessboard;
    private String name;

    public BlackBishop(Board chessboard) {
        this.chessboard = chessboard;
        name = "BlackBishop";
    }
    public void move(){
        chessboard.move(1,1, getName());
        System.out.println("BLACK MOVE BISHOP: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(1,1, getName());
        System.out.println("BLACK UNDO BISHOP: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(1,1, getName());
        System.out.println("BLACK REDO BISHOP: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}