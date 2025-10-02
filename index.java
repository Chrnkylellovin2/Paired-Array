# Paired-Array
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //DECLARATION//
    String Name[]={"Shinobu", "Giyu", "Muichiro", "Obanai", "Gyomei"};
    int Age[]={18, 19, 14, 21, 27};
    String Breath[]={"Insect Breathing", "Water Breathing", "Mist Breathing", "Serpent Breathing", "Stone Breathing"};
    String Rank[]={"Hashira", "Hashira", "Hashira", "Hashira", "Hashira"};
    String Gender[]={"Female", "Male", "Male", "Male", "Male"};


   //OUTPUT//11
System.out.print ("Enter the index NO. (0 - 4) of the Demon Slayer Information:");
Scanner Sword = new Scanner (System.in);
int index = Sword.nextInt();

//CONDITION//

        if (index == 0) {
            System.out.println("Name: " + Name[0]);
            System.out.println("Age: " + Age[0]);
            System.out.println("Breathing Style: " + Breath[0]);
            System.out.println("Rank: " + Rank[0]);
            System.out.println("Gender: " + Gender[0]);
        }else if (index== 1){
            System.out.println("Name: " + Name[1]);
            System.out.println("Age: " + Age[1]);
            System.out.println("Breathing Style: " + Breath[1]);
            System.out.println("Rank: " + Rank[1]);
            System.out.println("Gender: " + Gender[1]);
        }else if (index== 2){
            System.out.println("Name: " + Name[2]);
            System.out.println("Age: " + Age[2]);
            System.out.println("Breathing Style: " + Breath[2]);
            System.out.println("Rank: " + Rank[2]);
            System.out.println("Gender: " + Gender[2]);
        }else if (index== 3){
            System.out.println("Name: " + Name[3]);
            System.out.println("Age: " + Age[3]);
            System.out.println("Breathing Style: " + Breath[3]);
            System.out.println("Rank: " + Rank[3]);
            System.out.println("Gender: " + Gender[3]);
        }else if (index== 4){
            System.out.println("Name: " + Name[4]);
            System.out.println("Age: " + Age[4]);
            System.out.println("Breathing Style: " + Breath[4]);
            System.out.println("Rank: " + Rank[4]);
            System.out.println("Gender: " + Gender[4]);
        }else {
            System.out.println("Invalid Index");
        }
}
}
