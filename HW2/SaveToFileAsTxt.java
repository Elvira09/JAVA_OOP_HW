package HWJavaOOP.HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveToFileAsTxt extends SaveToFile {

    public SaveToFileAsTxt(List<Student> studentGroup) {
        super(studentGroup);
    }

    @Override
    public void saveAs(SaveToFile students, String path) {
        try (FileWriter fw = new FileWriter(path, false)) {
            for (Student element : studentGroup) {
                fw.write(element.toString() + "\n");
            }
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
