package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary > 0 && salary <= 10000) {
            System.out.println(salary * 0.85); // taxis 15%
        } else if (salary > 10000 && salary <= 20000) {
            System.out.println(salary * 0.82); // taxis 18%
        } else if (salary > 20000) {
            System.out.println(salary * 0.80); //taxis 20%;
        } else {
            System.out.println("wrong input!");
        }
    }


    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.calculateSalary(15000);
        salaryCalculator.calculateSalary(10000);
    }
}
