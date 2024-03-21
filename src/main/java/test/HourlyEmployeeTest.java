package test;

import EmployeeObjects.HourlyEmployee;
public class HourlyEmployeeTest {
    HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);



    public void increaseHours(double h){

        if(h >= 0) {
             emp.increaseHours(h);
             System.out.printf("Your new hours are: %.2f %n\"",h);
        }
        else {
            System.out.println("Can't increase by negative hours.");
            System.out.println();
        }

    }

    public void annualRaise(){
        double raise = (emp.getWage() * .05) + emp.getWage();

        emp.setPay(raise);

        System.out.printf("Your new wage is:  %.2f %n", raise);

    }
    public void calculateWeeklyPay(){
        double hours = emp.getHoursWorked();
        double pay = emp.getWage();
        if(hours > 40.00){
            pay = 40 * pay + (pay * 1.5 * (hours-40));

        }
        else{
            pay = pay * hours;
        }
        System.out.printf("Your weekly pay is: %.2f %n\"",pay);

    }

    public void resetWeek(){
        emp.resetWeek();
    }

    public static void main(String args[]){
        HourlyEmployeeTest test = new HourlyEmployeeTest();

        //test hours function
        test.increaseHours(-15);

        test.increaseHours(35);



        //test raise function
        test.annualRaise();


        //test weekly pay function

        test.calculateWeeklyPay();
        System.out.println();

        test.resetWeek();
        test.increaseHours(45);

        test.calculateWeeklyPay();
    }

}
