package MaaşHesaplayıcı;

import javax.print.attribute.standard.MediaSize;

public class Employee {

    private String NAME;
    private double SALARY;
    private int WORK_HOURS;
    private int HIRE_YEAR;

    Employee(String NAME, int SALARY, int WORK_HOURS, int HIRE_YEAR) {
        this.NAME = NAME;
        this.SALARY = SALARY;
        this.WORK_HOURS = WORK_HOURS;
        this.HIRE_YEAR = HIRE_YEAR;
    }

    public double tax() {
        if (SALARY < 1000) {
            return 0.0;
        }
        else {
            return this.SALARY * 0.03;
        }
    }

    public double bonus() {
        int OVER_WORK = (WORK_HOURS - 40);
        if (OVER_WORK > 0) {
            return OVER_WORK * 30;
        }
        else {
            return 0.0;
        }
    }

    public double raiseSalary() {
        int YEAR_AMOUNT = 2023 - HIRE_YEAR;
        if (YEAR_AMOUNT < 10) {
            return this.SALARY * 0.05;
        }
        else if (YEAR_AMOUNT >= 10 && YEAR_AMOUNT < 20) {
            return this.SALARY * 0.10;
        }
        else {
            return this.SALARY * 0.15;
        }
    }

    public void toString(Employee emp1) {
        double TAX_BONUS_SALARY = ((emp1.SALARY + emp1.bonus()) - emp1.tax());
        double NET_SALARY = TAX_BONUS_SALARY + emp1.raiseSalary();
        System.out.println("Name: " + emp1.NAME);
        System.out.println("Salary: " + emp1.SALARY);
        System.out.println("Work hours: " + emp1.WORK_HOURS);
        System.out.println("Tax: " + emp1.tax());
        System.out.println("Bonus: " + emp1.bonus());
        System.out.println("Raise: " + emp1.raiseSalary());
        System.out.println("Salary with Tax and Bonus: " + TAX_BONUS_SALARY);
        System.out.println("Net salary: " + NET_SALARY);
    }

}
