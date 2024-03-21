package test;
import EmployeeObjects.SalaryEmployee;

public class SalaryEmployeeTest {
    SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);


    public void calculateWeekleyPay(){
        double pay = emp.getSalary()/52;

        System.out.printf("Your weekly salary is:  %.2f %n\"", pay);
    }

    public void holidayBonus(){
        double bonus = emp.getSalary() * .03365;
        System.out.printf("Your holiday bonus is: %.2f %n\"", bonus);
    }

    public static void main(String args[]){

        SalaryEmployeeTest test = new SalaryEmployeeTest();

        //test weekly pay function
        test.calculateWeekleyPay();

        //test holiday bonus function
        test.holidayBonus();
    }
}
