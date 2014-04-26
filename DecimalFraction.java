package jc;

class DecimalFraction
{
  public static void main (String[] args)
  {
    float x = 1.0f;    // 1.0f means 1.0 float
    float y = 10.0f;
    
    if ( x/y == (float)0.1 ) //try to delet "(float)" you ll see the alternative result
      System.out.println("Buy the cookie!" + x/y  );
    else
      System.out.println("No cookie for you."  + x/y);
  }
}