public class Knight implements MoveCommand {
    private Board chessboard;
    
    public Knight(Board chessboard) {
        this.chessboard = chessboard;
    }
    @Override
    public void move(){
        String m = "MOVE: Knight moved from B1 to C3";
        System.out.println(m);
    }
    @Override
    public void undo(){
        String m = "UNDO: Pawn moved back from C3 to B1";
        System.out.println(m);
    }
    @Override
    public void redo(){
        this.move();
    }
}