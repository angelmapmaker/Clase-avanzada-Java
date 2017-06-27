package org.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) throws IOException {
        Cliente miCliente = new Cliente();
        miCliente.setNombre("Angel");
        miCliente.setEdad(35);
        miCliente.setSalario(40);

      //  System.out.println("Estimado Cliente " + miCliente.getNombre() + " Su edad es: " + miCliente.getEdad() + " Y su salario es: " + miCliente.getSalario());

        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Su Nomber: ");
        miCliente.setNombre(reader.readLine());
        System.out.println("Su edad");
        miCliente.setEdad(Integer.parseInt( reader.readLine()));
        System.out.println("Su Salario");
        miCliente.setSalario(Float.parseFloat( reader.readLine()));

        System.out.println("Estimado Cliente " + miCliente.getNombre() + " Su edad es: " + miCliente.getEdad() + " Y su salario es: " + miCliente.getSalario());
    }




}