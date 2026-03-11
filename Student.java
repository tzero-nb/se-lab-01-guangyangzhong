public class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("姓名：" + name + "，学号：" + id);
    }

    public static void main(String[] args) {
        Student stu = new Student("钟广阳", "2024400479");
        stu.display();
    }
}