public class WhiteBishop implements MoveCommand {
    private Board chessboard;
    private String name;

    public WhiteBishop(Board chessboard) {
        this.chessboard = chessboard;
        name = "WhiteBishop";
    }
    public void move(){
        chessboard.move(1,1, getName());
        System.out.println("WHITE MOVE BISHOP: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(1,1, getName());
        System.out.println("WHITE UNDO BISHOP: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(1,1, getName());
        System.out.println("WHITE REDO BISHOP: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}