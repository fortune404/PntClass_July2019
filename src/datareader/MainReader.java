package datareader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainReader
{
    public static void main(String[] args)
    {
        FileReader fr = null;
        BufferedReader br = null;

        String fileName = "file1";
        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String data = "";
            while ((data = br.readLine()) != null)
            {
                System.out.println(data);
            }
        } catch (Exception ex) {
            System.out.println("file was not found");
        }finally {
            try {
                br.close();
                fr.close();
            }catch (Exception ex2)
            {

            }
        }
    }
}
