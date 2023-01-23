package HWJavaOOP.HW5.model;

import java.util.Iterator;
import java.util.List;

public class AttendanceLog implements Iterable<AttendanceLogEntry> {
    private List<AttendanceLogEntry> log;

    public AttendanceLog(List<AttendanceLogEntry> log) {
        this.log = log;
    }

    @Override
    public Iterator<AttendanceLogEntry> iterator() {
        return log.iterator();
    }

    @Override
    public String toString() {
        String[] str = new String[log.size()];
        int i = 0;
        for (AttendanceLogEntry item : log) {
            str[i] = String.format("  " + item.toString());
            i++;
        }
        String line = String.join(" ", str);
        return line;
    }

}
