/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operasi_kalkulator;

/**
 *
 * @author trili
 */
public class Operasi_kalkulator {

    public static void main(String[] args) {
        biodata();
        int hasil = penjumlahan (10,14);
        System.out.println ("penjumlahan = "+hasil);
        hasil = pengurangan (11,8);
        System.out.println ("pengurangan = "+hasil);
        hasil = perkalian (12,13);
        System.out.println ("perkalian = "+hasil);
        hasil = pembagian (100,5);
        System.out.println ("pembagian = "+hasil);
        hasil = modulus (11,3);
        System.out.println ("modulus = "+hasil);
        hasil = pangkat (11,5);
        System.out.println ("pangkat = "+hasil);
        double hasilakar;
        hasilakar = akarkuadrat (16);
        System.out.println ("akarkuadrat = "+hasilakar);
        double hasilSinus;
        hasilSinus = sinus (30);
        System.out.println("sinus = "+ hasilSinus);
        double hasilCosinus;
        hasilCosinus = cosinus (25);
        System.out.println("cosinus = "+ hasilCosinus);
        double hasilTangen;
        hasilTangen = tangen (35);
        System.out.println("tangen = "+ hasilTangen);
        double hasilArcsinus;
        hasilArcsinus = arcsinus (40);
        System.out.println("arcsinus = "+ hasilArcsinus);
        double hasilArccosinus;
        hasilArccosinus = arccosinus (15);
        System.out.println("arccosinus = "+ hasilArccosinus);
        double hasilArctangen;
        hasilArctangen = arctangen (35);
        System.out.println("arctangen = "+ hasilArctangen);
    }
    
    public static int penjumlahan (int a, int b){
        return a+b;
    }
    public static int pengurangan (int a, int b){
        return a-b;
    }
        public static int perkalian (int a, int b){
        return a*b;
    }
            public static int pembagian (int a, int b){
        return a / b;
    }
                public static int modulus (int a, int b){
        return a%b;
    }
                    public static int pangkat (int a, int b){
        return (int)Math.pow(a,b);
    }
                        public static double akarkuadrat(int a){
        return Math.sqrt(a);
    }
                        public static double sinus(int x){
        return Math.sin(Math.toRadians(x));
    }
                        public static double cosinus(int x){
        return Math.cos(Math.toRadians(x));
    }
                        public static double tangen(int x){
        return Math.tan(Math.toRadians(x));
    }
                        public static double arcsinus(int x){
        return Math.asin(Math.toRadians(x));
    }
                        public static double arccosinus(int x){
        return Math.acos(Math.toRadians(x));
    }
                        public static double arctangen(int x){
        return Math.atan(Math.toRadians(x));
    }
    public static void biodata(){
        System.out.println("...");
        System.out.println("listina ayu");
        
    }
}
