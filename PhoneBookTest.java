package jc;

import java.util.* ;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Entry
{
  private String name;
  private String number;

  // constructor
  Entry( String n, String num )
  {
    name = n; number = num;
  }

  // methods
  public String getName()
  {
    return name ;
  }

  public String getNumber()
  {
    return number ;
  }
   
  //overrides equals from Object class so it must have the same signature
  @Override
  public boolean equals( Object other )
  {
   
    System.out.print  ("    Compare " + other + " To " + this );
    System.out.println(" Result: " +  name.equals( ((Entry)other).name ) );
    return this.getName().equals( ((Entry)other).getName() );
  }

  @Override
  public String toString()
  {
    return "Name: " + getName() + "; Number: " + getNumber() ;
  }
 
}

public class PhoneBookTest
{
  public static void main ( String[] args)
  {
    ArrayList<Entry> phone = new ArrayList<Entry>();

    phone.add( new Entry( "Amy", "123-4567") );
    phone.add( null ); // this position is not ok to have a null if perform the search
    phone.add( new Entry( "Bob", "123-6780") );
    phone.add( new Entry( "Hal", "789-1234") );
    phone.add( new Entry( "Deb", "789-4457") );
    phone.add( null ); // this position is ok to have a null
    phone.add( new Entry( "Zoe", "446-0210") );

    // Look for Hal in phone. The indexOf() method uses the
    // equals(Object) method of each object in the list.
    // 

    
    
    System.out.println("Begin Search" ); 
    Entry target = new Entry( "Hal", null );
    
    int spot = phone.indexOf( target ) ;
    System.out.println("End Search" );

    System.out.println( "indexOf returns: " + spot ) ;
    
  }
}