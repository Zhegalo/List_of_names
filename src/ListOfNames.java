/**
 * Created by Hanna_Zhahala on 06.02.2017.
 */
import java.io.*;

public class ListOfNames { public static void main(String[ ] args) {  BufferedReader br = null;
    try {   br = new BufferedReader(new FileReader("C:\\Users\\Hanna_Zhahala\\IdeaProjects\\ListOfNames\\src\\ListOfNames"));
        String tmp = "";
        while ((tmp = br.readLine()) != null) {
            String[] s = tmp.split("\\s");    // вывод полученных строк
            for (String res : s) {
                System.out.println("Hello "+ res);
            }   }
    } catch (IOException e) {
        e.printStackTrace();  }
    finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
}
