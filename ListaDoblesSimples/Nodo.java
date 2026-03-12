/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Usuario
 */
public class Nodo {
    public int Dato;
    public Nodo Siguiente;
    public Nodo Anterior;
    
    public Nodo(int dato) {
        this.Dato = dato;
        this.Siguiente = null;
        this.Anterior = null;
    }
}
