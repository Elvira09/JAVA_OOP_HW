package HWJavaOOP.HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveToFileAsXml extends SaveToFile {

    public SaveToFileAsXml(List<Student> studentGroup) {
        super(studentGroup);
    }

    @Override
    public void saveAs(SaveToFile students, String path) {
        try (FileWriter fw = new FileWriter(path, false)) {
            fw.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n \t<students>\n");
            for (Student element : studentGroup) {
                fw.write("\t\t<student>\n\t\t\t<name>" + element.getName() + "</name>\n" +
                        "\t\t\t<grade>" + element.getGrade() + "</grade>\n" +
                        "\t\t</student>\n");
            }
            fw.write("\t</students>");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
