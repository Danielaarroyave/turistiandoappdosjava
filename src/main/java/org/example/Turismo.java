package org.example;


import org.example.entidades.Local;
import org.example.entidades.Reserva;
import org.example.entidades.Usuario;
import org.example.entidades.Oferta;

 import java.util.Scanner;

 public class Turismo {
    public static void main(String[] args) throws Exception {

        Usuario usuario = new Usuario();
        Scanner lea = new Scanner(System.in);

        System.out.println("\u001B[32m****Bienvenido****\u001B[0m");
        System.out.println("\u001B[34m1.Datos del usuario: \u001B[0m");
        System.out.println("Digite su numero de documento: ");
        usuario.setDocumento(lea.nextLine());
        System.out.println("Digite su nombre y apellidos:  ");
        usuario.setNombres(lea.nextLine());

        System.out.println("Ingrese su ubicacion: ");
        usuario.setUbicacion(lea.nextInt());
        lea.nextLine();
        System.out.println("Ingrese su correo electronico: ");
        usuario.setCorreo(lea.nextLine());
        lea.nextLine();





        Local local = new Local();
        //Scanner lea = new Scanner(System.in);

        System.out.println("\u001B[34m1.Datos del local: \u001B[0m");
        System.out.println("Digite el nit:  ");
        local.setNit(lea.nextLine());

        System.out.println("Digite el nombre de la empresa: ");
        local.setNombre(lea.nextLine());






        Oferta oferta =new Oferta();

        System.out.println("\u001B[34m1.Datos de la oferta: \u001B[0m");
        System.out.println("Digite el titulo de la oferta: ");
        oferta.setTitulo(lea.nextLine());
        System.out.println("Digite la fecha de inicio: ");
        oferta.setFechaInicio(lea.nextLine());
        System.out.println("Digite fecha de fin: ");
        oferta.setFechaFin(lea.nextLine());
        System.out.println("Digite el costo por persona");
        oferta.setCostoPersona(lea.nextDouble());


        Reserva reserva= new Reserva();
        System.out.println("Ingrese la fecha de su reserva");
        reserva.setFechaReserva(lea.nextLine());
        System.out.println("Ingrese el numero de personas para su reserva");





    }

 }

