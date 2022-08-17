public class ExSingleton {
    public static class ChessBoard {

        static private ChessBoard instance = null;

        private ChessBoard(){}

        static ChessBoard getInstance (){

            if (instance == null)
                instance = new ChessBoard();
            return instance;

        }

        public static void main (String args []){
            ChessBoard tabuleiro1 = ChessBoard.getInstance();
            ChessBoard tabuleiro2 = ChessBoard.getInstance();

            System.out.println(tabuleiro1);
            System.out.println(tabuleiro2);

        }

    }
}
