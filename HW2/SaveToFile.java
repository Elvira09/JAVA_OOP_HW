package HWJavaOOP.HW2;

import java.util.List;

public abstract class SaveToFile {
    List<Student> studentGroup;

    public SaveToFile(List<Student> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getStudentGroup() {
        return studentGroup;
    }

    abstract void saveAs(SaveToFile students, String path);

}
