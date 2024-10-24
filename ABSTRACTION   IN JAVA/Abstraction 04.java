

abstract class Company {
    String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    abstract void doWork(); 

    public void displayCompanyInfo() {
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        
        SoftwareCompany softwareCompany = new SoftwareCompany("TechCorp");
        softwareCompany.displayCompanyInfo();
        softwareCompany.doWork();
    }
}

class SoftwareCompany extends Company {
    public SoftwareCompany(String companyName) {
        super(companyName);
    }

    @Override
    void doWork() {
        System.out.println("Developing software applications");
    }
}
