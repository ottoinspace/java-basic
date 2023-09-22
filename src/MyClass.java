public class MyClass {
    public static void main(String[] args) {
      System.out.println("Hello people, welcome to my world!");

      int year = 2021;
      year = 2023;

      final String br = "Brazil";
      // you can't change final value so with you try to change br the program cannot run it


      // declared variable and methods
      String myName = "Otto";

      int fabricationYear = 2023;

      boolean yesNo = true;

      fabricationYear = 2029;

      String fistName = "Otto";
      String secondName = "Pine";

      String completeName = completeName(fistName, secondName);

      System.out.println(completeName);
    }

    public static String completeName(String fistName, String secondName) {
        return fistName.concat(" ").concat(secondName);
    }
}
