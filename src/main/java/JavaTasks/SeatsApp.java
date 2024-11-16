package JavaTasks;

import java.util.Random;

public class SeatsApp {

    public static void main(String[] args) {

        String[] students = {
                "Bryan Garcia" , "Morgan Rowland" , "Mack Mullins" ,
                "Julie Patel" , "Ivan Olson" , "Noa Collier" ,
                "Tommy sherman" , "Lukas Todd" , "Darren Stewart" ,
                "Thea Lyons" , "Hunter Bauer" , "Kiara Daniel"
        };

        boolean[] usedSeats = new boolean[students.length];
        Random random = new Random();

        System.out.println("Seat numbers of students:");

        for(int i = 0; i < students.length; i++) {

            int seatNumber;
            do {
                seatNumber = random.nextInt(students.length) + 1;
            }
            while (usedSeats[seatNumber - 1]);

            usedSeats[seatNumber - 1] = true;
            System.out.println(students[i] + " - Seat " + seatNumber);
        }
    }
}

