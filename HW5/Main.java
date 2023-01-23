package HWJavaOOP.HW5;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;

import HWJavaOOP.HW5.model.AttendanceLog;
import HWJavaOOP.HW5.model.AttendanceLogEntry;
import HWJavaOOP.HW5.model.Student;
import HWJavaOOP.HW5.presenter.AttendanceService;
import HWJavaOOP.HW5.ui.AttendanceView;
import HWJavaOOP.HW5.util.DataWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        
        AttendanceService studentInfo = new AttendanceService(new HashMap<Student, AttendanceLog>());

        studentInfo.putStudent(new Student("Ivan", "Petrov"),
                            new AttendanceLog(Arrays.asList(  
                            new AttendanceLogEntry(LocalDate.of(2022, 9, 2), true),
                            new AttendanceLogEntry(LocalDate.of(2022, 10, 4), true),
                            new AttendanceLogEntry(LocalDate.of(2022, 11, 12), true),
                            new AttendanceLogEntry(LocalDate.of(2022, 12, 24), true),
                            new AttendanceLogEntry(LocalDate.of(2023, 01, 12), true)
                            )));
        studentInfo.putStudent(new Student("Anna", "Smirnova"),
                            new AttendanceLog(Arrays.asList(  
                            new AttendanceLogEntry(LocalDate.of(2022, 9, 2), false),
                            new AttendanceLogEntry(LocalDate.of(2022, 10, 4), true),
                            new AttendanceLogEntry(LocalDate.of(2022, 11, 12), true),
                            new AttendanceLogEntry(LocalDate.of(2022, 12, 24), false),
                            new AttendanceLogEntry(LocalDate.of(2023, 01, 12), false))));
        studentInfo.putStudent(new Student("Ivan", "Boyko"),
                            new AttendanceLog(Arrays.asList(  
                            new AttendanceLogEntry(LocalDate.of(2022, 9, 2), true),
                            new AttendanceLogEntry(LocalDate.of(2022, 10, 4), false),
                            new AttendanceLogEntry(LocalDate.of(2022, 11, 12), false),
                            new AttendanceLogEntry(LocalDate.of(2022, 12, 24), false),
                            new AttendanceLogEntry(LocalDate.of(2023, 01, 12), false))));
        
        studentInfo.putStudent(new Student("Igor", "Ivanov"),
                            new AttendanceLog(Arrays.asList(  
                            new AttendanceLogEntry(LocalDate.of(2022, 9, 2), true),
                            new AttendanceLogEntry(LocalDate.of(2022, 10, 4), true),
                            new AttendanceLogEntry(LocalDate.of(2022, 11, 12), false),
                            new AttendanceLogEntry(LocalDate.of(2022, 12, 24), true),
                            new AttendanceLogEntry(LocalDate.of(2023, 01, 12), false))));
        
        System.out.println("Запись данных в файл");
        DataWriter.dataWrite("HWJavaOOP/HW5/Data.txt", studentInfo);

        System.out.println("\nВывод журнала посещаемости");
        new AttendanceView().getGroupLog("HWJavaOOP/HW5/Data.txt");
        
        System.out.println("\nВывод посещаемости студента");
        new AttendanceView().getStudentLog("HWJavaOOP/HW5/Data.txt");
        
        System.out.println("\nВывод процента посещаемости");
        new AttendanceView().getAttendancePercentage("HWJavaOOP/HW5/Data.txt");
        
        System.out.println("\nСортировка студентов по проценту посещаемости");
        new AttendanceView().sortedAttendancePercentage("HWJavaOOP/HW5/Data.txt");
        
        System.out.println("\nВывод студентов с посещаемостью ниже 25%");
        new AttendanceView().lowAttendance("HWJavaOOP/HW5/Data.txt");
        
    }
}

