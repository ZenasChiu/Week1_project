public class Employee {
    private String name;
    private String e_Id;
    private String deparment;
    private double salary;

    public Employee(String name, String e_Id, String deparment, double salary){
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

}
//Develop