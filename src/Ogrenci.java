public class Ogrenci {
    public static void main(String[] args) {

        System.out.println("not girisi bölümü çağrıldı");
    }

    public static void OgrenciNotEkle()
    {
        System.out.println("Not girisi");

        for(int i=0;i<5;i++)
        {
            System.out.println("i = " + i);
        }

        // geri geri sayacak
        for(int i=10;i>0;i--)
        {
            System.out.println("i = " + i);
        }

        // 3 er geri geri sayacak
        for(int i=10;i>0;i-=3)
        {
            System.out.println("i = " + i);
        }

        System.out.println(" yeni değişiklik ");

    }

    public static void OgrenciOrt()
    {
        System.out.println(" 1 ");
    }

}
