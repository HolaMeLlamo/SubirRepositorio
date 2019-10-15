/* 
 * Copyright 2019 Aitor Sanchez - aitor.sanchez.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Aitor Sanchez - aitor.sanchez.alum@iescamp.es
 */
public class Main {

    public static int tentob = 0; //intentos xdxd
    public static int tentod = 0; //intentos xdxd

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static int sb = 0;   //puntos stats bruja
    public static int vitb = 0; //vida bruja
    public static int atkb = 0; //ataque bruja
    public static int defb = 0; //defensa bruja
    public static int sd = 0;   //puntos stats demonio
    public static int vitd = 0; //vida demonio
    public static int atkd = 0; //ataque demonio
    public static int defd = 0; //defensa demonio

    public static void clr() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
    class hola{
    }
    public static void main(String[] args) throws IOException {
        System.out.println("======================");
        System.out.println("= B I E N V E N I D O=");
        System.out.println("=   -pulse enter-    =");
        System.out.println("======================");
        System.in.read();
        stats_bruja();
    }

    public static void stats_bruja() {

        clr();
        System.out.println("Debe elegir las stats de su personaje segun el orden "
                + "indicado, hasta un maximo de 10.");
        System.out.println("---------------------------------------------------"
                + "----------------------------------");
        if (tentob > 0) {
            System.out.println("10 COMO MÁXIMO!!");
        }
        System.out.println("BRUJA");
        System.out.println("-Vitalidad");
        System.out.println("-Ataque");
        System.out.println("-Defensa");
        System.out.print("Valor de la Vitalidad: ");
        try {
            vitb = SCN.nextInt();

        } catch (Exception e) {
            SCN.nextLine();
            stats_bruja();
        
        }
        System.out.print("Valor del Ataque: ");
        try {
            atkb = SCN.nextInt();

        } catch (Exception e) {
            SCN.nextLine();
            stats_bruja();
        }
        System.out.print("Valor de la Defensa: ");
        try {
            defb = SCN.nextInt();

        } catch (Exception e) {
            SCN.nextLine();
            stats_bruja();
        }
        int sb = vitb + atkb + defb; //total stats
        tentob = tentob + 1;
        if (sb > 10) {
            stats_bruja();
        }
        stats_demonio();
    }

    public static void stats_demonio() {
        clr();
        System.out.println("Debe elegir las stats de su personaje segun el orden "
                + "indicado, hasta un maximo de 10.");
        System.out.println("---------------------------------------------------"
                + "----------------------------------");
        if (tentod > 0) {
            System.out.println("10 COMO MÁXIMO!!");
        }
        System.out.println("DEMONIO");
        System.out.println("-Vitalidad");
        System.out.println("-Ataque");
        System.out.println("-Defensa");
        System.out.print("Valor de la Vitalidad: ");
        try {
            vitd = SCN.nextInt();

        } catch (Exception e) {
            SCN.nextLine();
            stats_demonio();
        }
        System.out.print("Valor del Ataque: ");
        try {
            atkd = SCN.nextInt();

        } catch (Exception e) {
            SCN.nextLine();
            stats_demonio();
        }
        System.out.print("Valor de la Defensa: ");
        try {
            defd = SCN.nextInt();

        } catch (Exception e) {
            SCN.nextLine();
            stats_demonio();
        }
        int sd = vitd + atkd + defd; //total stats
        tentob = tentob + 1;
        if (sd > 10) {
            stats_demonio();
        }
        empezar();
    }

    public static void empezar() {
        //Calculo Vida
        int vidab = vitb * 10 + 50; //vida bruja
        int vidad = vitd * 10 + 50; //vida demonio
        int vidamaxb = vidab; //vida max bruja
        int vidamaxd = vidad; //vida max demonio
        //Calculo ataque

        clr();
        System.out.println("Bruja: " + vidab + "/" + vidamaxb + "            "
                + "Demonio: " + vidad + "/" + vidamaxd);
        fnal();
    }

    public static void fnal() {
        System.out.println("chao jaja salu2");
        System.exit(0);
    }

}
