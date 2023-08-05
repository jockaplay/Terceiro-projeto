import com.Ponto;
import com.Reta;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Ponto> p1 = new ArrayList<Ponto>();
    static ArrayList<Reta> r1 = new ArrayList<Reta>();
    public static void main (String[] args) {

        boolean loop = true;
        Main x = new Main();
        Scanner scan = new Scanner(System.in);

        while (loop) {
            System.out.print("1. Criar pontos\n2. Mostrar todos os pontos\n3. Criar reta\n4. Mostrar retas criadas\n5. Ver o tamanho de uma reta\n0. Sair\n\nEscolha: ");
            int a = scan.nextInt();
            switch (a){
                case 1:
                    System.out.println("Quantos pontos deseja criar?");
                    x.addPoints(scan.nextInt());
                    break;
                case 2:
                    System.out.println("\nPontos:");
                    x.showPoints();
                    System.out.println();
                    break;
                case 3:
                    try {
                        System.out.print("Ponto 1: ");
                        Ponto ponto_1 = p1.get(scan.nextInt());
                        System.out.print("Ponto 2: ");
                        Ponto ponto_2 = p1.get(scan.nextInt());
                        x.makeStraight(ponto_1, ponto_2);
                        break;
                    } catch (Exception e) {
                        System.err.println("Ponto inválido!");
                        break;
                    }
                case 4:
                    System.out.println("\nRetas:");
                    x.showStraights();
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("\nReta: ");
                    x.lengthStraight(r1.get(scan.nextInt()));
                    System.out.println("");
                    break;
                default:
                    loop = false;
                    break;
            }
        }
    }
    
    // Criação e um ponto
    public void makePoint () {
        float x;
        float y;
        Scanner scan = new Scanner(System.in);
        System.out.print("x: ");
        x = scan.nextFloat();
        System.out.print("y: ");
        y = scan.nextFloat();
        p1.add(p1.size(), new Ponto(x, y));
    }

    // Fazer quantos pontos quiser
    public void addPoints (int x) {
        for (int i = 0; i < x; i++){
            System.out.println("Criando o ponto: " + (i + 1));
            makePoint();
        }
    }

    // Mostrar pontos criados por ordem de criação
    public void showPoints() {
        for (int i = 0; i < p1.size(); i++){
            System.out.println(i + " - " + p1.get(i).getPoint());
        }
    }

    // Criação de uma reta
    public void makeStraight(Ponto p1, Ponto p2) {
        Reta r = new Reta(p1, p2);
        r1.add(r1.size(), r);
    }

    // Mostrar retas criadas por ordem de criação
    public void showStraights() {
        for (int i = 0; i < r1.size(); i++){
            System.out.println(i + " - " + r1.get(i).getStraight());
        }
    }

    // Mostra o tamanho da reta
    public void lengthStraight(Reta r) {
        System.out.println(r.getLength());
    }
}