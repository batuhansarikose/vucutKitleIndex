import java.util.Scanner;

public class vucutKitle {
    public static void main(String[] args){
        double boy,kilo,index;
        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz(Metre Cinsinden):");
        boy= inp.nextDouble();
        System.out.println("Kilonuzu Giriniz:");
        kilo=inp.nextDouble();
        index=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:"+index);
    }
}
