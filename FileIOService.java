package kg.ksucta.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Aibek on 12.11.2016.
 */
public class FileIOService implements IOService {
    private static final String FILE_PATH = "C://log.txt";
    private FileWriter fileWriter;

    private static FileIOService instance = new FileIOService();

    private FileIOService() {
        try {
            this.fileWriter = new FileWriter(new File(FILE_PATH));
        } catch (IOException e) {
            this.fileWriter = null;
        }
    }

    public static FileIOService me() {
        return instance;
    }

    @Override
    public void write(String message) {

    }

    @Override
    public String scan(String message) {
        return null;
    }

    @Override
    public Integer scanInt(String message) {
        return null;
    }
}
