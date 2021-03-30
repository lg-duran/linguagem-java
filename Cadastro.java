import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        Scanner senha = new Scanner(System.in);
        Scanner senha2 = new Scanner(System.in);
        Scanner nomeDeLogin = new Scanner(System.in);
        Scanner senhaDeLogin = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nomeDoUsuario = nome.next();

        System.out.println("");

        System.out.println("Digite sua senha: (deve ser composta somente por números)");
        int senhaDoUsuario = senha.nextInt();

        System.out.println("");

        System.out.println("Confirme sua senha: ");
        int confirmacaoSenhaDoUsuario = senha2.nextInt();

        System.out.println("");

        if(senhaDoUsuario == confirmacaoSenhaDoUsuario) {
            System.out.println("Senha confirmada");
        } else {
            System.out.println("Senha incompativel");
        } 

        /*pesquisei "como parar um if" na internet um jeito para caso der senha incompativel para o programa ou fazer denovo o 
        confirmar senha, mas não consegui, aqui os sites que eu pesquisei:
        https://www.guj.com.br/t/break-dentro-de-um-if-return-dentro-de-um-if/25122
        https://www.guj.com.br/t/resolvido-como-parar-de-executar-um-metodo-exit-return-break/70520
        */

        System.out.println("");

        System.out.println("Login: ");

        System.out.println("");

        System.out.println("Digite o seu nome:");
        String loginNomeDoUsuario = nomeDeLogin.next();

        System.out.println("");

        System.out.println("Digite a sua senha:");
        int loginSenhaDoUsuario = senhaDeLogin.nextInt();

        System.out.println("");

        /*vi esse equals nainternet, mas não funciona do gento que eu quero
        System.out.println(loginNomeDoUsuario.equals(nomeDoUsuario));*/

        if(loginNomeDoUsuario.equals(nomeDoUsuario)) {
            
        } else {
            System.out.println("Nome incorreto");
        }

        System.out.println("");

        if(loginSenhaDoUsuario == senhaDoUsuario) {
            System.out.println("Bem vindo(a) " + nomeDoUsuario);
        } else {
            System.out.println("Senha incorreta");
        }

    }
}