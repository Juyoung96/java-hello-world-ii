// ModifiedHelloWorld.java

public class ModifiedHelloWorld {
  
  //main method
  public static void main ( String[] args ) {
    boolean isLate = true;
    int time = 20;
    double minusPoints = 0.5;
    String warning = "You're late!"; 
    
    System.out.println( "Original time: " + time ) ;
    time = time / 2;
    System.out.println( "Modified time: " + time ) ;
    System.out.println( "New Modified time: " + ( time + 2 ) ) ;
    
    System.out.println( "Original points: " + minusPoints ) ;
    minusPoints = minusPoints * 100;
    System.out.println( "Modified points: " + minusPoints ) ;
    System.out.println( "New Modified point: " + ( minusPoints - 50 ) ) ;
    
    
    System.out.println( "\t\"" + warning + "\", said the Teacher." );
    System.out.println ( "Jayhyung is late: " + isLate );
  }
  
}

