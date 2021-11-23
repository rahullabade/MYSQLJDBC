package company;

import java.sql.SQLException;
import java.util.List;

public class EmployeePayrollService {
        public List<EmployeePayrollData> readEmployeePayroll() throws SQLException {
            List<EmployeePayrollData> employeePayRollList;
            employeePayRollList = new EmployeePayrollDBService().readData();
            return employeePayRollList;
        }
}
