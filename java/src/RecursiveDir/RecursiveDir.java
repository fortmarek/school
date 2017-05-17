/**
 * Created by marekfort on 5/17/17.
 */

import java.io.*;
import java.util.Collections;

public class RecursiveDir {
    public static void main(String args[]) {
        File file = new File("/Users/marekfort/Design");
        System.out.println(file.getAbsolutePath());

        getAllFolderChildren(file);

    }

    private static void getAllFolderChildren(File file) {
        try {
            File[] children = file.listFiles();

            if (children != null) {
                System.out.println("Obsah " + file.getAbsolutePath());
            }

            assert children != null;
            for (File child: children) {
                System.out.println("- " + child.getName());
            }
            for (File child: children) {
                getAllFolderChildren(child);
            }
        }
        catch (Exception e) {

        }

    }

    private static String emptySpaces(int n) {
        return String.join("", Collections.nCopies(n, " "));
    }
}
