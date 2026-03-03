/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

/**
 *
 * @author Usuario
 */
public class SimpleList {
    public Nodo Head;
    
    public SimpleList(){
        Head = null;
    }
    
    public void Add(int dato){
        Nodo NuevoNodo = new Nodo(dato);
        
        if(Head == null) {
            Head = NuevoNodo;
        } else {
            Nodo Current = Head;
            
            while(Current.Puntero != null) {
                Current = Current.Puntero;
            }
            Current.Puntero = NuevoNodo;
        }
    }
    
    public void Print() {
        Nodo Current = Head;
        while(Current != null) {
            
            System.out.print("["+Current.Dato+"] -> ");
                Current = Current.Puntero;
            
        }
        System.out.print("null");
    }
    
    
    
    
}
