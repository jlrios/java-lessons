package basic.io.lesson3;

/**
 * Display information about the Java installation on the screen.
 *
 * @author JLRD
 * 23/05/26
 */
public class SystemProperties {
    public static void main(String[] args) {
        System.out.print("Java Installation Info\n");
        System.out.println("------------------------");
        System.out.print("\tJava vendor: ");
        System.out.print(System.getProperty("java.vendor"));
        System.out.print("\n\tJava version: ");
        System.out.print(System.getProperty("java.version"));
        System.out.print("\n\tJava home: ");
        System.out.print(System.getProperty("java.home"));
        System.out.print("\n\tOS: ");
        System.out.print(System.getProperty("os.name"));
        System.out.print("\n\tOS Arch: ");
        System.out.print(System.getProperty("os.arch"));
    }
}
