/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.domain.externos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class MezclaDirecta {
    
    public void MezclaDirecta(String F, String F1, String F2) throws IOException {
	        int part = 1, n = 0;
	        n = numeroElementos(F);
	        while (part < n) {
	            particiona(F, F1, F2, part);
	            fusiona(F, F1, F2, part);
	            part *= 2;
	        }
	    }

	    public void particiona(String F, String F1, String F2, int part) throws IOException {
	        int k, l;
	        String line = "";
	        //abre el archivo F para lectura.
	        FileReader fr = new FileReader(F);
	        BufferedReader br = new BufferedReader(fr);

	        //Abre el archivo F1 yF2 para escritura.
	        FileWriter fw = new FileWriter(F1);
	        BufferedWriter bw = new BufferedWriter(fw);
	        PrintWriter pwf1 = new PrintWriter(bw);

	        FileWriter fw2 = new FileWriter(F2);
	        BufferedWriter bw2 = new BufferedWriter(fw2);
	        PrintWriter pwf2 = new PrintWriter(bw2);

	        while (line != null) {
	            k = 0;

	            while (k < part && line != null) {
	                line = br.readLine();
	                if (line != null) {
	                    pwf1.println(line);
	                }
	                k++;
	            }
	            l = 0;
	            while (l < part && line != null) {
	                line = br.readLine();
	                if (line != null) {
	                    pwf2.println(line);
	                }
	                l++;
	            }

	        }
	        br.close();
	        pwf1.close();
	        pwf2.close();
	    }

	    public void fusiona(String F, String F1, String F2, int part) throws IOException {
	        //abrir el archivo F1 yF2 de lectura
	        //abrir el archivo F de escritura

	        int k = 0, l = 0;
	        boolean b1, b2;
	        b1 = true;
	        b2 = true;
	        String line1 = "", line2 = "";

	        //abrir el archivo F1 y F2 para lectura.

	        //abre el erchivo F1 y F2 para escritura.
	        FileWriter fw = new FileWriter(F);
	        BufferedWriter bw = new BufferedWriter(fw);
	        PrintWriter pwr = new PrintWriter(bw);

	        FileReader fr = new FileReader(F1);
	        BufferedReader br = new BufferedReader(fr);

	        FileReader fr2 = new FileReader(F2);
	        BufferedReader br2 = new BufferedReader(fr2);



	        line1 = br.readLine();
	        line2 = br2.readLine();

	        if (line1 != null) {
	            b1 = false;
	        }
	        if (line2 != null) {
	            b2 = false;
	        }

	        while ((line1 != null) || (b1 == false) && (line2 != null) || (b2 == false)) {
	            k = 0;
	            l = 0;

	            while ((k < part) && (b1 == false) && (l < part) && (b2 == false)) {
	            	
	                if (line1.compareTo(line2)<0) {
	                    if (line1 != null) {
	                        pwr.println(line1);
	                    }
	                    b1 = true;
	                    k++;
	                    line1 = br.readLine();
	                    if (line1 != null) {
	                        b1 = false;
	                    }
	                } else {
	                    if (line2 != null) {
	                        pwr.println(line2);
	                    }
	                    b2 = true;
	                    l++;
	                    line2 = br2.readLine();
	                    if (line2 != null) {
	                        b2 = false;
	                    }
	                }
	            }

	            if (k < part) {

	                while ((k < part) && (b1 == false)) {
	                    if (line1 != null) {
	                        pwr.println(line1);
	                    }
	                    b1 = true;
	                    k++;
	                    line1 = br.readLine();
	                    if (line1 != null) {
	                        b1 = false;
	                    }
	                }
	            }

	            if (l < part) {

	                while ((l < part) && (b2 == false)) {
	                    if (line2 != null) {
	                        pwr.println(line2);
	                    }
	                    b2 = true;
	                    l++;
	                    line2 = br2.readLine();
	                    if (line2 != null) {
	                        b2 = false;
	                    }
	                }
	            }
	        }

	        if (b1 == false && line1 != null) {
	            pwr.println(line1);
	        }
	        if (b2 == false && line2 != null) {
	            pwr.println(line2);
	        }

	        while (line1 != null) {
	            line1 = br.readLine();
	            if (line1 != null) {
	                pwr.println(line1);
	            }
	        }

	        while (line2 != null) {
	            line2 = br2.readLine();
	            if (line2 != null) {
	                pwr.println(line2);
	            }
	        }

	        fr2.close();
	        fr.close();
	        pwr.close();

	    }//Fin de metodo Fusiona

	//Terminar el codigo para que devuelva el numero de elementos que tiene el archivo
	    public int numeroElementos(String F) {
	        int elementos = 0;
	        int cuantos = 0;
	        Scanner fileIn;
	        try {
	            fileIn = new Scanner(new FileReader(F));

	            while (fileIn.hasNextLine()) {
	                fileIn.next();
	                elementos++;
	            }
	            fileIn.close();
	        } catch (Exception e) {
	        }
	        System.out.println(elementos);
	        return elementos;
	    } //fin numero de elementos
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String F = "F.txt", F1 = "F1.txt", F2 = "F2.txt";
	        MezclaDirecta ordenamientoExterno = new MezclaDirecta();
	        try {
				ordenamientoExterno.MezclaDirecta(F, F1, F2);
	        	//ordenamientoExterno.numeroElementos(F);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }//fin main
    
}
