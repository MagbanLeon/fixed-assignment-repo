public class TestEditor {
    public static void main(String[] args) {
        Board myBoard = new Board(0,0);
        MoveCommand test = new Pawn(myBoard);
        test.move();
        test.move();
    }
}