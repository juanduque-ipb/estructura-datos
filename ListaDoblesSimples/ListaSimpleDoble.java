/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Usuario
 */
public class ListaSimpleDoble {
    public Nodo Inicio = null;
    public Nodo Fin = null;
    
    public void AgregarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        
        if(this.Inicio == null) {
            this.Inicio = nuevo;
            this.Fin = nuevo;
            return;
        }
        
        this.Fin.Siguiente = nuevo;
        nuevo.Anterior = this.Fin;
        this.Fin = nuevo;
    }
    
    public void AgregarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        
        if(this.Inicio == null) {
            this.Inicio = nuevo;
            this.Fin = nuevo;
            return;
        }
        nuevo.Siguiente = this.Inicio;
        this.Inicio.Anterior = nuevo;
        this.Inicio = nuevo;
        
    }
    
    public void Imprimir() {
        
        if (this.Inicio == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo actual = this.Inicio;
        System.out.print("null <-> ");
        while(actual != null) {
            System.out.print("["+actual.Dato+"] <-> ");
            actual = actual.Siguiente;
        }
        System.out.print("null");

    }
    
    public void ImprimirInverso() {
        
        if (this.Inicio == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo actual = this.Fin;
        System.out.print("null <-> ");
        while(actual != null) {
            System.out.print("["+actual.Dato+"] <-> ");
            actual = actual.Anterior;
        }
        System.out.print("null");

    }
}
