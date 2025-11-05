public class King implements MoveCommand {
    private Board chessboard;
    private String name;
    
    public King(Board chessboard) {
        this.chessboard = chessboard;
        name = "King";
    }
    public void move(){
        chessboard.move(1,1, getName());
        System.out.println("MOVE KING: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(1,1, getName());
        System.out.println("UNDO KING: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(1,1, getName());
        System.out.println("REDO KING: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}