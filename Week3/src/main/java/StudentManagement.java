import java.lang.StringBuilder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentManagement {
  /**
   * Checks whether the two students belong to the same group.
   *
   * @param s1 - The first student.
   * @param s2 - The second student.
   * @return Result of the check.
   */
  public static boolean sameGroup(Student s1, Student s2) {
    return s1.getGroup().equals(s2.getGroup());
  }

  // public: for test cases

  public Student[] students = new Student[100];
  private int numStudents = 0;

  /**
   * Adds a new student to the list.
   *
   * @param newStudent - A Student object.
   */
  public void addStudent(Student newStudent) {
    students[numStudents++] = newStudent;
  }

  /**
   * Returns students by their groups, in insertion order.
   *
   * @return The resulting string.
   */
  public String studentsByGroup() {
    String[] groupNames = new String[100];
    int numGroups = 0;
    Map<String, List<Student>> m = new HashMap<String, List<Student>>();
    for (int i = 0; i < numStudents; ++i) {
      Student s = students[i];
      if (!m.containsKey(s.getGroup())) {
        List<Student> ls = new LinkedList<Student>();
        ls.add(s);
        m.put(s.getGroup(), ls);
        groupNames[numGroups++] = s.getGroup();
      } else {
        m.get(s.getGroup()).add(s);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numGroups; ++i) {
      String groupName = groupNames[i];
      sb.append(groupName).append("\n");
      for (Student s : m.get(groupName)) {
        sb.append(s.getInfo()).append("\n");
      }
    }

    return sb.toString();
  }

  /**
   * Removes a student from the group.
   *
   * @param id - The ID of the student to remove.
   */
  public void removeStudent(String id) {
    for (int i = 0; i < numStudents; ) {
      if (students[i].getId().equals(id)) {
        // Remove
        for (int j = i; j < numStudents; ++j) {
          students[j] = students[j + 1];
        }
        --numStudents;
      } else {
        ++i;
      }
    }
  }

  /**
   * Application entry point.
   *
   * @param args - Command line arguments.
   */
  public static void main(String[] args) {
    Student a = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
    a.setGroup("K62CC");
    Student b = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
    b.setGroup("K62CC");
    Student c = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
    c.setGroup("K62CB");
    Student d = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
    d.setGroup("K62CB");

    Student e = new Student("This should get deleted", "00000000", "00000000@vnu.edu.vn");

    StudentManagement sm = new StudentManagement();

    sm.addStudent(a);
    sm.addStudent(b);
    sm.addStudent(e);
    sm.addStudent(c);
    sm.addStudent(d);
    sm.removeStudent(e.getId());

    System.out.println(sm.studentsByGroup());
  }
}
