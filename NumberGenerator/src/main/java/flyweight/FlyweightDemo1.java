package flyweight;
class Gazillion1 {
   private static int num = 0;
   private int        row, col;
   public Gazillion1( int maxPerRow ) {
      row = num / maxPerRow;
      col = num % maxPerRow;
      num++;
   }
   void report() {
      System.out.print( " " + row + col );
}  }



public class FlyweightDemo1 {
   public static final int ROWS = 6, COLS = 10;

   public static void main( String[] args ) {
      Gazillion1[][] matrix = new Gazillion1[ROWS][COLS];
      for (int i=0; i < ROWS; i++)
         for (int j=0; j < COLS; j++)
            matrix[i][j] = new Gazillion1( COLS );
      for (int i=0; i < ROWS; i++) {
         for (int j=0; j < COLS; j++)
            matrix[i][j].report();
         System.out.println();
}  }  }