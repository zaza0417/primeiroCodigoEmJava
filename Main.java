package com.curso;

import java.util.Locale;

public class Main {
    public static void main(String[] args){

String product1 = "Computer";
String product2 = "Office Dask";

int age = 30;
int code = 52900;
char gender = 'F';

double price1 = 2100.0;
double price2 = 652.50;
double measure = 53.234567;

System.out.printf("Products:%n");
System.out.printf("%s, which price is R$ %.2f%n", product1, price1);
System.out.printf("%s, which price is R$ %.2f%n", product2, price2);

System.out.print("Record: ");
System.out.printf("%d years old,", age);
System.out.printf("code %d and gender %c %n", code, gender);

System.out.printf("Measure with eight decimal places: %.8f%n", measure);
System.out.printf("Rouded (Three decimal places): %.3f%n", measure);
Locale.setDefault(Locale.US);
System.out.printf("Us decimal point: %.3f%n", measure);
;

    }
}