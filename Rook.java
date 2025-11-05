public class Rook implements MoveCommand {
    private Board chessboard;
    private String name;
    
    public Rook(Board chessboard) {
        this.chessboard = chessboard;
        name = "Rook";
    }
    public void move(){
        chessboard.move(3,0, getName());
        System.out.println("MOVE ROOK: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(3,0, getName());
        System.out.println("UNDO ROOK: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(3,0, getName());
        System.out.println("REDO ROOK: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}