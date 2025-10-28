public class TestEditor {
    public static void main(String[] args) {
        PlayerInvoker myChessboard = new PlayerInvoker();
        myChessboard.move(1);
        myChessboard.move(2);
        myChessboard.move(3);
        myChessboard.move(4);
        myChessboard.move(5);

        for (int i = 0; i < 6; i++) {
            myChessboard.Undo(i);
        }
        for (int i = 0; i < 6; i++) {
            myChessboard.Redo(i);
        }
    }
}