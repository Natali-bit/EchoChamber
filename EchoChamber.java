import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class EchoChamber {

    public static void main(String[] args) {

        BufferedReader reader;
        String line;
        LinkedList <String>list = new LinkedList();
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                line = reader.readLine();
                if (line.isEmpty()) break;
                list.add(line);
            }

            reader.close();

            for (String s : list)
                System.out.println(s);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
