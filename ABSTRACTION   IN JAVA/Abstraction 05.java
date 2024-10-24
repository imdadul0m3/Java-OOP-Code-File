
abstract class Company {
    private String name;
    private String address;
    private int employees;

    public Company(String name, String address, int employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }


    public abstract void generateReport();

    public static void main(String[] args) {
        Company google = new Google("Google", "1600 Amphitheatre Parkway, Mountain View, CA 94043", 100000);

        google.generateReport();
    }
}




class Google extends Company {

    public Google(String name, String address, int employees) {
        super(name, address, employees);
    }

    @Override
    public void generateReport() {
        System.out.println("Company Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Number of Employees: " + getEmployees());
    }
}







