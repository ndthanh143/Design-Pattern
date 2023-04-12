public class StudentConcreteBuilder implements StudentBuilder{
    private int id;
    private String name;
    private String email;
    private String phone;
    private String dob;
    private String password;

    @Override
    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public StudentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public StudentBuilder setDob(String dob) {
        this.dob = dob;
        return this;
    }

    @Override
    public StudentBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public Student build() {
        return new Student(id, name, email, phone, dob, password);
    }
}
