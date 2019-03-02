package org.cmayen.sistema;

import java.util.Date;
import org.cmayen.bean.*;
import org.cmayen.exception.ValidarException;
import org.cmayen.interfaces.OnClickListener;
import org.cmayen.util.ManejadorDeArchivos;

public class Principal {

    public static void main(String args[]) {

        OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick(String mensaje) {
                System.out.println("Un : " + mensaje);
            }
        };
        
        onClickListener.onClick("Click en el panel de control");
        
        OnClickListener onClickListenerLambda = (String mensaje) -> {
            System.out.println("Un : " + mensaje);
        };
        onClickListenerLambda.onClick("Click derecho en el escritorio de windows");
        
        /*try {
            String authors[] = {"Coello", "Killer"};
            Book lista[] = new Book[5];
            lista[0] = new Book("Book 1", new Date(), "Editorial 1", authors);
            lista[1] = new Book("Book 2", new Date(), "Editorial 1", authors);
            lista[2] = new Book("Book 3", new Date(), "Editorial 1", authors);
            lista[3] = new Book("Book 4", new Date(), "Editorial 1", authors);
            lista[4] = new Book("Book 5", new Date(), "Editorial 1", authors);
            lista[0].setIsbn("1111");
            lista[1].setIsbn("2222");
            lista[2].setIsbn("3333");
            lista[3].setIsbn("4444");
            lista[4].setIsbn("5555");

            imprimirLibros(lista);
            guardarInformacion(lista);
            mostrarInformacion("books.txt");
            int n = 100;
            int m = 100/2;
            assert n != m*2 : "Los valores son iguales";
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Esto siempre se ejecuta si o no, existe una exeption");
        }

        Book libroUno = new Book();
        Book libroDos = new Book();
        Book libroTres = new Book();

        libroUno.setIsbn("123456");
        libroUno.setTitle("Hola Mundo");
        Book.makeBookList();

        Magazine revistaUno = new Magazine();
        Magazine revistaDos = new Magazine();
        Magazine revistaTres = new Magazine();

        System.out.println(libroUno);
    }

    public static void imprimirLibros(Book[] libros) throws ValidarException {
        try {
            for (int i = 0; i < libros.length; i++) {
                System.out.println(libros[i]);
            }
        } catch (Exception e) {
            throw new ValidarException();
        }
    }

    public static void guardarInformacion(Book[] libros) {
        ManejadorDeArchivos manejador = new ManejadorDeArchivos("books.txt");

        for (int i = 0; i < libros.length; i++) {
            manejador.escribir(libros[i].toString());
        }
        */

    }
    
    public static void mostrarInformacion(String archivo){
        ManejadorDeArchivos manejador = new ManejadorDeArchivos(archivo);
        System.out.println(manejador.leer(archivo));
    }
}
