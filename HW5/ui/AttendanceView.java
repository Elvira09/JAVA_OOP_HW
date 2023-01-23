package HWJavaOOP.HW5.ui;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import HWJavaOOP.HW5.presenter.Controller;
import HWJavaOOP.HW5.util.DataReader;

public class AttendanceView implements InterfeceVew {

    public String path;

    @Override
    public void getGroupLog(String path) {
        try {
            DataReader.fileReader(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getStudentLog(String path) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя или фамилию студента ");
            String searchQuery = sc.nextLine();
            sc.close();

            DataReader.fileReaderFind(path, searchQuery);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getAttendancePercentage(String path) {
        for (Map.Entry<String, Float> item : new Controller().attendancePercentage(path).entrySet()) {
                System.out.println(item + "%");
        }        
    }

    @Override
    public void lowAttendance(String path) {
        new Controller().lowAttendance(path);
    }

    @Override
    public void sortedAttendancePercentage(String path) {
        new Controller().sortedAttendancePercentage(path);  
    }
    

    

    
    


}
