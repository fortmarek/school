import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner

public class Main {

    public static void main(String[] args) {
        File textFile = new File("/Users/marekfort/Development/Ilikeq-iOS4/Resources/Images.xcassets/TabBar/Contents.json");
        Scanner scan = new Scanner(new FileInputStream(textFile));
    }
}
