import java.util.Scanner;

public class Taller3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 1) {

            System.out.println("                     ,---.           ,---.");
            System.out.println("                    / /\"`.\\.--\"\"\"--./,'\"\\ \\");
            System.out.println("                    \\ \\    _       _    / /");
            System.out.println("                     `./  / _   _ \\  \\,'");
            System.out.println("                      /    /O)(_O\\    \\");
            System.out.println("                      |  .-'  _  `-.  |");
            System.out.println("                   .--|       \\_/       |--.");
            System.out.println("                 ,'    \\   \\   |   /   /    `.");
            System.out.println("                /       `.  `--^--'  ,'       \\");
            System.out.println("             .-\"\"\"\"\"-.    `--._.--'     .-\"\"\"\"\"-.");
            System.out.println(".-----------/         \\------------------/         \\--------------.");
            System.out.println("| .---------\\         /----------------- \\         /------------. |");
            System.out.println("| |                                                             | |");
            System.out.println("| |                1. Salir                                     | |");
            System.out.println("| |                2. Fibonacci                                 | |");
            System.out.println("| |                3. Numero primo                              | |");
            System.out.println("| |                4. Ecuacion cuadratica                       | |");
            System.out.println("| |                5. Promedio de numeros                       | |");
            System.out.println("| |_____________________________________________________________| |");
            System.out.println("|_______________________________________________________________| |");
            System.out.println("                   )__________|__|__________(");
            System.out.println("                  |            ||            |");
            System.out.println("                  |____________||____________|");
            System.out.println("                    ),-----.(      ),-----.(");
            System.out.println("                  ,'   ==.   \\    /  .==    `.");
            System.out.println("                 /            )  (            \\");
            System.out.println("                 `==========='    `===========' ");

            //  AQUÍ LE PIDE LA OPCIÓN
            System.out.print(" Ingrese una opcion: ");

            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR: debes ingresar un numero");
                sc.nextLine();
                opcion = 0;
            }

            if (opcion == 2) {

                //  PEDIR N PARA FIBONACCI
                System.out.print("Ingrese cuantos numeros de Fibonacci desea: ");
                int n = sc.nextInt();

                int d = 0, e = 1, f;

                for (int i = 0; i < n; i++) {
                    System.out.println(d);
                    f = d + e;
                    d = e;
                    e = f;
                }

            } else if (opcion == 3) {

                // PEDIR NUMERO A EVALUAR
                System.out.print("Ingrese un numero: ");
                int n = sc.nextInt();

                int divisores = 0;

                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        divisores++;
                    }
                }

                if (divisores == 2) {
                    System.out.println("El numero " + n + " ES primo");
                } else {
                    System.out.println("El numero " + n + " NO es primo");
                }

            } else if (opcion == 4) {

                double a, b, c, temp, x1, x2;

                System.out.print("Ingrese el valor de a: ");
                a = sc.nextDouble();

                System.out.print("Ingrese el valor de b: ");
                b = sc.nextDouble();

                System.out.print("Ingrese el valor de c: ");
                c = sc.nextDouble();

                temp = b * b - 4 * a * c;
                System.out.println("Discriminante = " + temp);

                if (temp >= 0) {
                    if (2 * a != 0) {
                        x1 = (-b - Math.sqrt(temp)) / (2 * a);
                        x2 = (-b + Math.sqrt(temp)) / (2 * a);

                        System.out.println("Las raices son:");
                        System.out.println("x1: " + x1);
                        System.out.println("x2: " + x2);
                    } else {
                        System.out.println("Error: division por cero");
                    }
                } else {
                    System.out.println("Error: raiz negativa");
                }

            } else if (opcion == 5) {

                //  PEDIR CUANTOS NUMEROS
                System.out.print("¿Cuantos numeros desea ingresar?: ");
                int n = sc.nextInt();

                int cont = 0;
                double num, suma = 0, promedio;

                while (cont < n) {
                    System.out.print("Ingrese el numero: ");
                    num = sc.nextDouble();
                    suma += num;
                    cont++;
                }

                promedio = suma / n;
                System.out.println("El promedio es: " + promedio);

            } else if (opcion != 1) {
                System.out.println("ERROR: opcion invalida");
            }
        }

        sc.close();
    }
}
