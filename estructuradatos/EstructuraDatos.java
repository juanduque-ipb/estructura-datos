/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructuradatos;

/**
 *
 * @author Usuario
 */
public class EstructuraDatos {

    public static void main(String[] args) {
        SimpleList List = new SimpleList();
        List.Add(10);
        List.Add(20);
        List.Add(30);
        List.Print();
         System.out.println("");
        List.Search(10);
         System.out.println("");
         List.Search(30);
         System.out.println("");
         List.Remove(20);
         System.out.println("");
         List.Print();
    }
}
