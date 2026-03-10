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
    
    public boolean Search(int dato){
        if(Head == null) {
            System.out.println("La lista esta vacia");
            return false;
        }
        
        if(Head.Dato == dato) {
            System.out.println("Dato encontrado, en HEAD");
            return true;
        }
        
        Nodo Actual = Head;
        boolean flag = false;
        while(Actual != null){
            if(Actual.Dato == dato) {
                System.out.println("Dato Encontrado en:"+Actual.toString());
                flag = true;
                break;
            }
            Actual = Actual.Puntero;
        }
        
        return flag;
    }
    
    public void Remove(int dato) {
         if(Head == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        
        if(Head.Dato == dato) {
            System.out.println("Dato removido, en HEAD");
            Head = null;
            return;
        }
        
        Nodo Actual = Head;
        while(Actual.Puntero != null && Actual.Puntero.Dato != dato){
            Actual = Actual.Puntero;
        }
        
        if(Actual == null) {
            System.out.println("Dato no encontrado");
        } else {
            System.out.println("MEMORIA:"+Actual.Puntero.toString());
            System.out.println("MEMORIA:"+Actual.Puntero.Puntero.toString());

            Actual.Puntero = Actual.Puntero.Puntero;
            System.out.println("Dato Eliminado");
        }
    }
    
    
}

