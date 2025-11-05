public class TestEditor {
    public static void main(String[] args) {
        Board myBoard = new Board();
        PlayerInvoker newPlayer = new PlayerInvoker();
        newPlayer.Pawn();
        newPlayer.Pawn();
        newPlayer.Pawn();
        newPlayer.Pawn();
        newPlayer.Undo();
        newPlayer.Rook();
    }
}