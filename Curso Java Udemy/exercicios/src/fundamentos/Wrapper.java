package fundamentos;

public class Wrapper {
    public static void main(String[] args) {
        // Wrappers de cada tipo primitivo e alguns exemplos de manipulação

        // byte
        Byte b = 100;
        System.out.println(b.byteValue());

        // short
        Short s = 1000;
        System.out.println(s.toString());

        // int
        Integer i = 10000;
        System.out.println(i * 3);

        // long
        Long l = 100000L;
        System.out.println(l / 3);

        // float
        Float f = 123.10F;
        System.out.println(f);

        // double
        Double d = 1234.5678;
        System.out.println(d);

        // boolean
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        // char
        Character c = '#';
        System.out.println(c + "...");

    }
}
