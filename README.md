# Sistema Acadêmico - FCTE

## Descrição do Projeto

Desenvolvimento de um sistema acadêmico para gerenciar alunos, disciplinas, professores, turmas, avaliações e frequência, utilizando os conceitos de orientação a objetos (herança, polimorfismo e encapsulamento) e persistência de dados em arquivos.

O enunciado do trabalho pode ser encontrado aqui:
- [Trabalho 1 - Sistema Acadêmico](https://github.com/lboaventura25/OO-T06_2025.1_UnB_FCTE/blob/main/trabalhos/ep1/README.md)

## Dados do Aluno

- **Nome completo:** Lucas Peixoto Rodrigues
- **Matrícula:** 242024271
- **Curso:** Engenharias
- **Turma:** T06

---

## Instruções para Compilação e Execução

1. **Compilação:**  
   Clonar o repositóriona IDE como comando: git clone https://github.com/LucasPeixotoRodrigues/ep1-OO-2025_1_LucasPeixoto.git

2. **Execução:**  
   Executar o Main.java no botão Run Java

3. **Estrutura de Pastas:**  
```bash
   Projeto ep1
├── src/
│   ├── Aluno.java                         # Dados dos alunos; classe base;
│   ├── AlunoEspecial.java                 # Herança - aluno especial;
│   ├── Avaliacao.java                     # Dados da avaliação;
│   ├── Disciplina.java                    # Dados da disciplina;
│   ├── GerenciadorDeAlunos.java           # Gerencia a classe Aluno;
│   ├── GerenciadorDeDisciplinas.java      # Gerencia a classe Disciplina;
│   ├── Main.java                          # Classe principal, que rodará o código;
│   ├── ModoAluno.java                     # Métodos do Aluno;
│   ├── ModoAvaliacao.java                 # Métodos da Avaliação;
│   ├── ModoDisciplina.java                # Métodos da disciplina;
│   └── Turma.java                         # Dados da turma;
│
└── README.md

```
3. **Versão do JAVA utilizada:**  

   Foi utilizada a versão 21.0.7 do Java.

---

## Vídeo de Demonstração

- [https://drive.google.com/file/d/12XmmIwySuEpP5aGonuKrZTw8f9pecEe3/view?usp=drive_link]

---

## Prints da Execução

1. Menu Principal:  
   https://drive.google.com/file/d/1koILLy7Td7mJWy7ANa6lN1tZBoTVLKcT/view?usp=drive_link

2. Cadastro de Aluno:  
   https://drive.google.com/file/d/1HnjudQiCdBXcjJqAWEM59WVL1VRmX1Tr/view?usp=drive_link

3. Cadastro de turma:  
   https://drive.google.com/file/d/1txuqKQ_MqOHtUW0mUlXMHKuyEJGFfZEj/view?usp=drive_link

---

## Principais Funcionalidades Implementadas

- [ ] Cadastro, listagem, matrícula e trancamento de alunos (Normais e Especiais)
- [ ] Cadastro de disciplinas e criação de turmas (presenciais e remotas)
- [ ] Matrícula de alunos em turmas, respeitando vagas e pré-requisitos
- [ ] Lançamento de notas e controle de presença
- [ ] Cálculo de média final e verificação de aprovação/reprovação
- [ ] Tratamento de duplicidade de matrículas
- [ ] Uso de herança, polimorfismo e encapsulamento

---

## Observações (Extras ou Dificuldades)

- Tive dificuldade de relacionar algumas classes de forma efetiva, o que acabou dificultando bastante na criação de determinados métodos. Houve também dificuldade de implementação efetiva dos métodos, o que acredito que possa estar relacionado ao desafio de relacionamento das classes. Aviso: não consegui armazenar os dados em arquivos e, também, não consegui finalizar o ModoAvaliação, além disso, os métodos de fazerMatricula e listarTurmas estão dando erro. O de fazerMatricula estádando erro há muito tempo e, quando o conserto, outro erro nesse mesmo método ocorre; enquanto isso, o método de listarTurmas estava funcionando perfeitamente, mas deixou de o fazer após algumas alterações no modoDisciplina e nas classes relacionadas, o que não consegui converter. OBS sobre o vídeo: perdão pela qualidade do áudio e pelas vezes que tossi.

---

## Contato

- [lucaspeixotorodrigues@gmail.com]
