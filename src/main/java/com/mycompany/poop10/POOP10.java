/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop10;

/**
 *
 * @author poo08alu33
 */
public class POOP10 {

    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
        try{
            String mensajes[] = {"Primero", "Segundo", "Tercero"};
            for (int i = 0; i <= 3; i++){
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Apuntador fuera del rango del arreglo.");
        }
        
        System.out.println("Hola Mundo");
        
        // ArithmeticException y Exception e
        try{
            double equis= 0/0;
            System.out.println("Equis = "+ equis);
            //float equis = 10/y;
            //System.out.println("Equis = "+ equis); --Error general
        }catch(ArithmeticException e){
            System.out.println("Error: Division entre cero.");
        }catch(Exception e){
            System.out.println("Error: Excepcion general");
        }finally{
            System.out.println("Hola, a pesar de todo si me ejecuto.");
        }
        
        //Propagacion de excepciones
        try{
            double division = miMetodo(10,0);
            System.out.println("division = "+ division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion aritmetica.");
            System.out.println(e.getMessage());
            e.printStackTrace(); 
        }
        
        //Cajero
        Cuenta cuenta = new Cuenta();
        try{
            cuenta.depositar(2000);
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1500);
            cuenta.getSaldo();
            cuenta.depositar(300000000);
            cuenta.getSaldo();
        }catch(SaldoInsuficienteException e){
            e.printStackTrace();
        }
    }
    
    private static double miMetodo(int a, int b)throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException();
        }
        double c = a/b;
        return c;
    }
}
