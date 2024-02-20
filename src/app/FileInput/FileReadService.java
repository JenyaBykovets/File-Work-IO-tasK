package app.FileInput;

import app.utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
static FileInputStream fileInput;
    public static void readFromFile(String fileName) {
        String filePath = Constants.BASE_PATH_IN + fileName + ".txt";

            try {
                fileInput = new FileInputStream(filePath);
                int data;
                while ((data = fileInput.read()) != -1) {
                    System.out.print((char) data);
                }

            } catch (IOException e) {
                System.out.println("Error read");
                e.printStackTrace();
            }
        }
    }


