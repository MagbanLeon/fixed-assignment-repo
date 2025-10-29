public class Pawn implements MoveCommand{
    private Board chessboard;

    public Pawn(Board chessboard) {
        this.chessboard = chessboard;
    }
    public void move(){
        chessboard.move(0,1);
        System.out.println(chessboard.getCurrent());
    }
    public void undo(){
        chessboard.moveBack(0,1);
        System.out.println(chessboard.getCurrent());
    }
    public void redo(){
        chessboard.move(0,1);
        System.out.println(chessboard.getCurrent());
    }
}
