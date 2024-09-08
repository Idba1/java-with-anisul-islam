public class DataTypes {
    public static void main(String[] args) {
        int i = 5;
        float f = 10.5f;
        char c = 'q';
        boolean b = true;
        short s = 166;
        long l = 123567;
        System.out.println("char is \t" + c);
        System.out.println("int is \t\t" + i);
        System.out.println("float is \t" + f);
        System.out.println("long is \t" + l);
        System.out.println("short is \t" + s);
        System.out.println("boolean is \t" + b);
        System.out.println("all value is:" + i + c + b + s + l + f);

        // Formate Specifier
        System.out.printf("boolean is %b character is %c\n",b, c);

        String name="Idba Islam";
        int batch =41;
        char Section ='A';
        System.out.printf("My Name is %s. My Section is %d-%c. \n", name, batch, Section);
    }
}
