package Exception1;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            ExceptionHandling.ageCheck(4);
        } catch (AgeIllegalException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Integer ageCheck(int age) {
        if(age < 18) {
            throw new AgeIllegalException("Age is less than 18");
        }
        if(age > 100) {
            throw new NumberFormatException("Age is more than 100");
        }

        return age;
    }
}
