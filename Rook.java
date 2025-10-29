public class Rook implements MoveCommand {
    private Board chessboard;
    
    public Rook(Board chessboard) {
        this.chessboard = chessboard;
    }
    public void move(){
        chessboard.move(3,0);
        System.out.println("MOVE ROOK: " + chessboard.getCurrent());
    }
    public void undo(){
        chessboard.moveBack(3,0);
        System.out.println("UNDO ROOK: " + chessboard.getCurrent());
    }
    public void redo(){
        chessboard.move(3,0);
        System.out.println("REDO ROOK: " + chessboard.getCurrent());
    }
}