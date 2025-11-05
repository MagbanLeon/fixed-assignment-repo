public class Queen implements MoveCommand {
    private Board chessboard;
    private String name;

    public Queen(Board chessboard) {
        this.chessboard = chessboard;
        name = "Queen";
    }
    public void move(){
        chessboard.move(5,5);
        System.out.println("MOVE QUEEN: " + chessboard.getCurrent());
    }
    public void undo(){
        chessboard.moveBack(5,5);
        System.out.println("REDO QUEEN: " + chessboard.getCurrent());
    }
    public void redo(){
        chessboard.move(5,5);
        System.out.println("UNDO QUEEN: " + chessboard.getCurrent());
    }
    public String getName() {
        return name;
    }
}