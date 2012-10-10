package model.domain.externos;

//
import java.io.*;

/**
 *
 * @author Gustavo Canul
 */
public class MezclaEquilibrada {

    public static void elemen(String F) throws IOException {
        FileReader fr = new FileReader(F);
        BufferedReader br = new BufferedReader(fr);

        String inLine = "a";
        int count = 0;
        //System.out.print("Archivo:"+F+" :");
        while (inLine != null) {
            inLine = br.readLine();
            if (inLine != null) {
                //System.out.print(" "+inLine);
                count = count + 1;
            }
        }
        //System.out.println("");
        br.close();
    }

    public static boolean cambiob(boolean b) {
        
        return !b;
    }

    public static void mezclaequilibrada(String F, String F1, String F2, String F3) throws IOException {
        particioninicial(F, F2, F3);
        String inLineF1 = " sd";
        String inLineF3 = "asd";
        boolean BAND = true;
        do {

            if (BAND == true) {
                particionfusion(F2, F3, F, F1);
                BAND = false;
            } else {
                particionfusion(F, F1, F2, F3);
                BAND = true;
            }
            FileReader fr1 = new FileReader(F1);
            BufferedReader br1 = new BufferedReader(fr1);
            FileReader fr3 = new FileReader(F3);
            BufferedReader br3 = new BufferedReader(fr3);
            inLineF1 = br1.readLine();
            inLineF3 = br3.readLine();
            br1.close();
            br3.close();
        } while (inLineF1 != null || inLineF3 != null);
    }

    public static void particioninicial(String F, String F2, String F3) throws IOException {
        String Aux = null , R ;
        boolean BAND = true;

        FileReader fr = new FileReader(F);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw2 = new FileWriter(F2);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        PrintWriter pw2 = new PrintWriter(bw2);

        FileWriter fw3 = new FileWriter(F3);
        BufferedWriter bw3 = new BufferedWriter(fw3);
        PrintWriter pw3 = new PrintWriter(bw3);

        String inLineF = br.readLine();
        if (inLineF != null) {
            pw2.print("");
            pw2.println(inLineF);
            BAND = true;
            Aux = inLineF;
        }

        while (inLineF != null) {
            inLineF = br.readLine();
            if (inLineF != null) {
                R = inLineF;
                if (R.toString().toLowerCase().compareTo(Aux.toString().toLowerCase()) >0 || R.toLowerCase().compareTo(Aux.toLowerCase()) == 0) {
                    Aux = inLineF;
                    if (BAND == true) {
                        pw2.print("");
                        pw2.println(inLineF);
                    } else {
                        pw3.print("");
                        pw3.println(inLineF);
                    }
                } else {
                    Aux = inLineF;
                    if (BAND == true) {
                      pw3.print("");
                        pw3.println(inLineF);
                        BAND = false;
                    } else {
                        pw2.print("");
                        pw2.println(inLineF);
                        BAND = true;
                    }
                }
            }
        }
        pw2.close();
        pw3.close();
        br.close();
    }

    public static void particionfusion(String FA, String FB, String FC, String FD) throws IOException {
        String R1 = new String(),R2 = new String(), Aux = new String();
        boolean B, DELE1, DELE2;

        FileReader frFA = new FileReader(FA);
        BufferedReader brFA = new BufferedReader(frFA);

        FileReader frFB = new FileReader(FB);
        BufferedReader brFB = new BufferedReader(frFB);

        FileWriter fwFC = new FileWriter(FC);
        BufferedWriter bwFC = new BufferedWriter(fwFC);
        PrintWriter pwFC = new PrintWriter(bwFC);

        FileWriter fwFD = new FileWriter(FD);
        BufferedWriter bwFD = new BufferedWriter(fwFD);
        PrintWriter pwFD = new PrintWriter(bwFD);

        B = true;
        String inLineFA = brFA.readLine();
        String inLineFB = brFB.readLine();
        //System.out.println("Primera linea de F2:"+inLineFA);
        //System.out.println("Primera linea de F3:"+inLineFB);
        if (inLineFA != null) {
            R1 = inLineFA;
            //System.out.println("primer R1:"+R1);
        }
        if (inLineFB != null) {
            R2 = inLineFB;
            //System.out.println("Primer R2:"+R2);
        }
        //System.out.println("R1: "+R1+"R2: "+R2);
        if (R1.toLowerCase().compareTo(R2.toLowerCase()) < 0) {
            Aux=R1;
        } else {
            Aux=R2 ;
        }
        //System.out.println("Aux="+Aux);
        DELE1 = false;
        DELE2 = false;
        while ((inLineFA != null || DELE1 != true) && (inLineFB != null || DELE2 != true)) {
            //System.out.println("Ciclo---------- Aux:"+Aux+"B: "+B);

            if (DELE1 == true) {
                inLineFA = brFA.readLine();
                DELE1 = false;
                //System.out.println("linea de F2:"+inLineFA);

            }
            if (DELE2 == true) {
                inLineFB = brFB.readLine();
                DELE2 = false;
                //System.out.println("linea de F3:"+inLineFB);
            }
            if (inLineFA != null) {
                R1 = inLineFA;
            } else {
                
            }
            if (inLineFB != null) {
                R2 = inLineFB;
            } else {
                
            }
            //System.out.println("R1:"+R1);
            //System.out.println("R2:"+R2);

            //if (R1!=0 || R2!=0){ 
            if (R1.toLowerCase().compareTo(R2.toLowerCase()) < 0) {
                if (R1.toLowerCase().compareTo(Aux.toLowerCase()) >0 || R1.toLowerCase().compareTo(Aux.toLowerCase()) ==0) {
                    Aux = ayuda1(Aux, R1, FC, FD, B);
                    DELE1 = true;
                } else {
                    if (R2.toLowerCase().compareTo(Aux.toLowerCase()) >0 || R2.toLowerCase().compareTo(Aux.toLowerCase()) ==0) {
                        Aux = ayuda1(Aux, R2, FC, FD, B);
                        DELE2 = true;
                    } else {
                        Aux = ayuda2(Aux, R1, FC, FD, B);
                        B = cambiob(B);
                        DELE1 = true;
                    }
                }
            } else {
                if (R2.toLowerCase().compareTo(Aux.toLowerCase()) >0 || R2.toLowerCase().compareTo(Aux.toLowerCase()) ==0) {
                    Aux = ayuda1(Aux, R2, FC, FD, B);
                    DELE2 = true;
                } else {
                    if (R1.toLowerCase().compareTo(Aux.toLowerCase()) >0 || R1.toLowerCase().compareTo(Aux.toLowerCase()) ==0) {
                        Aux = ayuda1(Aux, R1, FC, FD, B);
                        DELE1 = true;
                    } else {
                        Aux = ayuda2(Aux, R2, FC, FD, B);
                        B = cambiob(B);
                        DELE2 = true;
                    }
                }
            }
            //}

        }
        //System.out.println("----Fin Ciclo D1: "+DELE1+" D2: "+DELE2+" FA:"+inLineFA+" FB:"+inLineFB);
        if (DELE1 == true && inLineFA == null) {
            if (inLineFB != null) {
                ayuda3(Aux, R2, FB, FC, FD, B);
            }
        }
        if (DELE2 == true && inLineFB == null) {
            if (inLineFA != null) {
                ayuda3(Aux, R1, FA, FC, FD, B);
            }
        }

        pwFC.close();
        pwFD.close();
    }

