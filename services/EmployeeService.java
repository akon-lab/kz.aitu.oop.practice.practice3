package services;

import domain.Employee;
import domain.Salary;
import repository.entities.EmployeeRepository;
import repository.interfaces.IEntityRepository;

import java.sql.Date;
import java.util.LinkedList;

public class EmployeeService {
    private IEntityRepository<Employee> employeeRepo;

    public EmployeeService() {
        employeeRepo = new EmployeeRepository();
    }

    public Employee getUserById(long id) {
        LinkedList<Employee> employees = (LinkedList<Employee>) employeeRepo.query(
                "SELECT * FROM employee WHERE id=" + id
        );
        return (employees.isEmpty() ? null : employees.getFirst());
    }

    public void adduser(String fname,
                        String sname,
                        Integer salary,
                        String birthday) {
        Employee employee=new Employee(fname,sname,salary,Date.valueOf(birthday));
        employeeRepo.add(employee);

    }
}
