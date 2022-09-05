public class Pessoa {
    private double peso;
    private double altura;

    public Pessoa (){};
    public Pessoa (double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public void setpeso(double peso) {
        this.peso = peso;
    }
    public double getpeso() {
        return peso;
    }

    public void setaltura(double altura){
        this.altura = altura;
    }
    public double getaltura (){
        return altura;
    }

    public double calcularIMC(){
        return this.peso / Math.pow(this.altura, 2);
    }

    public String AvaliaIMC(double IMC){
        if (IMC < 18.5){
            return "Pessoa abaixo do Peso";
        }else if (IMC >= 18.5 && IMC <= 24.9) {
            return "Pessoa com peso Normal";
        }else if (IMC >= 25.0 && IMC <= 29.9){
            return "Pessoa com Pré-Obesidade";
        }else if (IMC >= 30.0 && IMC <= 34.9){
            return "Pessoa com Obesidade Grau 1";
        }else if (IMC >= 35.5 && IMC <= 39.9){
            return "Pessoa com Obesidade Grau 2";
        }else{
            return "Pessoa com Obesidade Grau 3";
        }
    }
    public void informarIMC(){
	    double IMC = calcularIMC();
	    System.out.println("Peso    => " + this.peso);
	    System.out.println("Altura  => " + this.altura);
	    System.out.println("IMC     =  " +  IMC);
	    System.out.println(AvaliaIMC(IMC));
	  }
}

