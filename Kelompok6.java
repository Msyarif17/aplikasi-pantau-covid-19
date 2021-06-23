import java.lang.*;
import java.util.*;
import java.io.*;

import java.io.BufferedReader;

class Kelompok6{
    public static Scanner input = new Scanner(System.in);
    
    public static void clrscr(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        boolean exit = false;


        String[] menu ={
            "System Loket Tranportasi Laut","Transportasi Udara",
            "System Penjadwalan PRAKTEK DOKTER RS.PERMATA", "System Books Store","exit"
        };
        while(!exit){
            clrscr();
            int program,i=1;
            System.out.println(
                "====================================================\n"+
                " _  __    _                             _      __  \n"+
                "| |/ /   | |                           | |    / /  \n"+
                "| ' / ___| | ___  _ __ ___  _ __   ___ | | __/ /_  \n"+
                "|  < / _ \\ |/ _ \\| '_ ` _ \\| '_ \\ / _ \\| |/ / '_ \\ \n"+
                "| . \\  __/ | (_) | | | | | | |_) | (_) |   <| (_) |\n"+
                "|_|\\_\\___|_|\\___/|_| |_| |_| .__/ \\___/|_|\\_\\\\___/ \n"+
                "                           | |                     \n"+
                "                           |_|    \n"+
                "====================================================\n"


                );
            for (String n: menu) {
                System.out.println(String.format("[ %d ]  ",i)+n);
                i++;
            }
            System.out.print("Silahkan pilih menu = ");
            program = input.nextInt();
            switch(program){
                case 1:{
                    MSS.main(new String[0]);
                    break;
                }
                case 2:{
                    Dekis.main(new String[0]);
                    break;
                }
                case 3:{
                    JadwalDokter.main(new String[0]);
                    break;
                }
                case 4:{
                    BookStore.main(new String[0]);
                    break;
                }
                case 5:{
                    exit = true;
                    break;
                }
                default:{
                    clrscr();
                    System.out.println("Ups... usahakan inputan berupa angka dari 1 sampai 5");

                }
            }
        }
        
    }
}

