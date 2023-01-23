package HWJavaOOP.HW5.util;

import java.io.FileWriter;
import java.io.IOException;

import HWJavaOOP.HW5.presenter.AttendanceService;


public class DataWriter {
    AttendanceService studentInfo;
    public String path;

    
    public static void dataWrite(String path, AttendanceService studentInfo) {        
        try(FileWriter writer = new FileWriter(path, true)) 
        {
                writer.write(studentInfo.toString());
                writer.append("\n");
                writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}