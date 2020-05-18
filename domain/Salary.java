package domain;

public class Salary {
    private Integer salary;
    private Integer max;
    private Integer min;

    //constructor
    public Salary(){

    }

    public Salary(Integer salary, Integer max, Integer min) {
        setSalary(salary);
        setMax(max);
        setMin(min);
    }

    //getter
    public Integer getSalary() {
        return salary;
    }

    public Integer getMax() {
        return max;
    }

    public Integer getMin() {
        return min;
    }

    //setter
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public void setMin(Integer min) {
        this.min = min;
    }


    //functions
    public void bonusToSalary(Integer bonus) {
        if (salary + bonus > max) {
            System.out.println("This employee need in promotion");
        } else {
            salary += bonus;
        }
    }

    public void promotion() {
        max += (salary / 100) * 10;
        min += (salary / 100) * 10;
    }

    public void fine(Integer fine) {
        salary = -fine;
    }


}
