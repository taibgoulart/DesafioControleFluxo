import java.util.Scanner;


public class Contador{

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro um número de 1 a 20: ");
        int numeroUm = terminal.nextInt();

        System.out.println("Digite um segundo número de 1 a 20: ");
        int numeroDois = terminal.nextInt();

        
        

        try{ 
            contar(numeroUm, numeroDois);

        }catch (ParametrosInvalidosException e ) {
            System.out.println("O segundo número precisa ser maior que o primeiro!");

        } finally {
            terminal.close();
        }
        
    } 



    public static void contar (int numeroDois, int numeroUm) throws ParametrosInvalidosException{
        if (numeroUm <= numeroDois)
            throw new ParametrosInvalidosException();

            int contagem = numeroUm - numeroDois;
          
          
            for(int resultado = 1; resultado <= contagem; resultado++){
              
                System.out.println("Contando o resultado: " + resultado);
            }
                


    }


}