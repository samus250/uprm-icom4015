/**
 * This class represents a student.
 *
 * @author samus250
 *
 */
public class Student {
  /**
   * The student's name.
   */
  private String name;

  /**
   * The student's total quiz score.
   */
  private double totalScore = 0;

  /**
   * The number of quizes the student has taken.
   */
  private int numberOfQuizes = 0;

  /**
   * @param name
   */
  public Student(String name) {
    this.name = name;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the totalScore
   */
  public double getTotalScore() {
    return totalScore;
  }

  /**
   * Add a quiz score to the student's total score.
   *
   * @param score
   */
  public void addQuiz(int score) {
    this.totalScore += score;
    this.numberOfQuizes++;
  }

  /**
   * Returns the student's average score.
   *
   * @return the student's average score.
   */
  public double getAverageScore() {
    return this.numberOfQuizes == 0 ? 0.0 : this.totalScore / this.numberOfQuizes;
  }

}
