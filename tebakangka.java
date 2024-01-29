/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpro;

/**
 *
 * @author - LENOVO -
 */
import java.util.Scanner;

public class tebakangka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean start = true;
        boolean done = true;
        boolean guess = true;
        boolean playAgain = true;

        System.out.println("Selamat Datang Di Permainan Tebak angka --\n");

        while (done) {
            System.out.println("Sudah Siap Untuk Bermain {Y/T}");
            String ready = input.next();

            if (ready.equalsIgnoreCase("Y")) {
                start = true;
                done = false;
            } else if (ready.equalsIgnoreCase("T")) {
                start = false;
                done = false;
                System.out.println("Terimakasih Telah Bermain");
                return;
            } else {
                System.out.println("Inputan Salah");
            }
        }

        while (start) {
            
            int angkaTebak = inputTebakan(input);
            int max = 100;
            int min = 0;
            
           while (guess) {
               int x = (int) ((Math.random() * (max - min)) + min);
               System.out.println("Apakah Angka Yang anda tebak lebih besar dari angka "+ x +"(Y/T)");
               String answer =input.next();
               
               if(answer.equals("Y") || answer.equals("y")) {
                   if (angkaTebak >= x) {
                       min = x;
                       System.out.println("Benar");
                   }else{
                       System.out.println("salah");
                   }
                   
                   if(angkaTebak == x) {
                       System.out.println("jawabannya adalah "  + x);
                       guess = false;
                       playAgain = true;
                   }
               }  else if(answer.equals("T") || answer.equals("t")){
                   if (angkaTebak <= x) {
                       max = x;
                       System.out.println("Benar");
                   } else{
                       System.out.println("Salah");
                   }
                   
                   if (angkaTebak == x){
                       System.out.println("Jawabannya Adalah " + x);
                       guess = false;
                       playAgain = true;
                   }
               }
               else{
                   System.out.println("Inputan Salah");
               }
           }
           
           while(playAgain){
               System.out.println("Apakah Anda Ingin Bermain Lagi ? (Y/T)");
               String again =input.next();
               
               if(again.equals("Y")  || again.equals("y")) {
                   start =true;
                   guess =true;
                   playAgain =false;
               }else if (again.equals("t") || again.equals("t")){
                   start = false;
                   playAgain =false;
               }
               else{
                   System.out.println("Inputan Salah");
               }
           }   
        }
        System.out.println("\n Terimakasih telah Bermain");
    }
    

    private static int inputTebakan(Scanner input) {
        System.out.println("\nTentukan Angka yang akan ditebak (0-100):");
        return input.nextInt();
    }
}
         
 
