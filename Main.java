package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ciklai
        //1* ciklas 300 ir du ifai
        // 2*  lyginis skaicius 20 % 2 == 0
//        //3*  for (){ //cia labas
//        daro kazka
//                for(){} cia rytas rytas rytas
        //ciklas cikle, padaro "labas rytas rytas rytas"

//5*
//        while (true){
//
//            do {
//            }while (true);
//        Scanner scanner = new Scanner (System.in);
//        int num = 7;
//        boolean badNumber = true;
//        while (badNumber){
//            int input = scanner.nextInt();
        //kol neivesi teisingai - nepralesi sis while ciklas, gera praktika naudoti try cach
//            if (input > 0 && input < 5){
//                badNumber = false;
//                System.out.println("pagaliau, aciu");
//            }else {
//                System.out.println("ivesk skaiciu teisigngai, tarp 0 ir 5 ");
//            }
//        }
//        System.out.println("skaiciu priimtas");

//       1* Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos atskirtus tarpais ir suskaičiuokite kiek tarp jų yra didesnių už 150.  Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.

//        int a=0;
//        int b=0;
//
//        for (int i = 0; i < 300; i++) {
//            a = (int) (Math.random()*300);
//            if (a > 275){
//                System.out.print("["+a+"] ");
//            }else {System.out.print(a + "  ");}
//
//            if (a > 150){b++;}
//        }
//        System.out.println("skaiciu didesniu uz 150 yra  "+b);

//     2*   Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos. Skaičius atskirkite kableliais. Po paskutinio skaičiaus kablelio neturi būti.


//        String text = "";
//
//        for (int i = 0; i < 3000; i++) {
//
//            if ((i % 77) == 0) {text += i + ",";}
//
//        }
//
//        System.out.println(text.substring(0, text.length()-1));

//       3* Nupieškite kvadratą iš “*”, kurio kraštines sudaro 100 “*”.
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *
//* * * * * * * * * * *

//        String text = "";
//        for (int i = 0; i < 10; i++) {
//            text += " * ";}
//
//        for (int j = 0; j < 10; j++) {
//                System.out.println(text);
//            }

//       5* Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija, kur 0 yra herbas, o 1 - skaičius. Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje: “S” jeigu iškrito skaičius ir “H” jeigu herbas. Suprogramuokite keturis skirtingus scenarijus kai monetos metimą stabdome:
//        Iškritus herbui;
//        Tris kartus iškritus herbui;
//        Tris kartus iš eilės iškritus herbui;

//        boolean a = true;
//        int b=0;
//        int c = 0;
//        int d = 0;
//
//        while (a){
//            b = (Math.random()>0.5)? 1 : 0;
//            if (b == 0){System.out.println("S");
//            d--;
//            }
//
//            if (b == 1) {System.out.println("H");
//                d++;
//                c++;
//
//                if(c == 3)
//                {System.out.println("isskritu H sustabdome");
//                }
//
//
//                if (d == 2){System.out.println("tris kartus is eiles H isskrito - sustabdome");
//                    a = false;}
//            }
//            }

//
//        6* Kazys ir Petras žaidžiai šaškėm. Petras surenka taškų kiekį nuo 10 iki 20, Kazys surenka taškų kiekį nuo 5 iki 25. Vienoje eilutėje išvesti žaidėjų vardus su taškų kiekiu ir “Partiją laimėjo: ​laimėtojo vardas​”. Taškų kiekį generuokite funkcija ​Math.random()​. Žaidimą laimi tas, kas greičiau surenka 222 taškus. Partijas kartoti tol, kol kažkuris žaidėjas pirmas surenka 222 arba daugiau taškų.

//        int r = (int) (Math.random() * (upper - lower)) + lower; //generuoja random intervala
//        int petras = (int) (Math.random()*10)+10;
//        int kazys = (int) (Math.random()*20)+5;
//        boolean a = true;
//
//        while (a){
//            petras += (int) (Math.random()*10)+10;
//            kazys += (int) (Math.random()*20)+5;
//
//            System.out.println("petras"+petras);
//            System.out.println("kazys"+kazys);
//
//            if (petras > 222 || kazys > 222){
//
//                a = false;
//
//                if (petras > kazys){System.out.println("laimejo petras");}
//
//                if (petras < kazys){System.out.println("laimejo kazys");}
//            }
//        }


