package HWJavaOOP.HW5.presenter;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import HWJavaOOP.HW5.model.AttendanceLog;
import HWJavaOOP.HW5.model.Student;

public class AttendanceService implements Iterable<Map<Student, AttendanceLog>>, Entry<Student, AttendanceLog> {
    Student student;
    AttendanceLog log;

    private Map<Student, AttendanceLog> studentInfo;

    public AttendanceService(Map<Student, AttendanceLog> studentInfo) {
        this.studentInfo = studentInfo;
    }
    public Map<Student, AttendanceLog> getStudentInfo() {
        return studentInfo;
    }


    public void putStudent(Student student, AttendanceLog entry) {
        getStudentInfo().put(student, entry);
    }

    @Override
    public Iterator<Map<Student, AttendanceLog>> iterator() {
        return ((AttendanceService) getStudentInfo()).iterator();
    }

    @Override
    public String toString() {
        String[] str = new String[getStudentInfo().size()];
        int i = 0;
        for (Map.Entry<Student, AttendanceLog> el : getStudentInfo().entrySet()) {  
            str[i] = String.format("\n" +el.getKey().toString() + el.getValue().toString());
            i++;
        }
        String line = String.join(" ", str);
        return line;
    }

    @Override
    public Student getKey() {
        return ((AttendanceService) getStudentInfo()).getKey();
    }
    @Override
    public AttendanceLog getValue() {
        return ((AttendanceService) getStudentInfo()).getValue();
    }
    @Override
    public AttendanceLog setValue(AttendanceLog value) {
        return ((AttendanceService) getStudentInfo()).setValue(value);
    }

    public int size() {
        return getStudentInfo().size();
    }

   
    

    

   

}
