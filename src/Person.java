import java.util.List;
import java.util.Objects;

public abstract class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;
    private List<Person> children;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name) {
        this.name = name;
    }


    public abstract void die(int retirementAge);

    public void infoAboutChildren() {
        if (getChildren() != null) {
            switch (getChildren().size()) {
                case 0 -> System.out.println(getName() + " doesn't have children");
                case 1 -> System.out.println(getName() + " has a child, " + getChildren().get(0));
                default -> System.out.println(getName() + " has " + getChildren().size() + " children");
            }

            int index = 0;

            for (Person child : children) {
                if (getChildren().size() > 1) {
                    System.out.println(index + 1 + ") " + child.name);
                }
                index++;
            }
        }
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && weight == person.weight && Objects.equals(name, person.name) && Objects.equals(children, person.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight, children);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", child=" + children +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (name.length() < o.getName().length()) {
            return -8;
        } else if (name.length() > o.getName().length()) {
            return 8;
        } else {
            if (age > o.getAge()) {
                return 7;
            } else if (age < o.getAge()) {
                return -7;
            } else {
                return 0;
            }
        }
    }
}
