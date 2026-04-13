// Common Student class
class Student {
    String name;
    String comments;

    Student(String name, String comments) {
        this.name = name;
        this.comments = comments;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Comments: " + comments);
    }
}

// CollegeStudent extends Student
class CollegeStudent extends Student {
    String college;
    String course;

    CollegeStudent(String name, String comments, String college, String course) {
        super(name,  comments); // reuse Student constructor
        this.college = college;
        this.course = course;
    }

    void showDetails() {
        super.showDetails(); // reuse Student details
        System.out.println("College: " + college);
        System.out.println("Course: " + course);
    }



    public static void main(String[] args) {
        Student s1 = new Student("Vinay",  "Good in science" );
        CollegeStudent s2 = new CollegeStudent("Vinay",  "Active in coding", "Grater noida college", "BTECH");

        System.out.println("General Student:");
        s1.showDetails();

        System.out.println("\nCollege Student:");
        s2.showDetails();
    }
}