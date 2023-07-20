package SimpleClassesAndObjects;

public class ex_3 {
    public static void main(String[] args) {
        class Student {
            private String fullName;
            private String groupNumber;
            private int[] grades;

            public Student(String fullName, String groupNumber, int[] grades) {
                this.fullName = fullName;
                this.groupNumber = groupNumber;
                this.grades = grades;
            }

            public String getFullName() {
                return fullName;
            }

            public String getGroupNumber() {
                return groupNumber;
            }

            public boolean hasExcellentGrades() {
                for (int grade : grades) {
                    if (grade < 9) {
                        return false;
                    }
                }
                return true;
            }
        }

        Student[] students = new Student[10];

        students[0] = new Student("Иванов И.И.", "Группа 1", new int[]{10, 9, 10, 10, 9});
        students[1] = new Student("Петров П.П.", "Группа 2", new int[]{9, 9, 9, 9, 9});
        students[2] = new Student("Сидоров С.С.", "Группа 1", new int[]{8, 10, 9, 10, 8});

        System.out.println("Студенты с оценками 9 или 10:");
        for (Student student : students) {
            if (student != null && student.hasExcellentGrades()) {
                System.out.println("Фамилия: " + student.getFullName());
                System.out.println("Номер группы: " + student.getGroupNumber());
                System.out.println();
            }
        }
    }
}
