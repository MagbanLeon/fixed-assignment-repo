public class King implements MoveCommand {
    private Board chessboard;
    
    public King(Board chessboard) {
        this.chessboard = chessboard;
    }
    @Override
    public void move(){
        String m = "MOVE: King moved from E1 to E2";
        System.out.println(m);
    }
    @Override
    public void undo(){
        String m = "UNDO: King moved back from E2 to E1";
        System.out.println(m);
    }
    @Override
    public void redo(){
        this.move();
    }
}