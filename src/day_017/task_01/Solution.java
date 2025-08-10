package day_017.task_01;

public class Solution {
    public static void main(String[] args) {
        ChessPiece[] chessPieces = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK
        };

        addSpace(chessPieces);
    }

    public static void addSpace(ChessPiece[] chessPieces) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chessPieces.length; i++) {
            builder.append(chessPieces[i].getRepresentation());
            if (i < chessPieces.length - 1) {
                builder.append(" "); // Добавляем пробел, если это не последняя фигура
            }
        }
        System.out.println(builder);
    }
}
