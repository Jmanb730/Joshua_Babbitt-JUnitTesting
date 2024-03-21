package test;
import EmployeeObjects.CommissionEmployee;

public class CommissionEmployeeTest {
    CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

    public void  increaseSales(double s){

        if(s >= 0){
            emp.increaseSales(s);
            System.out.printf("Your sales have been increased by: %.2f %n\"",s);
            System.out.println();
        }
        else {
            System.out.println("Only positive numbers can be added to your sales number.");
        }
    }

    public int holidayBonus(){
        return 0;
    }

    public void annualRaise(){
        double rate = emp.getRate();

        rate += .002;

        emp.setRate(rate);

        System.out.println("Your new rate is: " + rate);

    }

    public static void main(String[] args){
        CommissionEmployeeTest test = new CommissionEmployeeTest();

        //test sales function
        test.increaseSales(-1.0);
        test.increaseSales(1.0);

        //test holiday raise function
        System.out.println("Your holiday bounus is: " + test.holidayBonus());
        System.out.println();

        //test annual raise function
        test.annualRaise();
        test.annualRaise();

    }
}
