package ConsoleUI;

import java.util.Scanner;

public class CalculatorForKidsLanguage
{
        public static void main(String[] args)
        {
            SistemAracları.EkranaYazdir(Matematikselİslemler.Toplama(2,1));
            SistemAracları.Hafıza1= DegiskenOlustur.KesirliSayiOlustur(8);
            SistemAracları.EkranaYazdir(SistemAracları.Hafıza1);
            SistemAracları.Hafıza1Temizle();
            SistemAracları.EkranaYazdir(Kullaniciİslemleri.DegerAl());
        }
        public static class DegiskenOlustur
        {

            public static int TamSayiOlustur(int sayi1)
            {
                float floatsayi = sayi1;
                return sayi1;
            }
            public static float KesirliSayiOlustur(float sayi2)
            {
                return sayi2;
            }
        }
        public static class Matematikselİslemler
        {
            public static float toplam = 0;

            public static float Toplama(float sayi1,float sayi2,float sayi3)
            {
                toplam =sayi1+sayi2+sayi3;

                return toplam;
            }
            public static float Toplama(float sayi1,float sayi2)
            {
                toplam =sayi1+sayi2;
                return toplam;
            }

        }
        public static class SistemAracları
        {

            public static void EkranaYazdir()
            {
                System.out.println("Henüz bir şey girmediniz");
            }
            public static void EkranaYazdir(String S)
            {
                System.out.println(S);
            }
            public static void EkranaYazdir(int S)
            {
                System.out.println(S);
            }
            public static void EkranaYazdir(float S)
            {
                System.out.println(S);
            }
            static  public float Hafıza1 = 0;
            static public float Hafıza2 = 0;
            static public float Hafıza3 = 0;
            static public float Hafıza4 = 0;

            public static float HafizadaTut(float tut)
            {
                Hafıza1 = tut;
                return tut;
            }
            public static float HafizadaTut()
            {
                return 0;
            }
            public static float HafizadaTut2()
            {
                return 0;
            }
            public static float HafizadaTut2(float tut)
            {
                Hafıza2 = tut;
                return tut;
            }
            public static float HafizadaTut3()
            {
                return 0;
            }
            public static float HafizadaTut3(float tut)
            {
                Hafıza3 = tut;
                return tut;
            }
            public static float HafizadaTut4()
            {
                return 0;
            }
            public static float HafizadaTut4(float tut)
            {
                Hafıza4 = tut;
                return tut;
            }
            public static void Hafıza1Temizle()
            {
                Hafıza1 = 0;
            }
            public static void Hafıza2Temizle()
            {
                Hafıza2 = 0;
            }
            public static void Hafıza3Temizle()
            {
                Hafıza3 = 0;
            }
            public static void Hafıza4Temizle()
            {
                Hafıza4 = 0;
            }
            public static void TümHafızalarıTemizle()
            {
                Hafıza1 = 0;
                Hafıza2 = 0;
                Hafıza3 = 0;
                Hafıza4 = 0;
            }
            public static void ToplamTemizle()
            {
                Matematikselİslemler.toplam = 0;
            }

        }
        public static class Kullaniciİslemleri
        {
            public static float DegerAl()
            {
                float z;
                Scanner sc=new Scanner(System.in);
                System.out.print("Bir değer giriniz: ");
                z=sc.nextFloat();
                return z;
            }
        }
    }

