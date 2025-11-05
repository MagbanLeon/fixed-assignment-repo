public class BlackRook implements MoveCommand {
    private Board chessboard;
    private String name;
    
    public BlackRook(Board chessboard) {
        this.chessboard = chessboard;
        name = "BlackRook";
    }
    public void move(){
        chessboard.move(3,0, getName());
        System.out.println("BLACK MOVE ROOK: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(3,0, getName());
        System.out.println("BLACK UNDO ROOK: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(3,0, getName());
        System.out.println("BLACK REDO ROOK: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}