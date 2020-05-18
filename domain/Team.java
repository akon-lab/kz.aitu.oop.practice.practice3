package domain;

import java.util.HashMap;
import java.util.HashSet;

public class Team {
    private long id;
    private String name;
    private HashSet<Employee> employees;

    //constrcture
    public Team() {

    }

    public Team(String name, HashSet<Employee> employess) {
        setName(name);
        setEmployees(employees);
    }

    public Team(Integer id, String name, HashSet<Employee> employess) {
        setId(id);
        setName(name);
        setEmployees(employees);
    }

    //getter
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Employee> getEmployees() {
        return employees;
    }

    //setter
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(HashSet<Employee> employees) {
        this.employees = employees;
    }

    //functions
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

}
