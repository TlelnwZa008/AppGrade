/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Grade;
import java.util.Scanner;

/**
 *
 * @author 344_04
 */
public class AppGrade {

    public static void main(String[] args) {

        int affective, work, exam, total;
        double grade =0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter affective : ");
            affective = scan.nextInt();
        } while (affective > 20);
        do {
            System.out.print("Enter work : ");
            work = scan.nextInt();
        } while (work > 40);
        do {
            System.out.print("Enter exam : ");
            exam = scan.nextInt();
        } while (exam > 40);
        total = affective + work + exam;
        if (total <= 50) {
            grade = 0.0;
        } else if (total <= 54) {
            grade= 1.0;
        } else if (total <= 59) {
            grade= 1.5;
        } else if (total <= 64) {
            grade= 2.0;
        } else if (total <= 69) {
            grade= 2.5;
        } else if (total <= 74) {
            grade= 3.0;
        } else if (total <= 79) {
            grade= 3.5;
        } else if (total <= 100) {
            grade= 4.0;
        }
        
        System.out.println("your total is"+total);    
        System.out.println("You have grade "+grade);
            
 

        }
    }


