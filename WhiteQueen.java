public class WhiteQueen implements MoveCommand {
    private Board chessboard;
    private String name;

    public WhiteQueen(Board chessboard) {
        this.chessboard = chessboard;
        name = "White Queen";
    }
    public void move(){
        chessboard.move(5,5, getName());
        System.out.println("WHITE MOVE QUEEN: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(5,5, getName());
        System.out.println("WHITE REDO QUEEN: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(5,5, getName());
        System.out.println("WHITE UNDO QUEEN: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}