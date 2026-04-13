class Student {

    // variables to store student data
    int rollNo;
    String name;
    int marks;

    // constructor to initialize values
    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // method to show name in different formats
    void formatName() {
        System.out.println("\nOriginal: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Length: " + name.length());
    }
     // Temporarly testing the value 
    public static void main(String[] args) {
        Student s = new Student(101, "Vinay", 90);
        s.display();
        s.showMarksArray();
        s.formatName();
    }

    // method to store and print marks of 5 students
    void showMarksArray() {
        int marksArr[] = {80, 78, 90, 93, 78};

        System.out.println("\nMarks of 5 students:");
        for (int i = 0; i < marksArr.length; i++) {
            System.out.println(marksArr[i]);
        }
    }
}