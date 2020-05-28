package gvsucis;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class SalariedEmployee {

  private String name;
  private double[] weeklyHours;
  private double salary;

  public SalariedEmployee(String name, double salary) {
    this.name = name;
    weeklyHours = new double[52];
    this.salary = salary;
  }

  public static String dateForWeek(int week, int year) {
    GregorianCalendar date = new GregorianCalendar();
    date.setWeekDate(2020, week + 1, Calendar.SATURDAY);
    SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
    return format.format(date.getTime());
  }

  public double pay(int week) {
    return salary / 52.0;
  }

  public double averageHoursPerWeek(int numWeeks) {
    double sum = 0.0;
    for (int i = 0; i < numWeeks; ++i) {
      sum += weeklyHours[i];
    }
    return sum / numWeeks;
  }

  public void recordHours(int week, double hours) {
    weeklyHours[week] = hours;
  }

  public void printPayStatement(int numWeeks, PrintStream out) {

    out.println("-----------------------");
    out.println("Pay History for " + name);
    out.println("Week ending\tHours\tAmount");
    for (int i = 0; i < numWeeks; ++i) {
      out.printf("%s\t%5.2f\t$%9.2f\n", dateForWeek(i, 2020), weeklyHours[i], pay(i));
    }
    out.printf("Average hours per week:  %.2f\n", averageHoursPerWeek(numWeeks));
    if (averageHoursPerWeek(numWeeks) < 37) {
      out.println("!!!! Hours too low");
    }
  }

}