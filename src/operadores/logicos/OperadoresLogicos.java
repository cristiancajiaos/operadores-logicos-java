
package operadores.logicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        // Primera variable
        boolean valor1 = true;
        // Segunda variable
        boolean valor2 = true;
        // Tercera variable
        boolean valor3 = true;
        // Cuarta variable
        boolean valor4 = false;
        
        // Operador lógico: &&
        System.out.println("Primer resultado: " + (valor1 && valor2)); // true
        System.out.println("Segundo resultado: " + (valor3 && valor4)); // false
        
        // Operador lógico: ||
        System.out.println("Tercer resultado: " + (valor1 || valor2)); // true
        System.out.println("Cuarto resultado: " + (valor1 || valor4)); // true
        
        // Operador lógico: !
        System.out.println("Quinto resultado: " + (!valor1)); // false
        System.out.println("Sexto resultado: " + (!valor4)); // true
    }
    
}
