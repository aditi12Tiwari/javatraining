import java.util.*;
public class GenerateOTP {
    public static void main(String[] args){
    Random random = new Random();
    int myOTP = random.nextInt(100);
    System.out.println("Your OTP is" + myOTP);
}
}
