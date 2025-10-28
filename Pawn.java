public class Pawn implements MoveCommand{
    private Board chessboard;

    public Pawn(Board chessboard) {
        this.chessboard = chessboard;
    }
    @Override
    public void move(){
        String m = "MOVE: Pawn moved from A2 to A3";
        System.out.println(m);
    }
    @Override
    public void undo(){
        String m = "UNDO: Pawn moved back from A3 to A2";
        System.out.println(m);
    }
    @Override
    public void redo(){
        this.move();
    }
}
