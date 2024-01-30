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
            
            int max = 100;
            int min = 0;
             
            
           while (guess) {
               int x = (int) ((Math.random() *  (max - min)) + min);
               System.out.println("Apakah Angka Yang anda tebak lebih besar dari angka "+ x +"(Y/T)");
               String answer =input.next();
               
               if(answer.equalsIgnoreCase("Y")) {
                   min = x;
               }  else if(answer.equalsIgnoreCase("T") ){
                   max = x;
               
               }
               else{
                   System.out.println("Inputan Salah");
               }
              if (max-min == 1){
                        System.out.println("Apakah angka yang Anda miliki lebih besar dari " + min + "? (Y/T) ");
                        String lebihBesar = input.next();
                        if (lebihBesar.equalsIgnoreCase("y")){
                            System.out.println();
                            System.out.println("Angka yang anda miliki adalah " + max);

                            break;
                        } else {
                            System.out.println();
                            System.out.println("Angka yang anda miliki adalah " + min);
                            break;
                        }
                    } else if (max-min == 0){
                        System.out.println("Angka yang anda miliki adalah " + max);
                        break;
                    }
//               x = (min + max)/2;
           }
           
           while(playAgain){
               System.out.println("Apakah Anda Ingin Bermain Lagi ? (Y/T)");
               String again =input.next();
               
               if(again.equalsIgnoreCase("Y")  ) {
                   start =true;
                   guess =true;
               }else if (again.equalsIgnoreCase("t")){
                   start = false;
               }
               else{
                   System.out.println("Inputan Salah");
               }
               break;
           }   
        }
        System.out.println("\n Terimakasih telah Bermain");
    }
}
    

    
         
 
