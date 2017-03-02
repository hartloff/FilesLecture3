import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FilesLecture3 {


    // 5 points
    static void Q1(String filename, ArrayList<String> lines) {

        // TODO: Write all elements of the ArrayList into a new file with a name provided by the filename variable.
        //       The data can be written on separate lines or all on the same line.



    }


    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>();
        lines.add("You are");
        lines.add("writing this text");
        lines.add("to");
        lines.add("a");
        lines.add("file");

        Q1("src/outputFile.txt", lines);
    }

}
