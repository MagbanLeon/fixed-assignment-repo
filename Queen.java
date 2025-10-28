public class Queen implements MoveCommand {
    
    private Board chessboard;

    public Queen(Board chessboard) {
        this.chessboard = chessboard;
    }
    @Override
    public void move(){
        String m = "MOVE: Queen moved from D1 to D2";
        System.out.println(m);
    }
    @Override
    public void undo(){
        String m = "UNDO: Queen moved back from D2 to D1";
        System.out.println(m);
    }
    @Override
    public void redo(){
        this.move();
    }
}