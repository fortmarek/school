/**
 * Created by marekfort on 5/17/17.
 */

import java.io.*;
import java.util.Collections;

public class RecursiveDir {
    public static void main(String args[]) {
        File file = new File("/Users/marekfort/Development/school");
        System.out.println(file.getAbsolutePath());

        getAllFolderChildren(file);

    }

    private static int emptySpaceCounter = "";

    private static void getAllFolderChildren(File file) {
        try {
            File[] children = file.listFiles();
            assert children != null;
            for (File child: children) {
                System.out.println("- " + emptySpace + child.getName());
                emptySpace += " ";
                getAllFolderChildren(child);
                String.join("", Collections.nCopies(8, " "));
            }
        }
        catch (Exception e) {
            emptySpace = "";
        }

    }
}
