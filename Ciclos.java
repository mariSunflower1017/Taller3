import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion !=1) {
            
System.out.println("                     ,---.           ,---.");
System.out.println("                    / /\"`.\\.--\"\"\"--./,'\"\\ \\");
System.out.println("                    \\ \\    _       _    / /");
System.out.println("                     `./  / __   __ \\  \\,'");
System.out.println("                      /    /_O)_(_O\\    \\");
System.out.println("                      |  .-'  ___  `-.  |");
System.out.println("                   .--|       \\_/       |--.");
System.out.println("                 ,'    \\   \\   |   /   /    `.");
System.out.println("                /       `.  `--^--'  ,'       \\");
System.out.println("             .-\"\"\"\"\"-.    `--.___.--'     .-\"\"\"\"\"-.");
System.out.println(".-----------/         \\------------------/         \\--------------.");
System.out.println("| .---------\\         /----------------- \\         /------------. |");
System.out.println("| |          `-`--`--'                    `--'--'-'             | |");
System.out.println("| |                                                             | |");
System.out.println("| |                                                             | |");
System.out.println("| |                                                             | |");
System.out.println("| |                1. Salir                                     | |");
System.out.println("| |                2. Suma N-avo numero de fibonacci            | |");
System.out.println("| |                3. N-avo numero primo                        | |");
System.out.println("| |                4. Raíces ecuacion cuadratica                | |");
System.out.println("| |                5. Promedio de N numeros                     | |");
System.out.println("| |                                                             | |");
System.out.println("| |                                                             | |");
System.out.println("| |                                                             | |");
System.out.println("| |                                                             | |");
System.out.println("| |_____________________________________________________________| |");
System.out.println("|_________________________________________________________________|");
System.out.println("                   )__________|__|__________(");
System.out.println("                  |            ||            |");
System.out.println("                  |____________||____________|");
System.out.println("                    ),-----.(      ),-----.(");
System.out.println("                  ,'   ==.   \\    /  .==    `.");
System.out.println("                 /            )  (            \\");
System.out.println("                 `==========='    `===========' ");

            try {
            opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR: debes ingresar un numero");
                sc.nextLine();
                opcion = 0;

            if (opcion == 2) {

                int d = 0, e= 1, f = 0, n = 7;

                do {
                    System.out.println(d);
                    f = d + e;
                    d = e;
                    e = f;
                } while (--n>0);
                
            }

            else if (opcion == 3) {
                
                int divisores = 2, cont = 2, n = 19;

                while (cont < n) {
                    if (n % cont == 0) {
                        divisores++;
                        break;
                    }
                    cont++;
                }
                if (divisores>2) {
                    System.out.println("El numero "+n+" NO es primo");
                }
                else {
                    System.out.println("El numero "+n+" Es primo");
                }
            }

            else if (opcion == 4) {

                double a, b, c, temp, x1, x2;
                System.out.println("Ingrese el valor de a:");
                a = sc.nextDouble();

                System.out.println("Ingrese el valor de b:");
                b = sc.nextDouble();

                System.out.println("Ingrese el valor de c:");
                c = sc.nextDouble();
