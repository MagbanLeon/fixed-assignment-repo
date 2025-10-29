public class Queen implements MoveCommand {
    
    private Board chessboard;

    public Queen(Board chessboard) {
        this.chessboard = chessboard;
    }
    public void move(){
        chessboard.move(5,5);
        System.out.println(chessboard.getCurrent());
    }
    public void undo(){
        chessboard.moveBack(5,5);
        System.out.println(chessboard.getCurrent());
    }
    public void redo(){
        chessboard.move(5,5);
        System.out.println(chessboard.getCurrent());
    }
}