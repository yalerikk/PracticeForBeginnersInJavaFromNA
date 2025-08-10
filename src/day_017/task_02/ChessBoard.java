package day_017.task_02;

public class ChessBoard {
    private ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print() {
        for (ChessPiece[] chessPieces : chessBoard) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessPieces[j].getRepresentation());
            }
            System.out.println();
        }
    }
}
