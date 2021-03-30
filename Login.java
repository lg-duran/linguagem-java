import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);

        System.out.println("Crie um nome de usuário:");
        String nomeCriado = input2.next();

        if (nomeCriado.equals("") || nomeCriado.equalsIgnoreCase("admin") || nomeCriado.equalsIgnoreCase("administrador" )) {
            System.out.println("Usuário inválido");
        } else {
            System.out.println(nomeCriado + " cadastrado com sucesso");
        }

        System.out.println("Crie uma senha:");
        int senhaCriada = input2.nextInt();

    }
}