/**
 * Created by marekfort on 5/17/17.
 */

import java.io.*;
import java.util.Collections;
import java.util.Scanner;

public class RecursiveDir {
    public static void main(String args[]) {
        
        askForFile();

    }

    private static void askForFile() {
        System.out.println("Print all subs of this file: ");
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.next());
        if (file.exists()) {
            getAllFolderChildren(file);
        }
        else {
            System.out.println("File does not exist");
            askForFile();
        }

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
