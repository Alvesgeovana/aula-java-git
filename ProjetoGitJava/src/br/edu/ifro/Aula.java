/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

/**
 *
 * @author 04121255283
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  double num1=10;
  double num2=20;
  calculadora calculadora= new calculadora();
    System.out.println(calculadora.soma (num1,num2));
    System.out.println(calculadora.subtração (num1,num2));
    System.out.println(calculadora.divisão (num1,num2));
    System.out.println(calculadora.multiplicação (num1,num2));
    }




}




