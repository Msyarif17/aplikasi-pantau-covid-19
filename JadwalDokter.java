import java.util.Scanner;
 
public class JadwalDokter {
    int nip;
    String nama,poli,jadwal,ruang;
    JadwalDokter next;
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan NIP Dokter       : ");
        nip=in.nextInt();
        System.out.print("Masukkan Nama Dokter      : ");
        nama=str.nextLine();
        System.out.print("Masukkan Poliklinik       : ");
        poli=str.nextLine();
        System.out.print("Masukkan Jadwal Praktek   : ");
        jadwal=str.nextLine();
        System.out.print("Masukkan Nama Ruangan     : ");
        ruang=str.nextLine();
        next=null;
    }
    public void view(){
        System.out.println("| "+nip+" | "+nama+" | "+poli+" | "+jadwal+" | "+ruang+" |");
    }
    public static void main(String[] args) {
        Kelompok6.clrscr();
        System.out.println("\n\tJADWAL PRAKTEK DOKTER RS.PERMATA");
		System.out.println("\t\tProgram Linkedlist\n");
        int menu=0,del;
        linkedlist ll=new linkedlist();
        while(menu!=4){
			System.out.print("Menu : ");
            System.out.print("\n1.Input Data\n2.View\n3.Delete\n4.Exit ");
			System.out.print("\nMasukkan Pilihan : ");
            menu=in.nextInt();
            if(menu==1) ll.add();
            else if(menu==2) ll.view();
            else if(menu==3){
                System.out.print("1.Data Pertama\n2.Data Terkahir\n : ");
                del=in.nextInt();
                if(del==1) ll.removeFirst();
                else if(del==2) ll.removeLast();
                else System.out.println("Salah");
            }
            else if(menu==4) System.out.println("Keluar");
            else System.out.println("Salah");
            System.out.println();
        }
    }
}
 
class linkedlist{
    JadwalDokter head,tail;
    public linkedlist(){
        head=null;
        tail=null;
    }
    public void add(){
        JadwalDokter baru=new JadwalDokter();
        baru.input();
        if(head==null) head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void view(){
        if(head==null){
            System.out.println("Kosong");
            return;
        }
        System.out.println("| NIP | Nama Dokter | Poliklinik | Jadwal | Ruangan |");
        JadwalDokter ptr=head;
        while(ptr!=null){
            ptr.view();
            ptr=ptr.next;
        }
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Kosong");
            return;
        }
        System.out.println("Data "+head.nama+" Berhasil Dihapus");
        head=head.next;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Kosong");
            return;
        }
        System.out.println("Data "+tail.nama+" Berhasil Dihapus");
        if(head==tail){
            head=null;
            tail=null;
        }else{
            JadwalDokter ptr=head.next;
            JadwalDokter prev=head;
            while(ptr!=tail){
                ptr=ptr.next;
                prev=prev.next;
            }
            prev.next=null;
            tail=prev;
        }
    }
}