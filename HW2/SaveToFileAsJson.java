package HWJavaOOP.HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveToFileAsJson extends SaveToFile {

    public SaveToFileAsJson(List<Student> studentGroup) {
        super(studentGroup);
    }

    @Override
    public void saveAs(SaveToFile students, String path) {
        try (FileWriter fw = new FileWriter(path, false)) {
            fw.write("{\n");
            for (int i = 0; i < studentGroup.size() - 2; i++) {
                fw.write("\t\"" + studentGroup.get(i).getName() + "\" : "
                        + studentGroup.get(i).getGrade() + ",\n");
            }
            fw.write("\t\"" + studentGroup.get(studentGroup.size() - 1).getName() + "\" : "
                    + studentGroup.get(studentGroup.size() - 1).getGrade() + "\n");
            fw.write("}");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }



    }