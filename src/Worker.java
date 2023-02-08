import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {
    private double minSalary;
    private double maxSalary;
    private final int CHILD_ALLOWANCE = 200;
    private List<Company> companies;
    private Set<SuperannuationFund> funds;

    public Worker(String name, int age, int height, int weight, double minSalary, double maxSalary) {
        super(name, age, height, weight);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Worker(String name) {
        super(name);
    }

    @Override
    public void die(int retirementAge) {
        System.out.println(getName() + " didn't live up to pension");
    }


    @Override
    public double calculatePension(int startUpAge, int retirementAge) {
        int experience;
        if (getAge() > startUpAge && getAge() < retirementAge) {
            experience = getAge() - startUpAge;
        } else if (getAge() >= retirementAge) {
            experience = retirementAge - startUpAge;
        } else {
            experience = 0;
        }

        double changeMinSalary = 0;
        if (getChildren() != null) {
            changeMinSalary = minSalary + CHILD_ALLOWANCE * getChildren().size();
        }

        double theBestPension = 0;

        for (SuperannuationFund fund : funds) {
            double pension = fund.pensionCalculation(experience, changeMinSalary, maxSalary);
            if (pension > theBestPension) {
                theBestPension = pension;
            }
        }
        return theBestPension;
    }

    public void workedOut() {
        switch (companies.size()) {
            case 0 -> System.out.println(getName() + " haven't worked officially anywhere");
            case 1 -> System.out.println(getName() + " only worked in " + companies.get(0).getName());
            default -> {
                System.out.print(getName() + " has worked for the following companies: ");

                for (int i = companies.size() - 1; i > 0; i--) {
                    System.out.print(companies.get(i).getName() + ", ");
                }
                System.out.println(companies.get(0).getName() + ".");
            }
        }
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getCHILD_ALLOWANCE() {
        return CHILD_ALLOWANCE;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public Set<SuperannuationFund> getFunds() {
        return funds;
    }

    public void setFunds(Set<SuperannuationFund> funds) {
        this.funds = funds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return Double.compare(worker.minSalary, minSalary) == 0 && Double.compare(worker.maxSalary, maxSalary) == 0 && CHILD_ALLOWANCE == worker.CHILD_ALLOWANCE && Objects.equals(companies, worker.companies) && Objects.equals(funds, worker.funds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minSalary, maxSalary, CHILD_ALLOWANCE, companies, funds);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", CHILD_ALLOWANCE=" + CHILD_ALLOWANCE +
                ", companies=" + companies +
                ", funds=" + funds +
                '}';
    }
}
