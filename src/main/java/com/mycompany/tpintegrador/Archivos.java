/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpintegrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Damian
 */
public class Archivos {
    public static void main (String[] args){
        String Resultados = "C:\\Users\\Damian\\Documents\\NetBeansProjects\\Tpintegrador\\Resultados.csv";
        try {
            for (String goles : Files.readAllLines(Paths.get(Resultados))){
                System.out.println(goles);
            }   } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
        }
    String Pronosticos = "C:\\Users\\Damian\\Documents\\NetBeansProjects\\Tpintegrador\\Pronosticos.csv";
    try{
    for (String puntos : Files.readAllLines(Paths.get(Pronosticos))){
        System.out.println(puntos);
    }}catch(IOException ex) {
        System.out.println("Error al leer el archivo");
    }
}
    
}
