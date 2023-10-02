import java.util.List;

public class Date {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public Date(int day, int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String toString() {
        return List.of(year,month,day).toString();
    }
    public boolean equals(Object other) {
        if(this==other) return true;
        if(other==null || other.getClass()!=this.getClass()) return false;
        Date that = (Date) other;
        return this.day==that.day && this.year==that.year && this.month==that.month;
    }
}
