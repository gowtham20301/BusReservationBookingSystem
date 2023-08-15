package BusReservationSystem;
import java.util.*;
public class BookingCheck {

    public static void main(String[] args)
    {
        ArrayList<Bus> buses= new ArrayList<Bus>();
        buses.add(new Bus(1,1,true));
        buses.add(new Bus(2,2,false));
        buses.add(new Bus(3,1,true));
        ArrayList<Passengers> pas= new ArrayList<Passengers>();


        Scanner sc= new Scanner(System.in);
        boolean loop= true;
        while(loop) {
            System.out.println("Enter 1: for booking \nEnter 2:for Bus Details \nEnter 3: for exit \nPlease Enter your choice ");
            int choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    Passengers p= new Passengers();
                     if(p.isAvailable(buses,pas))
                     {
                         pas.add(p);
                         System.out.println("Your ticket was confirmed \n");
                     }
                     else {
                         System.out.println("Sorry ,Ticket was full \n");
                     }
                    break;
                }
                case 2:
                {
                    for(Bus bb:buses)
                    {
                        bb.display(bb);
                    }
                    break;
                }
                case 3:
                {
                    loop= false;
                }
            }
        }

      }
}
