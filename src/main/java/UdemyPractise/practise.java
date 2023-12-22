package UdemyPractise;

public class practise {
    public static void main(String[] args) {

      int haftaninKacinciGunu = 3;
      switch (haftaninKacinciGunu) {
          case 1:
              System.out.println("monday");
              break;
          case 2:
              System.out.println("tuesday");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4:
              System.out.println("thursday");
              break;
          case 5:
              System.out.println("Friday");
              break;
          default:
              System.out.println("Wrong day");
      }
        System.out.println("get out of switch");
    }
    }