import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = ler.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = ler.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

        ler.close();
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        if(parametroDois <= parametroUm){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
