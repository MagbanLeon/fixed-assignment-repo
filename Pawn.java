public class Pawn implements MoveCommand{
    private Board chessboard;
    private String name;

    public Pawn(Board chessboard) {
        this.chessboard = chessboard;
        name = "Pawn";
    }
    public void move(){
        chessboard.move(0,1);
        System.out.println("MOVE PAWN: " + chessboard.getCurrent());
    }
    public void undo(){
        chessboard.moveBack(0,1);
        System.out.println("UNDO PAWN: " + chessboard.getCurrent());
    }
    public void redo(){
        chessboard.move(0,1);
        System.out.println("REDO PAWN: " + chessboard.getCurrent());
    }
    public String getName() {
        return name;
    }
}
