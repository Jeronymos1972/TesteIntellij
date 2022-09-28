package br.com.dio;

import br.com.dio.model.coelho;

public class ProgramaIntellij {
    public static void main(String[] args) {
        coelho Coelho = new coelho();

        System.out.println(Coelho);

        Livro Livro = new Livro("O problema dos Corpos", 200);
        System.out.println(Livro);




      /*  int a = 5;
        int b = 3;
        System.out.println("Hello Marcelo!" + (a+b));*/

    }
}

    class Livro {
    private String nome;
    private Integer nupaginas;

        public Livro(String nome, Integer nupaginas) {
            this.nome = nome;
            this.nupaginas = nupaginas;
        }

        public String getNome() {
            return nome;
        }



        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNupaginas() {
            return nupaginas;
        }

        public void setNupaginas(Integer nupaginas) {
            this.nupaginas = nupaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", nupaginas=" + nupaginas +
                    '}';
        }
    }

