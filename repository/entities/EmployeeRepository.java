package repository.entities;

import domain.Employee;
import repository.db.PostgresReposirory;
import repository.interfaces.IDBRepository;
import repository.interfaces.IEntityRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class EmployeeRepository implements IEntityRepository<Employee> {
    private IDBRepository dbrepo;

    public void UserRepository() {
        dbrepo = new PostgresReposirory();
    }

    @Override
    public void add(Employee entity) {
        try {
            Statement statement = dbrepo.getConnection().createStatement();
            String sql = "INSERT INTO users (fname,sname,salary,birthday) " +
                    "VALUES('" +
                    "" + entity.getFname() + "'," +
                    "'" + entity.getSname() + "'," +
                    "'" + entity.getSalary() + "'," +
                    "'" + entity.getBirthday() + "'" +
                    ")";
            statement.execute(sql);
        } catch (Exception throwables) {
            System.out.println(throwables.getMessage());
        }
    }

    @Override
    public void update(Employee entity) {

    }

    @Override
    public void remove(Employee entity) {
        try {
            String sql = "DELETE FROM employee WHERE id = "+entity.getId();
            PreparedStatement preparedStatement=dbrepo.getConnection().prepareStatement(sql);
            preparedStatement.setString(1,entity.getFname()+" "+entity.getSname());
            preparedStatement.executeQuery();
        } catch (SQLException ex) {
            ex.getMessage();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    @Override
    public Iterable<Employee> query(String sql) {

        try {
            Statement st = dbrepo.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            LinkedList<Employee> employees = new LinkedList<>();
            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getLong("id"),
                        rs.getString("fname"),
                        rs.getString("sname"),
                        rs.getInt("salary"),
                        rs.getDate("birthday")
                );
                employees.add(employee);
            }
            return employees;

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return null;
    }
}
