package keywords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile
{
    public static void main(String[] args)throws IOException
    {
        FileReader fr = null;
        BufferedReader br = null;

        String fileNAme = "/Users/fortunecookie/Documents/Notes/JAVA/file1";
        try{
        fr = new FileReader(fileNAme);
        br = new BufferedReader(fr);

        String data = "";
        while ((data = br.readLine()) != null)
        {
            System.out.println(data);
        }
    }catch (Exception ex)
        {
            System.out.println("file was not found");
        }


        finally {
            try {
                fr.close();
                br.close();

            }catch (Exception ex2)
            {

            }
        }
    }
}
