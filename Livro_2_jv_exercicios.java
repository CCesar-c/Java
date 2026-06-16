import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Livro_2_jv_exercicios {

  static void SalidaDatos() {

    // System.out.println("Hello world!!");
    // System.out.println("\033[37m sabanas !!");
    // System.out.println("\033[36m cielo !!");
    // System.out.println("\033[35m nazareno !!");
    // System.out.println("\033[34m mar !!");
    // System.out.println("\033[33m mandarina!!");
    // System.out.println("\033[32m hierba !!");
    // System.out.println("\033[31m tomate!!");

    // System.out.println("\u266A Corchea!!");
    // System.out.println("\u266B 2 Corchea!!");

    // System.out.printf("El numero %d no tiene decimales.", 21);
    // System.out.println("\n ");
    // System.out.printf("El numero %f sale con decimales.", 21.0);
    // System.out.println("\n ");
    // System.out.printf("El numero %.3f sale exactamento con 3 decimales.", 21.0);
    // System.out.println("\n ");
    // System.out.printf("La cadena de letras es %s \n", "Asi");

    // System.out.println("ATV");
    // System.out.print("\n");
    // double Num = 4898868.2954;
    // System.out.printf("Hola soy \033[36m%s \n", "Cesar..!!");
    // System.out.print("\n");
    // System.out.printf("\033[30m Vivo en %s \n mi numero es %.4f ", "Brasil,
    // palhoca, Guarda de cubatao", Num);
    // System.out.println("\n\n\n\n\n");
    // System.out.println(" __________________________");
    // System.out.println(" * Ingles - spanish *");
    // System.out.println(" 1. Computer - Computadora");
    // System.out.println(" 2. Student - Estudiante ");
    // System.out.println(" 3. Cat - Gato ");
    // System.out.println(" 4. Dog - Perro ");
    // System.out.println(" 5. Penguin - Pinguino ");
    // System.out.println(" 6. Telephone - Telefono ");
    // System.out.println(" 7. Box - Caja ");
    // System.out.println(" 8. Circle - Circulo ");
    // System.out.println(" 9. Tree - Arbol ");
    // System.out.println(" 10. Black - Negro ");

    // System.out.println("Desde las \033[31m06:00 A.M\033[30m hasta las
    // \033[31m11:00 P.M");

    // System.out.println("\033[30m \n");
    // System.out.println(" * ");
    // System.out.println(" *** ");
    // System.out.println(" ***** ");
    // System.out.println(" ******* ");
    // System.out.println("*********\n");

    // System.out.println(" * ");
    // System.out.println(" * * ");
    // System.out.println(" * * ");
    // System.out.println(" * * ");
    // System.out.println("*********\n");

    // System.out.println("*********");
    // System.out.println(" * * ");
    // System.out.println(" * * ");
    // System.out.println(" * * ");
    // System.out.println(" * \n");

    // System.out.print("\033[30m");
    // System.out.print("\n___________");
    // System.out.print("\n| _______\\");
    // System.out.print("\n| | | \\");
    // System.out.print("\n\033[36m|___|_____|__\\_________");
    // System.out.print("\n| | | |");
    // System.out.print("\n| |_____| |");
    // System.out.print("\n|______________________|");

    // byte a = 'a';
    // byte b = 'b';
    // byte c = 'c';
    // byte d = 'z';

    // System.out.print(" a + b + c + d: " + a + b + c + d);
    // int x = 144, y = 999;

    // System.out.println(x + y);
    // System.out.println(x - y);
    // System.out.println(x * y);
    // System.out.println(x / y);

    // String nombre = "Cesar";
    // String direccion = "Rua servidao Medeiros";
    // long numero = 48988682954l;
    // System.out.println("mi nombre es: " + nombre + "\n Vivo en: " + direccion +
    // "\n y mi numero: " + numero);

    // euros ==> pesetas
    // int euros = 10;
    // double pesetas = 166.386;
    // float resultado = euros * pesetas;
    // System.out.println("resultado de " + resultado);

    // pesetas ==> euros
    // double pesetas = 10.00;
    // float euros = 0.006f;
    // float resultado = pesetas * euros;
    // System.out.println( pesetas * euros );

    // String enunciado = "mi nombre es cesa";
    // char complemento = 'R';
    // System.out.println(enunciado + complemento);

    // char a = 'c';
    // char b = 'e';
    // char c = 's';
    // char d = 'a';
    // char e = 'r';

    // String conjunto = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) +
    // String.valueOf(d) + String.valueOf(e) ;
    // System.out.println(conjunto);
    // Scanner s = new Scanner(System.in);

    // String LeerScanner = s.nextLine();
    // String LeerSistem = System.console().readLine();

    // Scanner s = new Scanner(System.in);

    // System.out.println("Primer numero!!");
    // int primer_num = s.nextInt();

    // System.out.println("Segundo numero!!");
    // int segun_num = s.nextInt();

    // System.out.println("Resultado: " + primer_num * segun_num);

    // Scanner scan = new Scanner(System.in);

    // System.out.println("Cantidad de Euros...");
    // int euros_num = scan.nextInt();
    // System.out.println("Cantidad de Pesetas...\n" + euros_num * 166.386);

    // Scanner scan = new Scanner(System.in);

    // System.out.println("Cantidad de pesetas...");
    // int pesetas_num = scan.nextInt();
    // System.out.println("Cantidad de Euros...\n" + pesetas_num * 0.006f);

    // Scanner scan = new Scanner(System.in);

    // System.out.println("Primer numero...");
    // int primer_num = scan.nextInt();

    // System.out.println("Segundo numero...");
    // int segundo_num = scan.nextInt();
    // System.out.println("Suma:\n+" + (primer_num + segundo_num));
    // System.out.println("Resta:\n-" + (primer_num - segundo_num));
    // System.out.println("Multiplicacion:\nX" + (primer_num * segundo_num));
    // System.out.println("Division:\n/" + (primer_num / segundo_num));

    // Scanner scan = new Scanner(System.in);

    // System.out.println("Primer numero...");
    // int base = scan.nextInt();

    // System.out.println("Segundo numero...");
    // int altura = scan.nextInt();

    // System.out.println("La area del rectangulo es:" + (base * altura));

    // Scanner scan = new Scanner(System.in);

    // System.out.println("Primer numero...");
    // int base = scan.nextInt();

    // System.out.println("Segundo numero...");
    // int altura = scan.nextInt();

    // System.out.println("La area del rectangulo es:" + (base * altura) / 2);

    // Scanner scan = new Scanner(System.in);

    // System.out.println("Valor normal...");
    // float Valor_normal = scan.nextFloat();

    // float imponible = Valor_normal * 1.21f;

    // System.out.println("Resultado... " + (imponible));

    // Scanner scan = new Scanner(System.in);

    // System.out.println("Horas trabajadas...");
    // int hrsTrabajadas = scan.nextInt();

    // System.out.println("Segundo numero..." + (12 * hrsTrabajadas));

    // Scanner scan = new Scanner(System.in);

    // System.out.println("Radio...");
    // int radio = scan.nextInt();
    // System.out.println("height...");
    // int height = scan.nextInt();
    // System.out.println("El volumen del cono:\n" + (Math.PI * (radio * radio) *
    // height )/ 3);

    // Scanner scan = new Scanner(System.in);

    // System.out.println("MB...");
    // int mb = scan.nextInt();
    // System.out.println("mb en kb..." + ( mb * 1000) + "kb");

    // Scanner scan = new Scanner(System.in);

    // System.out.println("KB...");
    // int kb = scan.nextInt();
    // System.out.println("kb en mb..." + ( kb / 1000) + "mb");

    // Scanner scan = new Scanner(System.in);

    // System.out.println("Primer examen...");
    // int nota1 = scan.nextInt();
    // System.out.println("¿Qué nota quieres sacar en el trimestre?");
    // int nota2 = scan.nextInt();
    // float ciemp = (nota2 - (nota1 * 0.40f) / 0.60f);
    // System.out.println("resultado" + ciemp);

    // String dia_semana = System.console().readLine();
    // switch(dia_semana){
    // case "lunes":
    // System.out.println("gestão da qualidade ");
    // break;
    // case "martes":
    // System.out.println("Edu cacion fisica ");
    // break;
    // case "miercoles":
    // System.out.println("Artes ");
    // break;
    // case "jueves":
    // System.out.println("Portuges ");
    // break;
    // case "viernes":
    // System.out.println("Matematica");
    // break;
    // default:
    // System.out.println("Nao e um dia da semana");
    // break;
    // }
    // Scanner scan = new Scanner(System.in );
    // int hrs = scan.nextInt();
    // if(hrs >= 6 && hrs <= 12){
    // System.out.println ("Buenos dias");
    // }else if(hrs >= 13 && hrs <= 20){
    // System.out.println("Buenas tardes");
    // }else if(hrs >= 21 && hrs <= 5){
    // System.out.println("Buenos noches");
    // }else{
    // System.out.println("horario errado")
    // }
    // Scanner scan = new Scanner(System.in );
    // System.out.println("pon algun numero");
    // int dia_semana = scan.nextInt();
    // switch(dia_semana){
    // case 1:
    // System.out.println("lunes");
    // break;
    // case 2:
    // System.out.println("martes");
    // break;
    // case 3:
    // System.out.println("miercoles ");
    // break;
    // case 4:
    // System.out.println("jueves");
    // break;
    // case 5:
    // System.out.println("viernes");
    // break;
    // case 6:
    // System.out.println("Sábado");
    // break;
    // case 7:
    // System.out.println("Domingos");
    // break;
    // default:
    // System.out.println("Coño");
    // break;
    // }
    // Scanner scan = new Scanner(System.in );
    // System.out.println("pon algun tus horas trabajadas");
    // int hrsTrabajadas = scan.nextInt();
    // if(hrsTrabajadas >= 41){
    // int horasExtras = hrsTrabajadas - 40;
    // System.out.println("Tu salário con horas extra: " + (horasExtras * 16 + 40 *
    // 12));
    // }else{
    // System.out.println("Tu salario es de: " +(hrsTrabajadas * 12));
    // }

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Usando la formula ax + b = 0");
    // System.out.println("di el numer 'A' ");
    // float a = scan.nextFloat();

    // System.out.println("di el numer 'B' ");
    // float b = scan.nextFloat();

    // float resposta = 0 - b;
    // float respostaFinal = resposta / a;

    // System.out.println("entoces: \nx = " + (respostaFinal));

    // Scanner scanner = new Scanner(System.in);

    // System.out.println("La altura del objeto");
    // float height = scanner.nextFloat();
    // float res = height / 9.81f;

    // System.out.println("Respuesta:\n" + (Math.sqrt(res)));

    // Scanner scan = new Scanner(System.in );
    // System.out.println("primeiro numero??");
    // int nt1 = scan.nextInt();
    // System.out.println("Segundo numero??");
    // int nt2 = scan.nextInt();
    // System.out.println("tercer numero??");
    // int nt3 = scan.nextInt();

    // int resultado = (nt1 + nt2 + nt3) / 3;
    // System.out.println(resultado);

    // if ( resultado > 0 && resultado <= 2 ) {
    // System.out.println("Nota insuficiente:\n" + resultado);
    // }else if ( resultado > 2 && resultado <= 4 ) {
    // System.out.println("Nota suficiente:\n" + resultado);
    // }else if ( resultado > 4 && resultado <= 6 ) {
    // System.out.println("Nota bien:\n" + resultado);
    // }else if ( resultado > 6 && resultado <= 8 ) {
    // System.out.println("Nota notable:\n" + resultado);
    // }else if ( resultado > 8 && resultado <= 10 ) {
    // System.out.println("Nota sobresaliente:\n" + resultado);
    // }else{
    // System.out.println("Nota Invalida:\n" + resultado);
    // }

    // System.out.println("Usando la formula ax² + bx + c = 0 ");

    // System.out.println("a = ? ");
    // int a = Integer.parseInt(System.console().readLine());

    // System.out.println("b = ? ");
    // int b = Integer.parseInt(System.console().readLine());

    // System.out.println("c = ? ");
    // int c = Integer.parseInt(System.console().readLine());

    // double Calculo_1 = (b * b) - 4f * a * c;
    // double Calculo_2 = Math.sqrt(Calculo_1);
    // double CalculoMas = (-b + Calculo_2) / 2;
    // double CalculoMenos = (-b - Calculo_2) / 2;
    // System.out.println("Resultado x¹: " + CalculoMas);
    // System.out.println("Resultado x²: " + CalculoMenos);

    // int dia = Integer.parseInt(System.console().readLine());
    // int mes = Integer.parseInt(System.console().readLine());

    // if (dia == 30 && mes == 3) {
    // System.out.println("seras el mejor programador con Practica.\nque tu creias
    // que la vida es un morango");
    // }

    // int hrs = Integer.parseInt(System.console().readLine());
    // int min = Integer.parseInt(System.console().readLine());

    // int media_noche_hrs = 23;
    // int media_noche_min = 60;

    // final String resultado = "Faltan " + (media_noche_hrs - hrs) + " Horas " +
    // ((media_noche_min - min) == 0 ? "":"y " +(media_noche_min - min) );
    // System.out.println(resultado);

    // int resposta, pts = 0;
    // System.out.println(" 1 + 1");
    // resposta = Integer.parseInt(System.console().readLine());

    // if (resposta == 2) {
    // System.out.println(" certo");
    // pts++;

    // } else {
    // System.out.println(" errado");
    // }

    // System.out.println(" 1 + 2");
    // resposta = Integer.parseInt(System.console().readLine());
    // if (resposta == 3) {
    // System.out.println(" certo");
    // pts++;
    // } else {
    // System.out.println(" errado");
    // }

    // System.out.println(" 1 + 3");
    // resposta = Integer.parseInt(System.console().readLine());
    // if (resposta == 4) {
    // System.out.println(" certo");
    // pts++;
    // } else {
    // System.out.println(" errado");
    // }

    // System.out.println(" 1 + 4");
    // resposta = Integer.parseInt(System.console().readLine());
    // if (resposta == 5) {
    // System.out.println(" certo");
    // pts++;
    // } else {
    // System.out.println(" errado");
    // }

    // System.out.println(" 1 + 5");
    // resposta = Integer.parseInt(System.console().readLine());
    // if (resposta == 6) {
    // System.out.println(" certo");
    // pts++;
    // } else {
    // System.out.println(" errado");
    // }

    // System.out.println(" 1 + 6");
    // resposta = Integer.parseInt(System.console().readLine());
    // if (resposta == 7) {
    // System.out.println(" certo");
    // pts++;
    // } else {
    // System.out.println(" errado");
    // }

    // System.out.println(" 1 + 7");
    // resposta = Integer.parseInt(System.console().readLine());
    // if (resposta == 8) {
    // System.out.println(" certo");
    // pts++;
    // } else {
    // System.out.println(" errado");
    // }
    // System.out.println(" 1 + 8");
    // resposta = Integer.parseInt(System.console().readLine());
    // if (resposta == 9) {
    // System.out.println(" certo");
    // pts++;
    // } else {
    // System.out.println(" errado");
    // }
    // System.out.println(" 1 + 9");
    // resposta = Integer.parseInt(System.console().readLine());
    // if (resposta == 10) {
    // System.out.println(" certo");
    // pts++;
    // } else {
    // System.out.println(" errado");
    // }
    // System.out.println(" 1 + 10");
    // resposta = Integer.parseInt(System.console().readLine());
    // if (resposta == 11) {
    // System.out.println(" certo");
    // pts++;
    // } else {
    // System.out.println(" errado");
    // }
    // System.out.println("Resultado: " + pts + "pts");

    // Scanner scanner = new Scanner(System.in);

    // int Primer_num = scanner.nextInt();
    // int Segundo_num = scanner.nextInt();
    // int Tercer_num = scanner.nextInt();
    // String res = new String();

    // if (Primer_num > Segundo_num && Segundo_num > Tercer_num) {
    // res = String.valueOf(Primer_num) + "-" + String.valueOf(Segundo_num) + "-" +
    // String.valueOf(Tercer_num);
    // } else if (Primer_num > Tercer_num && Tercer_num > Segundo_num) {
    // res = String.valueOf(Primer_num) + "-" + String.valueOf(Tercer_num) + "-" +
    // String.valueOf(Segundo_num);
    // }

    // else if (Segundo_num > Tercer_num && Tercer_num > Primer_num) {
    // res = String.valueOf(Segundo_num) + "-" + String.valueOf(Tercer_num) + "-" +
    // String.valueOf(Primer_num);
    // } else if (Segundo_num > Primer_num && Primer_num > Tercer_num) {
    // res = String.valueOf(Segundo_num) + "-" + String.valueOf(Primer_num) + "-" +
    // String.valueOf(Tercer_num);
    // }

    // else if (Tercer_num > Primer_num && Primer_num > Segundo_num) {
    // res = String.valueOf(Tercer_num) + "-" + String.valueOf(Primer_num) + "-" +
    // String.valueOf(Segundo_num);
    // } else if (Tercer_num > Segundo_num && Segundo_num > Primer_num) {
    // res = String.valueOf(Tercer_num) + "-" + String.valueOf(Segundo_num) + "-" +
    // String.valueOf(Primer_num);
    // } else {
    // res = "espera";
    // }
    // System.out.println("la oden es\n" + res);

    // final float num = Integer.parseInt(System.console().readLine());
    // if (num % 5 == 0) {
    // System.out.println("Par: " + num);
    // } else {
    // System.out.println("\033[31mImpar: "+ num);
    // }

    // Scanner scanner = new Scanner(System.in);
    // System.out.println("opcion (*, 1, c o x) ");
    // String option = scanner.nextLine();

    // System.out.println("Orientacion (arriba || abajo) ");
    // String orinetacion = scanner.nextLine();

    // // En java == sirve para hacer comparaciones Pero los
    // // Strings pero en el operador == no compara
    // // el contenido de las palabras, sino que mira si están guardadas
    // // en el mismo lugar de la memoria.

    // System.out.println(orinetacion.equals("arriba") ? "igual":"no es igual");
    // System.out.println(orinetacion);

    // switch (option) {
    // case "*":
    // if (orinetacion.equals("arriba")) {
    // System.out.println(" * ");
    // System.out.println(" *** ");
    // System.out.println("*****");
    // } else {
    // System.out.println("*****");
    // System.out.println(" *** ");
    // System.out.println(" * ");
    // }
    // break;
    // case "1":
    // if (orinetacion.equals("arriba")) {
    // System.out.println(" 1 ");
    // System.out.println(" 111 ");
    // System.out.println("11111");
    // } else {
    // System.out.println("11111");
    // System.out.println(" 111 ");
    // System.out.println(" 1 ");
    // }
    // break;

    // case "c":
    // if (orinetacion.equals("arriba")) {
    // System.out.println(" c ");
    // System.out.println(" ccc ");
    // System.out.println("ccccc");
    // } else {
    // System.out.println("ccccc");
    // System.out.println(" ccc ");
    // System.out.println(" c ");
    // }
    // break;
    // case "x":
    // if (orinetacion.equals("arriba")) {
    // System.out.println(" x ");
    // System.out.println(" xxx ");
    // System.out.println("xxxxx");
    // } else {
    // System.out.println("xxxxx");
    // System.out.println(" xxx ");
    // System.out.println(" x ");
    // }
    // break;

    // default:
    // System.out.println("no definido");
    // break;

    // }
    // scanner.close(); // para liberar memoria..!! importante

    // int pts = 0;
    // boolean respuestas;

    // System.out.println("Tu pareja esta inquieta");
    // respuestas = Boolean.parseBoolean(System.console().readLine());
    // if (respuestas) {
    // pts += 3;
    // }
    // System.out.println("Tu pareja Sale mucho");
    // respuestas = Boolean.parseBoolean(System.console().readLine());
    // if (respuestas) {
    // pts += 3;
    // }
    // System.out.println("Tu pareja se afeita para salir");
    // respuestas = Boolean.parseBoolean(System.console().readLine());
    // if (respuestas) {
    // pts += 3;
    // }
    // System.out.println("Tu pareja se arragla el pelo para salir");
    // respuestas = Boolean.parseBoolean(System.console().readLine());
    // if (respuestas) {
    // pts += 3;
    // }
    // System.out.println("Tu pareja se preocupa en tener su linea");
    // respuestas = Boolean.parseBoolean(System.console().readLine());
    // if (respuestas) {
    // pts += 3;
    // }
    // System.out.println("Se echa mucho perfume para salir");
    // respuestas = Boolean.parseBoolean(System.console().readLine());
    // if (respuestas) {
    // pts += 3;
    // }
    // System.out.println("Gasta mucho en vesturario");
    // respuestas = Boolean.parseBoolean(System.console().readLine());
    // if (respuestas) {
    // pts += 3;
    // }
    // System.out.println("a perdido el interes en ti??");
    // respuestas = Boolean.parseBoolean(System.console().readLine());
    // if (respuestas) {
    // pts += 3;
    // }
    // System.out.println("Da direcciones erradas de donde es ??");
    // respuestas = Boolean.parseBoolean(System.console().readLine());
    // if (respuestas) {
    // pts += 3;
    // }
    // System.out.println("no suelta el celular");
    // respuestas = Boolean.parseBoolean(System.console().readLine());
    // if (respuestas) {
    // pts += 3;
    // }
    // if (pts <= 10 ) {
    // System.out.println("Es fiel");
    // }else if (pts >= 11 && pts <= 22 ) {
    // System.out.println("Ta raro");
    // }else if (pts >= 23 ) {
    // System.out.println("Ya valio");
    // }

    // String numero = System.console().readLine();
    // String[] ultimoNum = numero.split("");
    // System.out.println("El ultimo digito es: " + ultimoNum[ultimoNum.length -
    // 1]);

    // String numero = System.console().readLine();
    // String[] primerNum = numero.split("");
    // System.out.println("El ultimo digito es: " + primerNum[0]);

    // String numero = System.console().readLine();
    // String[] tamano = numero.split("");
    // System.out.println("El ultimo digito es: " + tamano.length);

    // String numero = System.console().readLine();
    // String[] capicuaNum = numero.split("");
    // String[] capicuaNumAsereversido = numero.split("");
    // Collections.reverse(Arrays.asList(capicuaNumAsereversido));

    // String juntoDerecho = String.join("", capicuaNum);
    // String juntoAlreves = String.join("", capicuaNumAsereversido);

    // System.out.println(juntoDerecho);
    // System.out.println(juntoAlreves);
    // if (juntoDerecho.equals(juntoAlreves)) {
    // System.out.println("es un capicua");

    // } else {
    // System.out.println("Numero normal");

    // }

    // Scanner scanner = new Scanner(System.in);
    // float primer_control = scanner.nextFloat();
    // float segundo_control = scanner.nextFloat();
    // float resultado = (primer_control + segundo_control) / 2;

    // if (resultado <= 5f) {
    // System.out.println("Cual fue tu resultado en la recuperacion? (apto/no
    // apto)");
    // String res = System.console().readLine();
    // if (res.equalsIgnoreCase("apto")) {
    // System.out.println("Tu nota es 5 em programacion");

    // } else {
    // System.out.printf("Tu nota es %.2f em programacion", resultado);
    // }
    // } else {
    // System.out.printf("\nTu nota es %.2f em programacion\n", resultado);
    // }
    // scanner.close();

    // Scanner scanner = new Scanner(System.in);

    // System.out.println("Que dia de la semana estas ??");
    // final String dia_semana = scanner.nextLine();

    // System.out.println("Que horas son ??");
    // final int hr_semana = scanner.nextInt();

    // System.out.println("Que minutos son ??");
    // final int min_semana = scanner.nextInt();

    // switch (dia_semana) {
    // case "lunes":
    // System.out.println("Te faltan 4 dias, " + (hr_semana - 15) + " hr y " +
    // (min_semana - 60) + " m ");
    // break;
    // case "martes":
    // System.out.println("Te faltan 3 dias, " + (hr_semana - 15) + " hr y " +
    // (min_semana - 60) + " m ");

    // break;
    // case "miercoles":
    // System.out.println("Te faltan 2 dias, " + (hr_semana - 15) + " hr y " +
    // (min_semana - 60) + " m ");

    // break;
    // case "jueves":

    // System.out.println("Te faltan 1 dias, " + (hr_semana - 15) + " hr y " +
    // (min_semana - 60) + " m ");
    // break;
    // case "viernes":
    // System.out.println("Te faltan " + (hr_semana - 15) + " hr y " + (min_semana -
    // 60) + " m ");
    // break;
    // default:
    // System.out.println("Valor invalido");
    // break;
    // }

    // scanner.close();

    // float iva = 0;
    // float promo = 0;
    // float res = 0;

    // System.out.println("base inponible ");
    // final float base = Float.parseFloat(System.console().readLine());

    // System.out.println("introduzca el I.V.A ");
    // final String ivaTipo = System.console().readLine();

    // System.out.println("introduzca el codigo promocional");
    // final String promoTipo = System.console().readLine();

    // switch (ivaTipo) {
    // case "general":
    // iva = 0.21f;
    // break;
    // case "reducido":
    // iva = 0.10f;

    // break;
    // case "superreducido":
    // iva = 0.04f;

    // break;

    // default:
    // System.out.println("Iva invalido");
    // break;
    // }
    // switch (promoTipo) {
    // case "no_promo":
    // promo = 0f;
    // break;
    // case "mitad":
    // promo = 0.50f;

    // break;
    // case "meno5":
    // promo = 5f; // hay qu restarlo no se te olvide

    // break;
    // case "5porc":
    // promo = 0.05f;

    // break;

    // default:
    // System.out.println("Valor invalido");
    // break;
    // }

    // res = base * (iva + 1.00f);
    // System.out.println("La base imponible: " + base);
    // System.out.println("Iva (" + iva * 100 + "%): " + (base * iva));
    // System.out.println("Precio con Iva (" + iva * 100 + "%): " + base * (iva +
    // 1.00));
    // System.out.println("cod. promo. (" + promoTipo + "): "
    // + (promoTipo.equalsIgnoreCase("meno5") == true ? "5" : res * promo));
    // // solo si se puso meno5 cuenta normal
    // System.out.println("Total: " + (promoTipo.equalsIgnoreCase("meno5") == true ?
    // res - promo : res * promo));

    // int salario = 0;
    // double extraPorViaje = 0;
    // double Irfa = 0;

    // System.out.println("1 - Programador junior\n" +
    // "2 - Prog. senior\n" +
    // "3 - Jefe de proyecto");
    // System.out.println("Que cargo tienes ??");
    // int cargoInt = Integer.parseInt(System.console().readLine());
    // System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
    // int diasViajados = Integer.parseInt(System.console().readLine());
    // System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado)");
    // int estadoCivil = Integer.parseInt(System.console().readLine());

    // switch (cargoInt) {
    // case 1:
    // salario = 950;
    // break;

    // case 2:
    // salario = 1200;
    // break;

    // case 3:
    // salario = 1600;
    // break;

    // default:
    // salario = 0;
    // break;
    // }

    // switch (estadoCivil) {
    // case 1:
    // Irfa = 0.25d; // soltero
    // break;
    // case 2:
    // Irfa = 0.20d; // casado
    // break;

    // default:
    // Irfa = 0; // error
    // break;
    // }

    // System.out.println("=========================");
    // System.out.println("| sueldo base: " + (salario));
    // System.out.println("| Dieta(viajes): " + (diasViajados * 30));
    // System.out.println("|-----------------------|");
    // System.out.println("| Sueldo bruto: "+ (salario + (diasViajados * 30)));
    // int salario_bruto = salario + diasViajados * 30;
    // System.out.println("| IRPF : " + (salario_bruto * Irfa ));
    // System.out.println("|-----------------------|");
    // System.out.println("| Sueldo bruto: " + (salario_bruto -( salario_bruto *
    // Irfa ) ));
    // System.out.println("=========================");

    // float total = 0;
    // System.out.println("Altura de la bandera??");
    // int height = Integer.parseInt(System.console().readLine());

    // System.out.println("ancho de la bandera??");
    // int width = Integer.parseInt(System.console().readLine());

    // float tamano = height * width;
    // System.out.println("tamanho: " + tamano);
    // total = tamano / 100;
    // System.out.println("rs: " + total);
    // total += 3.25f;
    // System.out.println("con envio: " + total);

    // System.out.println("con escudo??");
    // String resposta = System.console().readLine();
    // if (resposta.equals("s")) {
    // total += 2.50f;
    // System.out.println("Bandera: " + tamano + " en euros: " + tamano / 100);
    // System.out.println("con escudo: " + 2.50f);
    // System.out.println("envio: " + 3.25f);
    // System.out.println("total: " + total);
    // } else if (resposta.equals("n")) {
    // System.out.println("Bandera: " + tamano + " en euros: " + tamano / 100);
    // System.out.println("sin escudo: " + 0);
    // System.out.println("envio: " + 3.25f);
    // System.out.println("total: " + total);
    // } else {
    // total = 0f;
    // }

    System.out.println("Venta de entradas CineCampa");
    System.out.println("Numero de entradas..??");
    int num_entradas = Integer.parseInt(System.console().readLine());
    System.out.println("Dia de la semana..??");
    String dia_semana = System.console().readLine();
    System.out.println("Tienes tarjeta de cineCampa..??");
    String Tienes_tarjeta = System.console().readLine();
    // Calculo

    System.out.println("numero de entradas: " + num_entradas);
    switch (dia_semana) {
      case "miercoles":
        break;
      case "jueves":
        break;
      default:
        System.out.println("total : " + (num_entradas * 8.00));
        System.out.println("descuento: " + (Tienes_tarjeta.equalsIgnoreCase("s") ? (num_entradas * 8.00 * 0.10) : 0));
        System.out.println(
            "A pagar: " + (Tienes_tarjeta.equalsIgnoreCase("s") ? (num_entradas * 8.00) - (num_entradas * 8.00 * 0.10)
                : (num_entradas * 8.00)));
        break;
    }

  }

  public static void main(String[] args) {
    SalidaDatos();
  }
}
