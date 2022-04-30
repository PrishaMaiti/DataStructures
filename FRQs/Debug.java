public class Debug {
    public static boolean on = true;

    public static void print( String s ) {
        if (on) System.out.println(s);
    }

    public static void print( int x ) {
        Debug.print("" + x);
    }
}
