package HWJavaOOP.HW5.presenter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Controller {
    public String path;

    private Map<String, List<String>> getData(String path) {
        Map<String, List<String>> data = new HashMap<String, List<String>>();
        List<String> listLine = new ArrayList<String>();
        String[] array = new String[2];
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null) {
                listLine.add(line.replaceAll("\\s*,\\s*$", ""));
                line = br.readLine();
            }
            br.close();

            for (String el : listLine) {
                array = el.split(":");
                String key = array[0];
                String valueStr = array[1].replace("  ", "");
                data.put(key, Arrays.asList(valueStr.split(",")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }


    public Map<String, Float> attendancePercentage(String path) {
        Map<String, Float> attendancePercentage = new HashMap<>();
        Float countTrue = 0f;
        Float countFalse = 0f;
        for (Map.Entry<String, List<String>> item : getData(path).entrySet()) {
            for (String el : item.getValue()) {
                if (el.contains("true"))
                    countTrue++;
                else
                    countFalse++;
            }
            Float attendance = (countTrue / (countTrue + countFalse)) * 100;
            attendancePercentage.put(item.getKey(), attendance);
            countTrue = 0f;
            countFalse = 0f;
        }
        return attendancePercentage;
    }

    public void sortedAttendancePercentage(String path) {      
        Map<String, Float> newMap = new LinkedHashMap<>();
        attendancePercentage(path).entrySet()
        .stream()
        .sorted(Map.Entry.<String, Float>comparingByValue().reversed())
        .forEach(entry -> newMap.put(entry.getKey(), entry.getValue()));
        for (Map.Entry<String, Float> item : newMap.entrySet()) {
                System.out.println(item + "%");
        }
    }

    
    public void lowAttendance(String path) {
        for (Map.Entry<String, Float> item : attendancePercentage(path).entrySet()) {
            if (item.getValue() > 25)
                continue;
            else
                System.out.println(item + "%");
        }

    }
}
