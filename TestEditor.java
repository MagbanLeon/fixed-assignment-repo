public class TestEditor {
    public static void main(String[] args) {
        Board myBoard = new Board();

        PlayerInvoker playerBlack = new PlayerInvoker(myBoard);
        PlayerInvoker playerWhite = new PlayerInvoker(myBoard);

        playerBlack.BlackPawn();
        playerWhite.WhitePawn();
        playerBlack.BlackPawn();
        playerWhite.WhitePawn();

        // newPlayer.Rook();
        // newPlayer.King();
        // newPlayer.King();
        // newPlayer.Queen();
    }
}