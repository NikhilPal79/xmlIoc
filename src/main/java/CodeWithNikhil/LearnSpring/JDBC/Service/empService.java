package CodeWithNikhil.LearnSpring.JDBC.Service;

import CodeWithNikhil.LearnSpring.JDBC.Dao.EmpDAO;
import CodeWithNikhil.LearnSpring.JDBC.Entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class empService {

    @Autowired
    EmpDAO empDAO;


    public void displayAllEmp(){
        List<Emp> empList1 = empDAO.displayAllEmpFromDb();
        System.out.println(empList1);
    }

    public void displayOnlyTwoEmp(){
        List<Emp> empList2 = empDAO.displayAllEmpFromDbWithBean();
        System.out.println(empList2);
    }

}
