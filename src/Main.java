import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by s0urc3d3v3l0pm3nt on 11/21/2015.
 */
public class Main {
    public static String drawChristmasTree(int size, int sumination){
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if ( j % 10 == 0){
                    for (int k = 0; k < j + sumination; k++) {
                        builder.append('*');
                    }
                }
                builder.append('*');
            }
            builder.append('\n');
        }

        return builder.toString();
    }
    public static void main(String[] args) {
        String tree = drawChristmasTree(40, 3);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("out.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (writer != null) {
                writer.write(tree);
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
