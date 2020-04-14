/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparing;

/**
 *
 * @author kristyna kohoutova
 */
public class Student implements CompareInterface, Comparable<Student>{
  private String firstName;
  private String latsName;
  private int age;
  private int number;
  private int [] grades;  //max 10
  final private int numberOfGrades = 10;
  private double average;

    public Student(String firstName, String latsName, int number, int age) {
        this.firstName = firstName;
        this.latsName = latsName;
        this.age = age;
        this.number = number;
        grades = new int[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
            grades[i] = -1;
        }
    }

//    @Override
//    public String toString() {
//        return "Student{" + "firstName=" + firstName + ", latsName=" + latsName + ", age=" + age + ", number=" + number + '}';

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", latsName=" + latsName + ", age=" + age + ", number=" + number + ", grades=" + getGrades() + ", average=" + String.valueOf(getAverage()) + '}';
    }

    
    private String getGrades() {
        String returnValue = "";
        for (int i = 0; i < numberOfGrades; i++) {
            if (i == 0) {
                if (this.grades[i] != -1) {
                    returnValue += this.grades[i];
                }
            } else {
                if (this.grades[i] != -1) {
                    returnValue += "," + this.grades[i];
                }
            }
        }
        return returnValue;
    }
    
    private double getAverage() {
        double returnValue = 0;
        int counter = 0;
        for (int i = 0; i < numberOfGrades; i++) {
            if (this.grades[i] != -1) {
                returnValue += this.grades[i];
                counter++;
            }
        }
        return this.average = returnValue / counter;
         
    }
        
    
//    }
    boolean startLater(Student student) {
        return this.number > student.number;
    }
    boolean isOlder(Student student){
        return this.age > student.age;
    }

    @Override
    public boolean isSmaller(CompareInterface o) {
        return this.number > ((Student)o).number;
    }

//    @Override
//    public int compareTo(Object o) {  //zaporne, 0, kladne int
//        return this.number - ((Student)o).number;
//    }

//    @Override
//    public int compareTo(Student o) { //genericita, umoznuje doplnit typy objektu, ktere se porovnavaji
//        return this.number - o.number;
//    }
    
     @Override
    public int compareTo(Student o) { //genericita, umoznuje doplnit typy objektu, ktere se porovnavaji
        if((this.average - o.average)>0){
            return 1;
        }
        else if((this.average - o.average)<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    public void addGrades(int[] grades){
        for (int i = 0; i < grades.length; i++) {
            if (i < numberOfGrades) {
                this.grades[i] = grades[i];
            }
        }
    }
    
    public void addGrade(int grade){
        for (int i = 0; i < numberOfGrades; i++) {
           if (grades[i] == -1) {
               grades[i] = grade;
           }
        }
    }

    
    
    
    
    //TODO
    //doprogramovat promennu, kde budeme davat pole znamek, aby se mu mohly pridavat znamky
    //vypocitat prumer
    //zmenit metodu compareTo, aby se tridilo podle prumeru (pouzit porovnani realnych cisel) -1 0 1, vyzkouset, jestli to v comparing bude tridit podle prumeru
  
}
