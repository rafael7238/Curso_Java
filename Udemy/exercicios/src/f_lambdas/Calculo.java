package f_lambdas;

@FunctionalInterface //Faz com que n�o seja permitido criar mais de uma fun��o dentro dessa Interface
public interface Calculo {
	
public abstract double executar(double a, double b);
//public abstract double executar2(double a, double b);

default String legal() {
	return "legal";
}

static String muitoLegal() {
	return "Muito Legal";
}

}
