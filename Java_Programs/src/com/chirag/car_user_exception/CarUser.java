package com.chirag.car_user_exception;

class CarStoppedException extends Exception 
{
    public CarStoppedException(String message) 
    {
        super(message);
    }
}

class CarPunctureException extends Exception 
{
    public CarPunctureException(String message) 
    {
        super(message);
    }
}

class CarHeatException extends Exception 
{
    public CarHeatException(String message) 
    {
        super(message);
    }
}

class CarTest 
{

    public static void stop(String message) throws CarStoppedException 
    {
        if (message.equalsIgnoreCase("stop"))
            throw new CarStoppedException("Car stopped for some reason.");
        else
            IO.println("Car not stalled.");
    }

    public static void puncture(String message) throws CarPunctureException 
    {
        if (message.equalsIgnoreCase("puncture"))
            throw new CarPunctureException("Car is punctured.");
        else
            IO.println("Car not punctured.");
    }

    public static void carHeat(int temp) throws CarHeatException 
    {
        if (temp > 50)
            throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
        else
            IO.println("Car temperature normal.");
    }
}

public class CarUser 
{

    public static void main(String[] args) 
    {

        IO.println("PROBLEM MENU");
        IO.println("For Car Stopped  -> stop");
        IO.println("For Car Puncture -> puncture");
        IO.println("For Car Overheating -> enter temperature");

        
        try 
        {
            String stopInput = IO.readln("Enter car status: ");
            CarTest.stop(stopInput);
        } 
        catch (CarStoppedException e) 
        {
            IO.println(e.getMessage());
        }

        
        try 
        {
            String punctureInput = IO.readln("Enter puncture status: ");
            CarTest.puncture(punctureInput);
        } 
        catch (CarPunctureException e)
        {
            IO.println(e.getMessage());
        }

        
        try 
        {
            int temp = Integer.parseInt(IO.readln("Enter car temperature: "));
            CarTest.carHeat(temp);
        } 
        catch (CarHeatException e)
        {
            IO.println(e.getMessage());
        }
    }
}
