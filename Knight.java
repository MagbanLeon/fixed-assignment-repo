public class Knight implements MoveCommand {
    private Board chessboard;
    private String name;
    
    public Knight(Board chessboard) {
        this.chessboard = chessboard;
        name = "Knight";
    }
    public void move(){
        chessboard.move(1,2);
        System.out.println("MOVE KNIGHT: " + chessboard.getCurrent());
    }
    public void undo(){
        chessboard.moveBack(1,2);
        System.out.println("UNDO KNIGHT: " + chessboard.getCurrent());
    }
    public void redo(){
        chessboard.move(1,2);
        System.out.println("REDO KNIGHT: " + chessboard.getCurrent());
    }
    public String getName() {
        return name;
    }
}