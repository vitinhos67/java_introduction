/*
 * We can import from Java class for catch info about System date, locale and other infos.
 * 
 * Just use import with java.util.name_class_for_use or java.util.* for import all
 * 
 */

import java.util.Date;
import java.util.Locale;


public class App {
    public static void main(String[] args) throws Exception {
        Date relogio = new Date();
        
        Locale linguagem = Locale.getDefault();

        System.out.println("A hora do sistema é:");
        System.out.println(relogio.toString());

        System.out.println("O idioma do sistema é:");

        String mensagem = String.format("O idioma do sistema operacional é em %s.", linguagem.getLanguage());
        System.out.println(mensagem);
    }
}
