import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
class Tiket{
	private int jumlahVocher;
	private int num1;
	private int num2;
	private int num3;
	private int num4; 
	public String[] listcode;
	public Queue<String> codeVocher = new PriorityBlockingQueue<String>();
	public Tiket(int jumlahVocher){
		this.jumlahVocher = jumlahVocher;
	}

	public Queue<String> getVocher(int v, String A){
		int max = 9999;
		int min = 1000;
		
		if (v<=10 && v!=0) {
			
			max = 2000;
		}
		else if (v<=15) {
			
			max = 3000;
		}
		else if (v<=20) {
			
			max = 4000;
		}
		else if (v<=30) {
			
			max = 5000;
		}
		else if (v<=50){
			
			max = 6000;
		}
		else if(v<=100 || v>100){
			
			max = 9999;
		}

		Set<String> list = new HashSet<String>();
		Iterator<String>it ;
		
		listcode = new String[jumlahVocher];
		int i = 0;
		while(list.size()<jumlahVocher){
			Random rand = new Random();
			num1 = rand.nextInt(max) + min;
			num2 = rand.nextInt(max) + min;
			num3 = rand.nextInt(max) + min;
			num4 = rand.nextInt(max) + min;

			String code;
			
			code = A+"-"+String.valueOf(num1) +"-"+ String.valueOf(num2) +"-"+String.valueOf(num3) +"-"+String.valueOf(num4);
			list.add(code);
			it = list.iterator();
			
			codeVocher.add(it.next());
			i++;
			
			
		}
		return codeVocher;
	}
	public boolean topUp(String x){
		Iterator<String>it = codeVocher.iterator();
		while(it.hasNext())
		{
			if(x.equals(it.next())){
				return true;
			}
		}
		return false;		
	}
}
public class AntrianPembelianTiket{

	public static Scanner sc = new Scanner(System.in);
	public static void generateVocher(){
		boolean on_error = true;

		while(on_error){
			cls();
			String tiket[] = {"jakarta","Jawa-tengah","Jawa-Timur","Banten","Sumatra","Papua"};
			int harga[] = {10,15,20,30,50,100};
			System.out.println("Daftar harga tiket");
			for (int i=0;i<6 ;i++ ) {
				System.out.println("[ "+(i+1)+" ] "+tiket[i]+" = "+harga[i]);
			}
			int jml,nominal;
			System.out.println("Pilih Tiket : ");
			nominal = sc.nextInt();
			if (nominal<=0 && nominal>tiket.length) {
				System.out.println("maaf tiket tidak ada dalam list");
				sleep(5000);
				on_error = true;
			}else{
				on_error = false;
				System.out.println("Masukan Jumlah Tiket : ");
				jml = sc.nextInt();
				Tiket voc = new Tiket(jml);
				Queue<String> queue = voc.getVocher(harga[nominal-1],tiket[nominal-1]);
				Iterator<String> it = queue.iterator();
				int i = 1;
				while(it.hasNext()){
					System.out.println(String.format("[ %d ]  ",i)+it.next());
					i++;

				}
			}
		}
	}
	
	public static void sleep(int x){
		try        
		{
			Thread.sleep(x);
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}
	}
	public static void cls() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	} 
	public static void logo(int k,String s){
		while(k<=s.length()){
			System.out.print(" \r " + s.toUpperCase());
			try        
			{
				Thread.sleep(150);
			} 
			catch(InterruptedException ex) 
			{
				Thread.currentThread().interrupt();
			}
			s = s.substring(1) + s.substring(0,1);
			k++;
		}
	}
	public static void br(){
		Scanner scanner = new Scanner(System.in);
		String readString = "";
		readString += scanner.nextLine();
		
	}
	public static void main(String[] args) {
		String s = "Selamat datang di Pelabuhan Pangandaran";
		String[] menu = {
			"Ambil no antrian",
			"Panggil Antrian",
			"exit"
		};
		String[] clientMenu = {
			"Beli tiket",
		};
		int init = 1;
		int k= 0;
		boolean exit = false;
		Queue<Integer> antrian = new PriorityBlockingQueue<Integer>();
		while(!exit){
			cls();

			logo(k,s);
			System.out.println(
				"\n _           _        _       _______ _ _        _   \n"+
				"| |         | |      | |     |__   __(_) |      | |  \n"+
				"| |     ___ | | _____| |_ ______| |   _| | _____| |_ \n"+
				"| |    / _ \\| |/ / _ \\ __|______| |  | | |/ / _ \\ __|\n"+
				"| |___| (_) |   <  __/ |_       | |  | |   <  __/ |_ \n"+
				"|______\\___/|_|\\_\\___|\\__|      |_|  |_|_|\\_\\___|\\__|\n"
				);
			System.out.println();
			for (k=0;k<=menu.length-1 ;k++ ) {
				System.out.println((k+1)+". "+menu[k]);
			}
			System.out.print("Masukan Pilihan Anda :");
			int i= sc.nextInt();
			if(i==0){
				MSS.main(new String[0]);
				break;
			}
			else{
				switch(i){
					case 1 :
					{
						int ant = init;
						antrian.add(init);
						init++;
						System.out.println("antrian anda : "+ant);
						try        
						{
							Thread.sleep(2000);
						} 
						catch(InterruptedException ex) 
						{
							Thread.currentThread().interrupt();
						}
						break;
					}
					case 2 :
					{
						if (antrian.peek()!=null) {
							cls();
							logo(k,s);
							System.out.println("\nantrian nomor : "+antrian.poll());
							System.out.println("Menu:");
							for (k=0;k<clientMenu.length;k++) {
								System.out.println((k+1)+". "+clientMenu[k]);
							}
							System.out.print("Masukan Pilihan Anda :");
							int pil = sc.nextInt();
							if (pil==0) {
								break;
							}
							else{
								switch(pil){
									case 1:
									{
										generateVocher();
										sleep(5000);
										System.out.print("tekan enter untuk melanjutkan...");
										br();
										break;
									}
									default:
									{
										System.out.print("keyword anda salah");
										sleep(5000);
									}
								}
							}
						}
						else{
							System.out.print("anda tidak mempunyai pelanggan");
							sleep(1500);
						}
						break;
					}
					case 3:{
						exit = true;
						break;
					}
					default:
					{
						System.out.print("keyword anda salah");
						sleep(5000);
					}
				}
			}
		}		
	}
}