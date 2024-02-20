package app.FileOut;

import app.utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    static FileOutputStream fileOut;
    public static void writeToFile(String fileName, String content) {
        String filePath = Constants.BASE_PATH_IN + fileName + ".txt";


        try {
           fileOut = new FileOutputStream(filePath);
          fileOut.write(content.getBytes());
            System.out.println("File successful create");
           fileOut.close();
        } catch (IOException e) {
           System.out.println("Error create");
           e.printStackTrace();
        }
    }

}
