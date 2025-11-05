public class WhiteRook implements MoveCommand {
    private Board chessboard;
    private String name;
    
    public WhiteRook(Board chessboard) {
        this.chessboard = chessboard;
        name = "White Rook";
    }
    public void move(){
        chessboard.move(3,0, getName());
        System.out.println("WHITE MOVE ROOK: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(3,0, getName());
        System.out.println("WHITE UNDO ROOK: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(3,0, getName());
        System.out.println("WHITE REDO ROOK: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}