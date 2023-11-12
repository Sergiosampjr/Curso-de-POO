package aluno;

import java.util.ArrayList;

public class Disciplina {
	int código;
	String nome;
	int qtdmaxdealunos = 0;
	int media = 7;
	int maior = 0;
	ArrayList<Aluno> alunosmatriculados = new ArrayList<Aluno>(); 

	
	void Gerarestatisticas() {
		if () {
			for (int i = 0; i < alunosmatriculados.size(); i++) {
				System.out.println("O aluno que tirou a maior média foi " + alunosmatriculados.get(i));
			}
		}else{
				System.out.println("Os alunos que não passaram por média foram " + alunosmatriculados.get(código));
			}
		
		System.out.println("O aluno que tirou a maior média foi " );
		System.out.println();
		System.out.println();
	}	
	void matricularaluno() {
		if(alunosmatriculados.size()>qtdmaxdealunos) {
		System.out.println("Matrícula não permitida.");	
		}
		else
			alunosmatriculados.add(null);
	}
	public Aluno atribuirnotas(int matricula) {{
		for (int i = 0; i < alunosmatriculados.size(); i++) {
			if(alunosmatriculados.get(i).getmatricula() == matricula) {
				return alunosmatriculados.get(i);	
			}
			}
		return null;
	}
	}
	void setalterarnota() {
		this.atribuirnotas(código);
	}
		






















}
