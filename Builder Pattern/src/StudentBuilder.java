public interface StudentBuilder {
    StudentBuilder setId(int id);
    StudentBuilder setName(String name);
    StudentBuilder setEmail(String email);
    StudentBuilder setPhone(String phone);
    StudentBuilder setDob(String dob);
    StudentBuilder setPassword(String password);
    Student build();
}