
//* IMD0040 - Linguagem de Programação II - 2022.1 Aula03 - Prática

public class CalculaIMC {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa();

      try {
        p.setaltura(1.8);
        p.setpeso(81.5);
        p.informarIMC();
      } finally {

      }
    }
}
