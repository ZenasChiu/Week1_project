public class Employee {
    private String name;
    private String e_Id;
    private String deparment;
    private double salary;

    public Employee(String e_Id, String name, String deparment, double salary){
        this.name = name ;
        this.e_Id = e_Id;
        this.deparment = deparment;
        this.salary = salary;
    }

    public String get_name(){
        return name;
    }
    public String getE_Id(){
        return e_Id;
    }

    public String get_Department(){
        return deparment;
    }

    public double get_salary(){
        return salary;
    }

    //Adjustable detail for this type of class
    public void setDeparment(String Deparment){
        this.deparment = Deparment;
    }

    public void setSalary(double Salary){
        this.salary = Salary;
    }

    public String getdetials(){
        String details = String.format( "ID :%s\nName :%s\nDepartment :%s\nSalary :%f"
                            ,getE_Id(),get_name(),get_Department(),get_salary());
        return details;
    }

}
//Develop