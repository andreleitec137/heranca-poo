
public class Main {

	public static void main(String[] args) {
		NavioMercante nm = new NavioMercante("Mercante", 30, 10, 200);
		nm.carregamento(80);

		System.out.println();
		
		NaviosDeGuerra ng = new NaviosDeGuerra("Guerra", 100, 90, 50);
		ng.exibirArmas();
	}

}
