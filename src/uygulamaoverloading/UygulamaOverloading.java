package uygulamaoverloading;
public class UygulamaOverloading {
    public static void main(String[] args) {
        ögrencibilgileri.ögrenci("İlker Aydoğdu");
        ögrencibilgileri.ögrenci(20);
    }
    public static class ögrencibilgileri{
        public static void ögrenci(String isim ){
            System.out.println("Öğrencimizin Adı Soyadı: "+isim);
        }
        public static void ögrenci(int numarası){
            System.out.println("Öğrencimizin Numarası: "+numarası);
        }
    }
}
