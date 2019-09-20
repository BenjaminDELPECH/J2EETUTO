package exemple;

public class Student {
    private String name;
    private String firstName;
    private int age;
    private transient boolean editable;

    public Student(String name, String firstName, int age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.editable = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}
