package exercises;
import java.util.GregorianCalendar;
import java.util.Calendar;
        
/*
 * Module 04: Programming Assignment
 * Chapter 10: Exercise 10.14
 * (THE MYDATE CLASS) Design a class named MyDate.
 * @author Zachary Chandos
 */

class MyDate{
    
    private int year;
    private int month;
    private int day;
    
    //no args constructor
    MyDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        }
   
   //args constuctor with long
   MyDate(long elapsedTime){
       GregorianCalendar calendar = new GregorianCalendar();
       calendar.setTimeInMillis(elapsedTime);
       year = calendar.get(Calendar.YEAR);
       month = calendar.get(Calendar.MONTH);
       day = calendar.get(Calendar.DAY_OF_MONTH);
   }
   
   //args contructor with int's for year month and day
   MyDate(int newYear, int newMonth, int newDay){
       year = newYear;
       month = newMonth;
       day = newDay;
   }
   
   void setDate(long elaspsedTime){
       GregorianCalendar calandar = new GregorianCalendar();
       calandar.setTimeInMillis(elaspsedTime);
       year = calandar.get(Calendar.YEAR);
       month = calandar.get(Calendar.MONTH);
       day = calandar.get(Calendar.DAY_OF_MONTH);
   }
   
   //Year getter and setter
   public int getYear(){
       return year;
   }
   public void setYear(int newYear){
       year = newYear;
   }
   
   //Month getter and setter
   public int getMonth(){
       return month;
   }
   public void setMonth(int newMonth){
       month = newMonth;
   }
   
   //Day getter and setter
   public int getDay(){
       return day;
   }
   public void setDay(int newDay){
       day = newDay;
   }
}


public class exercise10point14 {
    
    public static void main(String[] args){
        
        //Creaters objects, one with no args and one with args
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);
        
        //outputs dates of the objects determined by gregorian calandar in class
        System.out.println("The year is " + date1.getYear() + ", the month is " + date1.getMonth() + ", and the day is " + date1.getDay() + ".");
        System.out.println("The year is " + date2.getYear() + ", the month is " + date2.getMonth() + ", and the day is " + date2.getDay() + ".");
    }
}
