package classe;

public class EqualHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usa1 = new Usuario();
		usa1.nome = "RAfael";
		usa1.email = "@@";
		
		Usuario usa2 = new Usuario();
		usa2.nome = "RAfael";
		usa2.email = "@@";
		
		System.out.println(usa1.nome==usa2.nome);
		System.out.println(usa1.equals(usa2));
		System.out.println(usa1.nome.equals(usa2.nome));

	}

}