    public static String ayuda1(String Aux, String R, String FC, String FD, boolean B) throws IOException {
        Aux = R;

        FileWriter fwFC = new FileWriter(FC, true);
        BufferedWriter bwFC = new BufferedWriter(fwFC);
        PrintWriter pwFC = new PrintWriter(bwFC);

        FileWriter fwFD = new FileWriter(FD, true);
        BufferedWriter bwFD = new BufferedWriter(fwFD);
        PrintWriter pwFD = new PrintWriter(bwFD);
        if (B) {
            if (R != null) {
                pwFC.print("");
                pwFC.println(R);
            }
            pwFC.close();
            //elemen(FC);
        } else {
            if (R != null) {
                pwFD.print("");
                pwFD.println(R);
            }
            pwFD.close();
            //elemen(FD);
        }
        //System.out.println("Fin Ayuda 1");
        return Aux;

    }

    public static String ayuda2(String Aux, String R, String FC, String FD, boolean B) throws IOException {
        FileWriter fwFC = new FileWriter(FC, true);
        BufferedWriter bwFC = new BufferedWriter(fwFC);
        PrintWriter pwFC = new PrintWriter(bwFC);

        FileWriter fwFD = new FileWriter(FD, true);
        BufferedWriter bwFD = new BufferedWriter(fwFD);
        PrintWriter pwFD = new PrintWriter(bwFD);
        Aux = R;
        if (B) {
            if (R != null) {
                pwFD.print("");
                pwFD.println(R);
            }
            pwFD.close();
            //elemen(FD);
            B = false;
        } else {
            if (R != null) {
                pwFC.print("");
                pwFC.println(R);
            }
            pwFC.close();
            //elemen(FC);
            B = true;
        }
        //System.out.println("Fin Ayuda 2");
        return Aux;
    }

    public static void ayuda3(String Aux, String R, String F, String FC, String FD, boolean B) throws IOException {
        // System.out.println("AYUDA3 Aux: "+Aux+" R:"+R+" F:"+F);
        FileReader frF = new FileReader(F);
        BufferedReader brF = new BufferedReader(frF);
        String inLine = String.valueOf(R), inLineF = "dsa";

        if (R.toLowerCase().compareTo(Aux.toLowerCase()) >0 ||R.toLowerCase().compareTo(Aux.toLowerCase()) == 0) {
            Aux = ayuda1(Aux, R, FC, FD, B);
        } else {
            Aux = ayuda2(Aux, R, FC, FD, B);
            B = cambiob(B);
        }
        //System.out.println("inL: "+inLine+" inF:"+inLineF);
        while (inLineF.compareToIgnoreCase(inLine) != 0) {
            inLineF = brF.readLine();
        }


        while (inLineF != null) {
            //System.out.println("----while ayuda 3: "+F+" "+FC+" "+FD);
            inLineF = brF.readLine();
            if (inLineF != null) {
                R = inLineF;
                if (R.toLowerCase().compareTo(Aux.toLowerCase()) >0 ||R.toLowerCase().compareTo(Aux.toLowerCase()) == 0) {
                    Aux = ayuda1(Aux, R, FC, FD, B);
                } else {
                    Aux = ayuda2(Aux, R, FC, FD, B);
                    B = cambiob(B);
                }
            }
        }
        //System.out.println("----Fin ayuda3");
    }

    public static void main(String args[]) {

        String F = "F.txt", F1 = "F1.txt", F2 = "F2.txt", F3 = "F3.txt";

        try {
            mezclaequilibrada(F, F1, F2, F3);
            //particioninicial(F,F2,F3);
            //particionfusion(F2,F3,F,F1);
        } catch (IOException e) {
        }

    }
}
