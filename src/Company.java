import java.util.Map;
import java.util.Objects;

public class Company {
    private String name;
    private Map<String, String> holidays;


    public Company(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<String, String> holidays) {
        this.holidays = holidays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(holidays, company.holidays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, holidays);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", holidays=" + holidays +
                '}';
    }
}
