import java.util.*;
public class ClassObjects {
    public static void main(String[] args){
    
    // Trainer trainer = new Trainer();
    // System.out.println("Enter the trainer name");
    Scanner sc = new Scanner(System.in);
    // trainer.trainerName = scanner.nextLine();
    // System.out.println("Enter the trainer technology");
    // System.out.println(trainer.trainername + trainer.trainerTechnology);
    String first=sc.nextLine();
    String last=sc.nextLine();
    System.out.println(ConcatName(first,last));
    sc.close();
    
    }



static String ConcatName(String fname, String lname){
    
    String name = lname.concat(fname);
    return name;
}

class Student{
    String studentName;
    String studentTechnology;
}
}