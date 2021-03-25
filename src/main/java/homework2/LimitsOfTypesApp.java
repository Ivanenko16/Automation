package homework2;

import java.util.Scanner;

public class LimitsOfTypesApp {
    public static void main(String[] args) {
        System.out.println("Please enter primitive type");
        Scanner scanType = new Scanner(System.in);
        String primitiveType = scanType.nextLine();
        System.out.println("Please enter min/max");
        Scanner scanValue = new Scanner(System.in);
        String value = scanValue.nextLine();

        switch (primitiveType){
            case "byte":
                if (value.equals("max")) {
                    System.out.println(Byte.MAX_VALUE);
                } else {
                        System.out.println(Byte.MIN_VALUE);
            }
            break;
            case "short":
                if (value.equals("max")) {
                    System.out.println(Short.MAX_VALUE);
                } else {
                        System.out.println(Short.MIN_VALUE);
                }
                break;
            case "char":
                if (value.equals("max")) {
                    System.out.println(Character.MAX_VALUE);
                } else {
                        System.out.println(Character.MIN_VALUE);
                }
                break;
            case "int":
                if (value.equals("max")) {
                    System.out.println(Integer.MAX_VALUE);
                } else {
                        System.out.println(Integer.MIN_VALUE);
                }
                break;
            case "long":
                if (value.equals("max")) {
                    System.out.println(Long.MAX_VALUE);
                } else {
                        System.out.println(Long.MIN_VALUE);
                }
                break;
            case "float":
                if (value.equals("max")) {
                    System.out.println(Float.MAX_VALUE);
                } else {
                        System.out.println(Float.MIN_VALUE);
                }
                break;
            case "double":
                if (value.equals("max")) {
                    System.out.println(Double.MAX_VALUE);
                } else {
                        System.out.println(Double.MIN_VALUE);
                }
                break;
            default:
                System.out.println("Data entered incorrectly. Please use next aliases for primitive types:");
                System.out.println("double");
                System.out.println("int");
                System.out.println("float");
                System.out.println("char");
                System.out.println("short");
                System.out.println("byte");
                System.out.println("long");

        }
    }
}