//        8 *Sumodeliuokite vinies kalimą. Įkalimo gylį sumodeliuokite pasinaudodami Math.random() funkcija. Vinies ilgis 850mm (pilnai sulenda į lentą).
//“Įkalkite” 5 vinis mažais smūgiais. Vienas smūgis vinį įkala 5-20 mm. Suskaičiuokite kiek reikia smūgių.
//“Įkalkite” 5 vinis dideliais smūgiais. Vienas smūgis vinį įkala 20-30 mm, bet yra 50% tikimybė (pasinaudokite Math.random() funkcija tikimybei sumodeliuoti), kad smūgis nepataikys į vinį. Suskaičiuokite kiek reikia smūgių.

//        boolean pirmas1 = true;
//        int smugiai = 0;
//        int pirmas = 0;
//        int antras = 0;
//        int trecias = 0;
//        int ketvirtas = 0;
//        int penktas = 0;
//
//        while (pirmas1){
//            pirmas += (int) (Math.random() * 15) + 5;
//            antras += (int) (Math.random() * 15) + 5;
//             trecias += (int) (Math.random() * 15) + 5;
//             ketvirtas += (int) (Math.random() * 15) + 5;
//             penktas += (int) (Math.random() * 15) + 5;
//
//            smugiai++;
//            if (pirmas > 850 && antras > 850 && trecias > 850 && ketvirtas > 850 && penktas > 850){pirmas1 = false;}
//        }
//
//        System.out.println("A Is viso smugiu reikejo " +smugiai);


//        boolean pirmas1 = true;
//        int smugiai = 0;
//        int pirmas = 0;
//        int antras = 0;
//        int trecias = 0;
//        int ketvirtas = 0;
//        int penktas = 0;
//
//        while (pirmas1){
//            if (Math.random()>0.5) {pirmas += (int) (Math.random() * 10) + 20; smugiai++; }
//            if (Math.random()>0.5) {antras += (int) (Math.random() * 10) + 20;smugiai++;}
//            if (Math.random()>0.5) {trecias += (int) (Math.random() * 10) + 20;smugiai++;}
//            if (Math.random()>0.5) {ketvirtas += (int) (Math.random() * 10) + 20;smugiai++;}
//            if (Math.random()>0.5) {penktas += (int) (Math.random() * 10) + 20;smugiai++;}
//
//            if (pirmas > 850 && antras > 850 && trecias > 850 && ketvirtas > 850 && penktas > 850){pirmas1 = false;}
//        }
//
//        System.out.println("B Is viso smugiu reikejo " +smugiai);


//        4* Prieš tai nupieštam kvadratui nupieškite raudonas istrižaines.
///*  *  *  *  *  *  *  *  *  *  *  *
// *  *  !  !  !  !  !  !  !  !  *  *
// *  !  *  !  !  !  !  !  !  *  !  *
// *  !  !  *  !  !  !  !  *  !  !  *
// *  !  !  !  *  !  !  *  !  !  !  *
// *  !  !  !  !  *  *  !  !  !  !  *
// *  !  !  !  !  *  *  !  !  !  !  *
// *  !  !  !  *  !  !  *  !  !  !  *
// *  !  !  *  !  !  !  !  *  !  !  *
// *  !  *  !  !  !  !  !  !  *  !  *
// *  *  !  !  !  !  !  !  !  !  *  *
// *  *  *  *  *  *  *  *  *  *  *  *


//        int i, j;
//        int n = 12;
//        for(i = 0; i < n; i++)
//        {
//            for(j = 0; j < n; j++)
//            {
//// left diagonal, right diagonal, top horizontal, bottom horizontal, left vertical, right vertical
//                if(i == j || i + j == n - 1 || i == 0 || i == n - 1 || j == 0 || j == n - 1){
//                    System.out.print(" * ");}
//                else{
//                    System.out.print(" ! ");}}
//            System.out.println();
//        }

//        7* Reikia nupaišyti pilnavidurį rombą, taip pat, kaip ir pilnavidurį kvadratą
//                (https://lt.wikipedia.org/wiki/Rombas), kurio aukštis 21 eilutė.
//        *
//       ***
//      *****
//     *******
//    *********
//   ***********
//  *************
// ***************
//*****************
// ***************
//  *************
//   ***********
//    *********
//     *******
//      *****
//       ***
//        *


//        int myrows = 9;
//
//        for (int m=1; m<=myrows; m++)
//        {
//            for (int n=myrows; n>m; n--)
//            {
//                System.out.print(" ");
//            }
//            for (int p=1; p<=(m * 2) -1; p++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int m=myrows-1; m>=1; m--)
//        {
//            for (int n=myrows-1; n>=m; n--)
//            {
//                System.out.print(" ");
//            }
//            for (int p=1; p<=(m * 2) -1; p++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//int[] numArr;
//
//numArr[7]








































    }
}
