import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) throws Exception {

		//Declaração e inicialização de variáveis
		int frequenciaDoAluno = 0;
		double notaDoAluno = 0;
		boolean alunoAprovado = false;
		double somaNotasDoAluno = 0;
		double mediaDoAluno = 0;
		String nomeDoAluno  = "";
		int idadeDoAluno = 0;
		int serieDoAluno = 0;
		String turmaDoAluno = "";
		String turnoDoAluno = "";

		String[] alunos = new String[5];
		

		/*Declaração e inicialização do Scanner para
		  capturar a entrada do treclado.*/
		Scanner sc = new Scanner(System.in);

		while (nomeDoAluno != "fim") {

			sc = new Scanner(System.in);		

			System.out.println("Por favor, digite o nome do aluno(a)");
			nomeDoAluno = sc.nextLine();

			if (nomeDoAluno.equals("fim")) {
				break;
			}

			System.out.println("Por favor, digite a idade do aluno(a)");
			idadeDoAluno = Integer.parseInt(sc.nextLine());

			System.out.println("Por favor, digite a série do aluno(a)");
			serieDoAluno = Integer.parseInt(sc.nextLine());


			System.out.println("Por favor, digite a turma do aluno(a)");
			//turmaDoAluno = (char)System.in.read();
			turmaDoAluno = sc.nextLine();

			System.out.println("Por favor, digite o turno do aluno(a)");
			turnoDoAluno = sc.nextLine();

			//while (frequenciaDoAluno >= 0){
			

			System.out.println("Por favor digite a frequencia do aluno");
			frequenciaDoAluno = sc.nextInt();

			/*if (frequenciaDoAluno < 0 || frequenciaDoAluno > 100) {
				break;
			}*/				
	

			for(int contadorDeNota = 0; contadorDeNota < 4; contadorDeNota++){
				System.out.println("Por favor digite a nota do aluno");

				
				notaDoAluno = sc.nextInt();

				if (notaDoAluno < 0 || notaDoAluno > 100){

					System.out.println("Nota inválida, por favor digitar a nota correta do aluno(a)");
					notaDoAluno = sc.nextInt();
				}

				somaNotasDoAluno = somaNotasDoAluno + notaDoAluno;
			}

			mediaDoAluno = somaNotasDoAluno / 4;

			alunoAprovado = (frequenciaDoAluno >= 75 && mediaDoAluno >= 7);

			System.out.println("");

			if (alunoAprovado){
				System.out.println("Aluno aprovado com media: " + mediaDoAluno);
			} else {
				System.out.println("Aluno reprovado com media: " + mediaDoAluno);
			}

			System.out.println("");			
			
		} 

		sc.close(); 

	}

}