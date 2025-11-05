public class Bishop implements MoveCommand {
    private Board chessboard;
    private String name;

    public Bishop(Board chessboard) {
        this.chessboard = chessboard;
        name = "Bishop";
    }
    public void move(){
        chessboard.move(1,1);
        System.out.println("MOVE BISHOP: " + chessboard.getCurrent());
    }
    public void undo(){
        chessboard.moveBack(1,1);
        System.out.println("UNDO BISHOP: " + chessboard.getCurrent());
    }
    public void redo(){
        chessboard.move(1,1);
        System.out.println("REDO BISHOP: " + chessboard.getCurrent());
    }
    public String getName() {
        return name;
    }
}