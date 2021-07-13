package br.com.alura.bytebank;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Principal {


    public static void main(String[] args) {
        System.out.println("BEM VINDO AO BYTEBANK!!!!\n \n");

        Funcionario jose = new Funcionario("José", 1, LocalDate.of(1982,04,22));
        Funcionario maria = new Funcionario("Maria", 2, LocalDate.of(1986,10,13));
        Funcionario antonia = new Funcionario("Antonia", 3, LocalDate.of(1981,07,02));
        Funcionario vilma = new Funcionario("Vilma", 4, LocalDate.of(1989,12,19));

        System.out.println(jose);
        System.out.println(maria);
        System.out.println(antonia);
        System.out.println(vilma);
    }




}
