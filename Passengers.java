package BusReservationSystem;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Passengers {
String name;
int busNo;
Date date;
Passengers() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name :");
    name = sc.next();
    System.out.println("Enter the bus number ");
    busNo = sc.nextInt();
    System.out.println("Enter the Date in this format dd-mm-yyyy:");
    String dateInput = sc.next();
    SimpleDateFormat simp = new SimpleDateFormat("dd-MM-yyyy");
    try {
        date = simp.parse(dateInput);
    } catch (ParseException e) {
        throw new RuntimeException(e);
    }
}
public boolean isAvailable(ArrayList<Bus> b,ArrayList<Passengers> pp)
{
    int busCapacity=0;
    for(Bus bb:b)
    {
        if(bb.getBusNo()==busNo)
        {
            busCapacity=bb.getCapacity();
            break;
        }
    }
    //find how many bookings happen in that bus
    int booked=0;
    for(Passengers p:pp)
    {
        if(p.busNo==busNo && p.date.equals(date))
        {
            booked++;
        }
    }
    return busCapacity > booked?true:false;

}

}
