package code.inheritance;

/** The Student class shows infos of a student.
 *
 * @author dncdd@aliyun.com
 */
public class Student extends Person{
    private String studentId;

    /**
     * The constructor of Student class.
     * Initialize a Student object
     * @param studentId provides Id
     * @param firstName provides First Name
     * @param lastName provides Last Name
     */
    public Student (String firstName, String lastName, String studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    /**
     * This Accessor method of Student class
     * @return Returns Student id
     */
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID" + studentId;
    }
}
