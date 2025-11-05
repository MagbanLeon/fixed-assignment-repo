public class WhiteKing implements MoveCommand {
    private Board chessboard;
    private String name;
    
    public WhiteKing(Board chessboard) {
        this.chessboard = chessboard;
        name = "WhiteKing";
    }
    public void move(){
        chessboard.move(1,1, getName());
        System.out.println("WHITE MOVE KING: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(1,1, getName());
        System.out.println("WHITE UNDO KING: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(1,1, getName());
        System.out.println("WHITE REDO KING: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}