package HWJavaOOP.HW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentGroup = new ArrayList<>(Arrays.asList(
                new Student("Иван Иванов", 4.8f),
                new Student("Мария Кузнецова", 5.0f),
                new Student("Степан Кузьмин", 3.6f),
                new Student("Иван Иванов", 4.8f),
                new Student("Ольга Петрова", 4.2f)));

        // System.out.println(studentGroup);

        SaveToFileAsJson json = new SaveToFileAsJson(studentGroup);
        json.saveAs(json, "HWJavaOOP/HW2/HW2.json");

        SaveToFileAsTxt txt = new SaveToFileAsTxt(studentGroup);
        txt.saveAs(txt, "HWJavaOOP/HW2/HW2.txt");

        SaveToFileAsXml xml = new SaveToFileAsXml(studentGroup);
        xml.saveAs(xml, "HWJavaOOP/HW2/HW2.xml");

    }


}
