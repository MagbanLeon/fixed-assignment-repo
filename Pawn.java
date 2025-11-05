public class Pawn implements MoveCommand{
    private Board chessboard;
    private String name;

    public Pawn(Board chessboard) {
        this.chessboard = chessboard;
        name = "Pawn";
    }
    public void move(){
        chessboard.move(0,1, getName());
        System.out.println("MOVE PAWN: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(0,1, getName());
        System.out.println("UNDO PAWN: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(0,1, getName());
        System.out.println("REDO PAWN: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}
