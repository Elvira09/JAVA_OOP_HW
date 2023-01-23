package HWJavaOOP.HW5.model;

import java.time.LocalDate;

public class AttendanceLogEntry { 
    private LocalDate date;
    private boolean visit;

    public AttendanceLogEntry(LocalDate date, boolean visit) {
        this.date = date;
        this.visit = visit;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isVisit() {
        return visit;
    }

    @Override
    public String toString() {
        return " attendance " + date + " " + visit + ",";
    }

    
}
