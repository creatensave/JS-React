import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Knuth;

public class RandomWord {
    public static void main(String[] args) {
        // read in the data
        String[] a = StdIn.readString();

        if(StdIn.isEmpty(a)) {
            StdOut.println("No elements to print");
        }

        // shuffle the array
        Knuth.shuffle(a);

        // print results.
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i]+" ");
    }
}