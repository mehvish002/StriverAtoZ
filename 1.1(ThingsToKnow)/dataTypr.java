import java.util.Scanner;

public class dataTypr {
    public static int dataTypes(String type) {
        switch (type){
          case "Integer":
          return 4;
          case "Long":
          return 8;
          case "Float":
          return 4;
          case "Double":
          return 8;
          case "Character":
          return 1;         
      }
      return -1;
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(dataTypes(str));
    }
}
