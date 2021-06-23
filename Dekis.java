import java.util.Scanner;
import java.util.Hashtable;
import java.util.Enumeration;

public class Dekis{
	public static void main(String[] args){
		String n;
		int menu=0;
		Scanner in = new Scanner (System.in);
	
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("SURABAYA","BANDUNG-SURABAYA 06:00");
		hashtable.put("YOGYAKARTA","BANDUNG-YOGYAKARTA 06:10 ");
		hashtable.put("DENPASAR","BANDUNG-DENPASAR 07:50");
		hashtable.put("PALEMBANG","BANDUNG-PALEMBANG 08:20");
		hashtable.put("BALIKPAPAN","BANDUNG-BALIKPAPAN 08:55");
		hashtable.put("LAMPUNG","BANDUNG-LAMPUNG 08:20");
		hashtable.put("SEMARANG","BANDUNG-SEMARANG 09:10");
		while(menu!=4){
			System.out.println("Selamat Datang di Bandara Husein Sastranegara, Bandung. Silahkan Pilih Keperluan Anda Disini");
			System.out.print("1.Jadwal Penerbangan Hari Ini\n2.Jadwal Keberangkatan\n3.Harga Tiket\n4.Exit\nPilih Menu (1-4) : " );
			menu=in.nextInt();
			if(menu==1){
				System.out.println("Rute Penerbangan Bandara Husein Sastranegara, Bandung Hari Ini");
				Enumeration enumeration = hashtable.keys();

				while (enumeration.hasMoreElements()){
				System.out.println("--"+ enumeration.nextElement());
				}
			}else if(menu==2){		
				System.out.print("Ingin mengetahui jadwal penerbangan kemana anda hari ini ? ");
				n = in.next();
				System.out.println("" + hashtable.get(n));
			}else if(menu==3){
				Hashtable<String, String> hargatiket = new Hashtable<String, String>();
				hargatiket.put("SURABAYA","Rp.728.500/org");
				hargatiket.put("YOGYAKARTA","Rp.751.600/org");
				hargatiket.put("DENPASAR","Rp.477.700");
				hargatiket.put("PALEMBANG","Rp.477.700");
				hargatiket.put("BALIKPAPAN","Rp.451.300");
				hargatiket.put("LAMPUNG","Rp.538.200");
				hargatiket.put("SEMARANG","Rp.1.331.508");
				System.out.print("Silahkan masukkan tujuan penerbangan anda ? ");
				n = in.next();
				System.out.println("Harga tiket menuju "+ n + " adalah " + hargatiket.get(n));
			}else if(menu==4){
				System.out.println("Keluar");
			}else{ System.out.println("Masukkan anda salah !");
			System.out.println("");
			}
		}
	}
}		