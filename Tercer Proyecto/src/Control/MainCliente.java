/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Gerson
 */
import java.io.IOException;
import Control.Cliente;


//Clase principal que hará uso del cliente
public class MainCliente
{
    public static void main(String[] args) throws IOException
    {
        Cliente cli = new Cliente(); //Se crea el cliente

        System.out.println("Iniciando cliente\n");
        cli.startClient(); //Se inicia el cliente
    }
}
