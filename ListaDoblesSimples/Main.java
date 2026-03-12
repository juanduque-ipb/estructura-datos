/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        ListaSimpleDoble lista = new ListaSimpleDoble();
        lista.Imprimir();
        lista.AgregarAlInicio(10);
        lista.AgregarAlFinal(20);
        lista.AgregarAlFinal(30);
        System.out.println("");
        lista.Imprimir();
        lista.AgregarAlInicio(40);
        lista.AgregarAlFinal(50);
        System.out.println("");
        lista.Imprimir();
        System.out.println("");
        lista.ImprimirInverso();
    }
}
