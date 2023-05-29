package bai1;

public class People {
    String name;
    int age;
    String sex;
    double height;
    double weight;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public People() {

    }

    public People(String name, int age, String sex, double height, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public People(String name, int age, String sex, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;

    }

    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public People(String name) {
        this.name = name;


    }

    @Override
    public String toString() {
        return "Tên :" + name
                + "     Tuổi :" + age + "     Giới tính : " + sex + "     Chiều cao :" + height + "     Cân nặng : " + weight;
    }


}

class Teacher extends People {
    String level;
    double experience;
    String subject;


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
        super();
    }

    public Teacher(String level) {
        super();
        this.level = level;
    }

    public Teacher(String level, double experience) {
        super();
        this.level = level;
        this.experience = experience;

    }

    public Teacher(String level, double experience, String subject) {
        super();
        this.level = level;
        this.experience = experience;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "trình độ : " + level + "     Kinh Nghiệm : " + experience + "     Bộ môn : " + subject;
    }

    public static void main(String[] args) {
        People P = new People("Tuyên", 18, "Nam", 172.5, 59);
        Teacher T = new Teacher("TS", 5000, "múa");
        System.out.println(P);
        System.out.println(T);
    }
    /*Xây dựng lớp People gồm các thành phần sau:
- Thuộc tính: tên (name), tuổi (age), giới tính (sex), chiều cao (height), cân nặng (weight)====
- Phương thức:
- getter/setter cho từng thuộc tính  ===
- phương thức khởi tạo không tham số ==
- phương thức khởi tạo đầy đủ tham số ==
- phương thức toString trả về thông tin people ==
Xây dựng lớp Teacher kế thừa từ lớp People có thêm các thành phần sau:
- Thuộc tính: trình độ (level: ThS, TS), kinh nghiệm (experience), bộ môn (subject)
- Phương thức:
- getter/setter cho từng thuộc tính
- phương thức khởi tạo không tham số sử dụng super
- phương thức khởi tạo đầy đủ tham số sử dụng super
- phương thức toString trả về thông tin teacher
Viết hàm main để thực hiện kiểm tra các lớp vừa định nghĩa
*/
}

