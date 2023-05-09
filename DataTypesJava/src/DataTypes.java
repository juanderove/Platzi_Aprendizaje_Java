public class DataTypes {
    public static void main(String[] args) {
        int n = 123456789;
        long nL = 123456789L;

        double nD = 123.45678;
        float nF = 0.115F;

        var salary = 1000;//int
        //pension 3%
        var pension = salary * 0.03;//double
        System.out.println(salary);
        System.out.println(pension);

        var totalSalary = salary - pension;
        System.out.println(totalSalary);

        var employeeName = "Juan David";
        System.out.println("EMPLOTEE: "+ employeeName);

    }
}
