import java.util.ArrayList;
import java.util.Scanner;

public class BookStore{
	public static void main(String[] args) {
		Kelompok6.clrscr();
		int menu;
		int pilihan;
		pilihan = 0;

		Scanner input = new Scanner(System.in);
		ArrayList<BookStore> books = new ArrayList<BookStore>();

		System.out.println("=========================");
		System.out.println("    DINI'S BOOK STORE    ");
		System.out.println("=========================");
		System.out.println(" 1. Tambahkan Data Buku ");
		System.out.println(" 2. Hapus Data Buku ");
		System.out.println(" 3. Tampilkan Semua Data Buku ");
		System.out.println(" 4. Keluar ");
		System.out.print("Masukkan Pilihanmu: ");
		menu = input.nextInt();

		while(menu != 4){
			switch(menu){
				case 1:
				while(pilihan != 2){
					System.out.println("");
					System.out.println("Masukkan Data Buku");
					System.out.print("Judul: ");
					String judul = input.next();
					System.out.print("Penulis: ");
					String penulis = input.next();
					System.out.print("Tahun: ");
					int tahun = input.nextInt();

					books.add(new BookStore(judul, penulis, tahun));
					System.out.print("Masukkan Data Buku Lain? (1. Ya  2. Tidak): ");
					pilihan = input.nextInt();
				} break;

				case 2:
				System.out.println("");
				System.out.println("Daftar");
				for(int i = 0; i < books.size(); i++){
					System.out.println(i + " Judul: "+ books.get(i).judul);
				}
				System.out.println("Masukkan Nomor Buku Untuk Dihapus");
				books.remove(input.nextInt());
				break;

				case 3:
				System.out.println("");
				System.out.println("Daftar");
				for(int i = 0; i < books.size(); i++){
					System.out.println(books.get(i).judul + " ditulis oleh "+ books.get(i).penulis + " pada tahun " + books.get(i).tahun);
				}
				break;
			}

			System.out.println("");
			System.out.println(" 1. Tambahkan Data Buku ");
			System.out.println(" 2. Hapus Data Buku ");
			System.out.println(" 3. Tampilkan Semua Data Buku ");
			System.out.println(" 4. Keluar ");
			System.out.print("Masukkan Pilihamu: ");
			menu = input.nextInt();
		}
		System.out.println("\n--Terimakasih--");
	}
	public String penulis;
	public String judul;
	public int tahun;

	public BookStore(String booksJudul, String booksPenulis, int booksTahun){
		this.judul = booksJudul;
		this.penulis = booksPenulis;
		this.tahun = booksTahun;
	}
	public String toString(){
		return super.toString();
	}
	public void setJudul(String booksJudul){
		judul = booksJudul;
	}
	public void setPenulis(String booksPenulis){
		penulis = booksPenulis;
	}
	public void setAge(int booksTahun){
		tahun = booksTahun;
	}
	public String getName(){
		return judul;
	}
}