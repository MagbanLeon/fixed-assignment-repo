public class Bishop implements MoveCommand {
    private Board chessboard;
    private String name;

    public Bishop(Board chessboard) {
        this.chessboard = chessboard;
        name = "Bishop";
    }
    public void move(){
        chessboard.move(1,1, getName());
        System.out.println("MOVE BISHOP: " + chessboard.getCurrent(getName()));
    }
    public void undo(){
        chessboard.moveBack(1,1, getName());
        System.out.println("UNDO BISHOP: " + chessboard.getCurrent(getName()));
    }
    public void redo(){
        chessboard.move(1,1, getName());
        System.out.println("REDO BISHOP: " + chessboard.getCurrent(getName()));
    }
    public String getName() {
        return name;
    }
}