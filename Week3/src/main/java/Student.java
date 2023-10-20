public class Student {
  private String name;
  private String id;
  private String group;
  private String email;

  /**
   * Getter method for the `name` field of the Student object.
   *
   * @return The current name of the student.
   */
  public String getName() {
    return name;
  }

  /**
   * Setter method for the `name` field of the Student object.
   *
   * @param name - The new name of the student.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter method for the `id` field of the Student object.
   *
   * @return The current ID of the student.
   */
  public String getId() {
    return id;
  }

  /**
   * Setter method for the `id` field of the Student object.
   *
   * @param id - The new ID of the student.
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter method for the `group` field of the Student object.
   *
   * @return The current group of the student.
   */
  public String getGroup() {
    return this.group;
  }

  /**
   * Setter method for the `group` field of the Student object.
   *
   * @param group - The new group of the student.
   */
  public void setGroup(String group) {
    this.group = group;
  }

  /**
   * Getter method for the `email` field of the Student object.
   *
   * @return The current email of the student.
   */
  public String getEmail() {
    return email;
  }

  /**
   * Setter method for the `email` field of the Student object.
   *
   * @param email - The new email of the student.
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Dumps the general information about the student.
   *
   * @return The resulting information as a String.
   */
  public String getInfo() {
    return String.format("%s - %s - %s - %s", name, id, group, email);
  }

  /** Constructor 1. */
  public Student() {
    name = "Student";
    id = "000";
    group = "K62CB";
    email = "uet@vnu.edu.vn";
  }

  /**
   * Constructor 2.
   *
   * @param name - The student's name.
   * @param id - The student's ID.
   * @param email - The student's email.
   */
  public Student(String name, String id, String email) {
    this.name = name;
    this.id = id;
    this.group = "K62CB";
    this.email = email;
  }

  /**
   * Constructor 3.
   *
   * @param s - Another Student object to copy.
   */
  public Student(Student s) {
    this.name = s.name;
    this.id = s.id;
    this.group = s.group;
    this.email = s.email;
  }
}
