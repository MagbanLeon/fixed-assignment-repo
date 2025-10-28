public class Bishop implements MoveCommand {
    private Board chessboard;

    public Bishop(Board chessboard) {
        this.chessboard = chessboard;
    }
    @Override
    public void move(){
        String m = "MOVE: Bishop moved from C1 to D2";
        System.out.println(m);
    }
    @Override
    public void undo(){
        String m = "UNDO: Bishop moved back from D2 to C1";
        System.out.println(m);
    }
    @Override
    public void redo(){
        this.move();
    }
}