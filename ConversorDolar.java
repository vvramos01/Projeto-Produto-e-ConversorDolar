import java.util.Locale;
import java.util.Scanner;
class ConversorDolar {
private static final double IOF = 0.06;
public static double calcularValorEmReais(double cotacao, double valorDolares) {
double valorSemIof = cotacao * valorDolares;
return valorSemIof * (1 + IOF);
}
}
