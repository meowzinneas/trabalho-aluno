public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    Aluno aluno = new Aluno();

    
    System.out.print("Nome: ");
    aluno.setNome(scanner.nextLine());

    System.out.print("Matrícula: ");
    aluno.setMatricula(scanner.nextLine());

    System.out.print("Sexo: ");
    aluno.setSexo(scanner.nextLine());

    System.out.print("Data de Nascimento: ");
    aluno.setDataNascimento(scanner.nextLine());

    System.out.print("Curso: ");
    aluno.setCurso(scanner.nextLine());

    System.out.print("Ano de Início: ");
    aluno.setAnoInicio(scanner.nextInt());

  
    aluno.setNotaProva1(validarNota(scanner, "Prova 1: "));
    aluno.setNotaProva2(validarNota(scanner, "Prova 2: "));
    aluno.setMediaTrabalhos(validarNota(scanner, "Média dos Trabalhos: "));

    boolean aprovado = aluno.estaAprovado();
    
    double mediaFinal = aluno.calcularMedia();
  
    System.out.println("\n--- Resultados do Aluno ---");
    System.out.println("Nome: " + aluno.getNome());
    System.out.println("Matrícula: " + aluno.getMatricula());
    System.out.println("Curso: " + aluno.getCurso());
    System.out.println("Ano de Início: " + aluno.getAnoInicio());
    System.out.println("Nota Prova 1:  " + aluno.getNotaProva1());
    System.out.println("Nota Prova 2:  " + aluno.getNotaProva2());
    System.out.println("Média dos Trabalhos:  " + aluno.getMediaTrabalhos());
    System.out.println("Aluno " + (aprovado ? "aprovado" : "reprovado") + " com uma média de " + mediaFinal);

    scanner.close();
}


private static double validarNota(Scanner scanner, String nomeNota) {
    double nota;
    do {
        System.out.print("Digite a " + nomeNota);
        nota = scanner.nextDouble();
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        }
    } while (nota < 0 || nota > 10);
    return nota;
}
}
