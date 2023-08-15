package BusReservationSystem;

import java.util.ArrayList;
import java.util.Date;

public class Bus {
private int busNo;
private int capacity;  //total seats in bus
private boolean ac;

Bus(int bn,int c,boolean a)
{
    busNo=bn;
    capacity=c;
    ac=a;
}
public int getBusNo()
{
    return busNo;
}
public void setBusNo(int a)
{
    busNo=a;
}
public int getCapacity()
{
    return capacity;
}
public void setCapacity(int a)
{
    busNo=a;
}
public boolean getAc()
{
    return ac;
}
public void setAc(boolean a)
{
    ac=a;
}

public void display(Bus b)
{
    System.out.println("BusNo : " + b.busNo +", Bus capacity : " + b.capacity + ",  AC :" +b.ac );
}
}
