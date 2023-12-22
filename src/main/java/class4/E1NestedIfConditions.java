package class4;

public class E1NestedIfConditions {
    public static void main(String[] args) {
         boolean isMainDoorOpened=true;
         boolean isRoom1Opened=true;
         boolean isRoom2Opened=true;
         if(isMainDoorOpened){
            if(isRoom1Opened){
                System.out.println("We are in room1");
            }else{
                System.out.println("Room1 is closed");
            }
            if(isRoom2Opened){
                System.out.println("We are in room2");
            }else{
                System.out.println("room2 is closed");
            }

         }else{
             System.out.println("Cant enter the house main door is closed");
         }
    }
}
