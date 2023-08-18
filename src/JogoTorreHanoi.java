import java.util.InputMismatchException;
import java.util.Scanner;

public class JogoTorreHanoi {
    private int qtDiscos;

    Scanner rc;

    public void lerDados() {
        System.out.println("Digite a quantidade de discos: ");
        rc = new Scanner(System.in);
        try {
            qtDiscos = rc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Amigão! É fácil! Digite o número de discos por favor!");
            lerDados();
        }
    }

    public void hanoi(int n, String origem, String destino, String auxiliar) {
        if (n == 1) {
            System.out.println("Mova o disco 1 de " + origem + " para " + destino);
            return;
        }

        hanoi(n - 1, origem, auxiliar, destino);
        System.out.println("Mova o disco " + n + " de " + origem + " para " + destino);
        hanoi(n - 1, auxiliar, destino, origem);
    }

    public static void main(String[] args) {
        JogoTorreHanoi h = new JogoTorreHanoi();
        h.lerDados();

        // Chamada da função hanoi para resolver o problema
        h.hanoi(h.qtDiscos, "A", "B", "C");
    }
}
