public class Knight implements MoveCommand {
    private Board chessboard;
    
    public Knight(Board chessboard) {
        this.chessboard = chessboard;
    }
    public void move(){
        chessboard.move(1,2);
        System.out.println("MOVE KNIGHT: " + chessboard.getCurrent());
    }
    public void undo(){
        chessboard.moveBack(1,2);
        System.out.println("UNDO KNIGHT: " + chessboard.getCurrent());
    }
    public void redo(){
        chessboard.move(1,2);
        System.out.println("REDO KNIGHT: " + chessboard.getCurrent());
    }
}