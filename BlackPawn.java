public class BlackPawn implements MoveCommand{
    private Board chessboard;
    private String name;

    public BlackPawn(Board chessboard) {
        this.chessboard = chessboard;
        name = "BlackPawn";
    }
    public void move(){
        chessboard.move(0,1, getName());
        System.out.println("BLACK MOVE PAWN: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(0,1, getName());
        System.out.println("BLACK UNDO PAWN: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(0,1, getName());
        System.out.println("BLACK REDO PAWN: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}
