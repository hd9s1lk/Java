public class variables {
    public static void main(String[] args) {
        
        //declaration
        //assignment

        int age = 30;
        char grade = 'A';
        boolean isStudent = false;
        double temp = 19.5;
        float money = 17;
        String car = "Nismo GTR 35 Z-Z Tune";

        System.out.println(age);
        System.out.println(grade);
        System.out.println(isStudent);
        System.out.println(temp);
        System.out.println(money);
        System.out.println("O teu carro é um: " + car);

        if(isStudent == true){
            System.out.print("You are a student");
        } else {
            System.out.print("You are not a student");
        }
    }
}
