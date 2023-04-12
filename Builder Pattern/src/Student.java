public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String dob;
    private String password;

    public Student(int id, String name, String email, String phone, String dob, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDob() {
        return dob;
    }

    public String getPassword() {
        return password;
    }
}
