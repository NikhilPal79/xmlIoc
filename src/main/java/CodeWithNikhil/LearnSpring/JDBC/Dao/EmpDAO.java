package CodeWithNikhil.LearnSpring.JDBC.Dao;

import CodeWithNikhil.LearnSpring.JDBC.Entity.Emp;
import CodeWithNikhil.LearnSpring.JDBC.QueryConstant.QueryConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmpDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    ///  THIS WAS MANUALLY FETCHING DATA FROM DATABASE[ // no need to learn but should know what row mapper do ? ]

    public List<Emp> displayAllEmpFromDb(){

        RowMapper<Emp> empRowMapper = new RowMapper<>() {
            @Override
            public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
                Emp emp = new Emp();
                emp.setEmpId(rs.getInt("EMP_ID"));
                emp.setEmpFirstName(rs.getString("EMP_FIRSTNAME"));
                emp.setEmpLastName(rs.getString("EMP_LASTNAME"));
                emp.setStreetName(rs.getString("EMP_STREETNAME"));


                return emp;
            }
        };

        List<Emp> empList = jdbcTemplate.query(QueryConstant.FETCH_EMP, empRowMapper);
        return empList;

    }

    /// ALTERNATE AND EASY METHOD

    public List<Emp> displayAllEmpFromDbWithBean(){

        List<Emp> empList = jdbcTemplate.query(QueryConstant.FETCH_EMP1, new BeanPropertyRowMapper<>(Emp.class));
        return empList;

    }


}
