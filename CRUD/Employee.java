class Employee{
    private String name;
    private int age;
    private int empId;
    public Employee(String name, int age, int empId) {
        this.name = name;
        this.age = age;
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

  public String toString(){
    return "ID : " + this.empId+ " " + "Name : " + this.name + " " + " Age : " + this.age;
  }
    
}