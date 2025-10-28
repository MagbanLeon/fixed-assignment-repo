public class Rook implements MoveCommand {
    private Board chessboard;
    
    public Rook(Board chessboard) {
        this.chessboard = chessboard;
    }
    
    @Override
    public void move(){
        String m = "MOVE: Rook moved from A1 to A2";
        System.out.println(m);
    }
    public void undo(){
        String m = "UNDO: Rook moved back from A2 to A1";
        System.out.println(m);
    }
    public void redo(){
        this.move();
    }
}