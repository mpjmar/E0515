public class App {
    public static void main(String[] args) throws Exception {
        
		int base = 0;
		int exp = 0;
		boolean correcto = false;

		do {
			try {
				base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
				exp = Integer.parseInt(System.console().readLine("Introduzca el exponente máximo: "));
				correcto = true;
			}
			catch(NumberFormatException e) {
				System.out.println("Sólo se admiten números enteros");
			}
			catch(Exception e) {
				System.out.println("Ha ocurrido un error inesperado"); 
			}
		} while (!correcto);

		int res = 1;
		for (int i = 1; i <= exp; i++) {
			res *= base;
			System.out.printf("%d^%d = %d%n", base, i, res);
		}
    }
}
