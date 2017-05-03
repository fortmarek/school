import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.*;


public class ShuffleFile {
    public static void main(String args[]) {
        File file= new File("/Users/marekfort/Development/school/java/src/one.txt");
        try {
            FileInputStream fis = new FileInputStream(file);

            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            List<String> list = new ArrayList<>();
            List<String> secondList = new ArrayList<>();

            String line = reader.readLine();
            while(line != null){
                list.add(line);
                line = reader.readLine();
            }

            reader.close();

            File secondFile= new File("/Users/marekfort/Development/school/java/src/two.txt");

            FileInputStream secondFis = new FileInputStream(secondFile);

            BufferedReader secondReader = new BufferedReader(new InputStreamReader(secondFis));


            String secondLine = secondReader.readLine();
            while(secondLine != null){
                secondList.add(secondLine);
                secondLine = secondReader.readLine();
                System.out.println(secondLine);
            }

            secondReader.close();

            list.add(1, secondList.get(0));
            list.add(3, secondList.get(1));
            list.add(secondList.get(2));



            FileOutputStream out = new FileOutputStream("/Users/marekfort/Development/school/java/src/final.txt");

            System.out.println(list);

            for (String str:list) {
                out.write((str + "\n").getBytes(Charset.forName("UTF-8")));
            }

        }

        catch(Exception e){
            System.err.println("ERROR");
        }



        //FileInputStream
        //Stream<String> stream = Files.lines(Paths.get(fileName))
    }
}