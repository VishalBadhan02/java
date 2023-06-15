class Employee extends Person{
    public int getEmployId(int EmployId){
        return EmployId;
    }
    
public static void main(String args[]){
    Employee employee = new Employee();
    employee.getFirstname("Vishal");
    employee.getLastname("Badhan");
    employee.getEmployId(03);
    System.out.println("First name"+ employee.getFirstname("Vshal"));
    System.out.println("last name"+ employee.getLastname("Badhan"));
    System.out.println("Employee Id "+ employee.getEmployId(03));
}
}