import java.util.List;
import java.util.ArrayList;
public class Day2_OOP_EmployeeMS {
    private static Employee user_create(ArrayList<String> data, int i){
        String id = data.get(i);
        String name = data.get(i+1);
        String department = data.get(i+2);
        double salary = Double.parseDouble(data.get(i+3));
        //System.out.println(i +" : "+ id + name + department + salary);
        Employee employee = new Employee(id, name, department, salary);
        return employee;
    }

    public static void main(String[] args) {
        //Adding simple
        //Employee e1 = new Employee();
        String path = "C:/Users/zenasc/IdeaProjects/DailyPactice/Resource/employee_data.csv";
        String path2 = "C:/Users/zenasc/Downloads/week1/Day3/employee_data.csv";
        Readcsv rc = new Readcsv(path);
        Readcsv rc2 = new Readcsv(path2);
        List<Employee> employees = new ArrayList<>();
        //ArrayList<ArrayList<String>> userDataes = new ArrayList<ArrayList<String>>();
        ArrayList<String> userData = rc.getCsvData();

        for(int i = 0; i < userData.size(); i = i + 4 ) {
            employees.add(user_create(userData, i));
        }
        //System.out.println(employees);
        //System.out.println(userData);

        //Other employee adding
        userData = rc2.getCsvData();
        //System.out.println(userData);
        for(int i = 0; i < userData.size(); i = i + 4 ) {
            employees.add(user_create(userData, i));
        }
        //System.out.println(employees);

        for(int ii = 0; ii < employees.size();ii++) {
            System.out.println(employees.get(ii).getdetials());
        }
    }
}
//Develop