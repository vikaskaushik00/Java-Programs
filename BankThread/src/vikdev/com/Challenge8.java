package vikdev.com;

import java.util.concurrent.locks.ReentrantLock;

public class Challenge8 {

    public static void main(String[] args) {
        Tutor tutor = new Tutor();
        Student student = new Student(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });

        try{
            tutorThread.start();
            tutorThread.join();
        }catch (InterruptedException e){
            System.out.println("Exception");
        }

        studentThread.start();
    }
}

class Tutor {
    private Student student;
    ReentrantLock lock = new ReentrantLock();

    public synchronized void setStudent(Student student) {
        this.student = student;
    }

    public  void studyTime() {
        lock.lock();
        try{
            System.out.println("Tutor has arrived");
            try {
                // wait for student to arrive and hand in assignment
                Thread.sleep(300);
            }
            catch (InterruptedException e) {
                System.out.println("Exception");
            }
            student.startStudy();
            System.out.println("Tutor is studying with student");

        }finally {
            lock.unlock();
        }
       }

    public  void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class Student {

    private Tutor tutor;

    Student(Tutor tutor) {
        this.tutor = tutor;
    }

    public  void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public synchronized void handInAssignment() {
        tutor.getProgressReport();
        System.out.println("Student handed in assignment");
    }
}
