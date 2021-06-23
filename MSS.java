import java.util.*;

public class MSS{

	public static void main(String[] args) {
	String menu[] = {"Informasi Covid 19","Loket Tiket","kembali"};
		Scanner input = new Scanner(System.in);
		int p;
		boolean exit = false;
		
		while(!exit){
			Kelompok6.clrscr();
			int i = 1;
			System.out.println(
				" _______                                   _            _        _                 _                 _                     _  __          _ \n"+
				"|__   __|                                 | |          (_)      | |               | |               | |                   | |/ _|        (_)\n"+
				"   | |_ __ __ _ _ __  ___ _ __   ___  _ __| |_ __ _ ___ _ ______| |     __ _ _   _| |_ ______ ______| | ____ _ _ __   __ _| | |_ ___ _ __ _ \n"+
				"   | | '__/ _` | '_ \\/ __| '_ \\ / _ \\| '__| __/ _` / __| |______| |    / _` | | | | __|______|______| |/ / _` | '_ \\ / _` | |  _/ _ \\ '__| |\n"+
				"   | | | | (_| | | | \\__ \\ |_) | (_) | |  | || (_| \\__ \\ |      | |___| (_| | |_| | |_              |   < (_| | |_) | (_| | | ||  __/ |  | |\n"+
				"   |_|_|  \\__,_|_| |_|___/ .__/ \\___/|_|   \\__\\__,_|___/_|      |______\\__,_|\\__,_|\\__|             |_|\\_\\__,_| .__/ \\__,_|_|_| \\___|_|  |_|\n"+
				"                         | |                                                                                  | |                           \n"+
				"                         |_|                                                                                  |_|                           \n"
				);
			System.out.println("=====================================================");
			System.out.println(" Created with Love By: Muhammad Syarif Setiadi       ");
			System.out.println(" Studenting at 		 : UIN Sunan Gunung Djati Bandung");
			System.out.println(" Student ID Number	 : 1197050091					 ");
			System.out.println("=====================================================\n\n");

			for (String k: menu) {
				System.out.println(String.format("[ %d ]  %s",i,k));
				i++;
			}
			System.out.print("masukan pilihan anda: ");
			p = input.nextInt();
			switch(p){
				case 1:{
					Covid19.main(new String[0]);
					break;
				}
				case 2:{
					AntrianPembelianTiket.main(new String[0]);
					break;
				}
				case 4:{
					exit = true;
					Kelompok6.main(new String[0]);
					break;
				}
				default:{
					System.out.println("sorry keyword yang anda masukan salah");
				}

			}
		}
	}
}