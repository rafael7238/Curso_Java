package f_lambdas;

@FunctionalInterface //Faz com que não seja permitido criar mais de uma função dentro dessa Interface
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
