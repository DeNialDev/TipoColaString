
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colastring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class TipoColaString {

    final static int MAX_ELEMENTOS = 10;
    private static int frente;
    private static int finall;
    private static String elemento[];

    /**
     * @param args the command line arguments
     */
    public int Size() {
        return MAX_ELEMENTOS;
    }

    public TipoColaString() {
        frente = 0;
        finall = -1;
        elemento = new String[MAX_ELEMENTOS];
    }

    public void insertar(String d) {
        if (!colallena()) {
            elemento[++finall] = d;
        } else {
            System.out.println("Cola llena");
        }
    }

    public String borrar() {
        if (!colavacia()) {
            return elemento[frente++];
        } else {
            System.out.println("Cola vacia");
            return " ";
        }
    }

    public boolean colavacia() {
        if (finall < frente) {
            return true;
        } else {
            return false;
        }
    }

    public boolean colallena() {
        if (finall == MAX_ELEMENTOS - 1) {
            return true;
        } else {
            return false;
        }
    }

    public  void muestraCola(int magnitud) {
        String cadenaCola = "";
        
        for (int i = 0; i < magnitud; i++) {
            cadenaCola += i + " " + elemento[i];
        }
        System.out.println(cadenaCola + "\nFrente "+ frente + "\nFinal" +finall);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TipoColaString cola = new TipoColaString();
        for (int i = 0; i < cola.Size()-5; i++) {
            System.out.println("Ingrese un nombre");
            cola.insertar(br.readLine());
        }
        for (int i = 0; i < cola.Size()-6; i++) {
            System.out.println("ELiminar 4 elementos");
            cola.borrar();
        }
         for (int i = 0; i < cola.Size()-4; i++) {
            System.out.println("Ingrese un nombre");
            cola.insertar(br.readLine());
        }
        cola.muestraCola(cola.Size());
    }

}
