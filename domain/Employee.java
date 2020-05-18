package domain;

import java.sql.Date;

public class Employee {
    private long id;
    private String fname;
    private String sname;
    private Salary salary;
    private Date birthday;


    //constructor
    public Employee() {

    }

    public Employee(String fname, String sname, Integer salary, Date birthday) {

        setFname(fname);
        setSname(sname);
        setSalary(salary);
        setBirthday(birthday);
    }

    public Employee(long id, String fname, String sname, Integer salary, Date birthday) {
        setId(id);
        setFname(fname);
        setSname(sname);
        setSalary(salary);
        setBirthday(birthday);
    }

    //get
    public long getId() {
        return id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getSname() {
        return sname;
    }

    public String getFname() {
        return fname;
    }

    public Salary getSalary() {
        return salary;
    }

    //set
    public void setSalary(Integer salary) {
        this.salary = new Salary(salary,salary+(salary/10),salary-(salary/10));
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", sname='" + sname + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
