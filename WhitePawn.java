public class WhitePawn implements MoveCommand{
    private Board chessboard;
    private String name;

    public WhitePawn(Board chessboard) {
        this.chessboard = chessboard;
        name = "WhitePawn";
    }
    public void move(){
        chessboard.move(0,1, getName());
        System.out.println("WHITE MOVE PAWN: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(0,1, getName());
        System.out.println("WHITE UNDO PAWN: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(0,1, getName());
        System.out.println("WHITE REDO PAWN: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}
