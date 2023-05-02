class While_prime
{
public static void main(String args[])
  {
  While_prime obj = new While_prime();
              obj.prime();
  }
    public void prime()
    {
    int num = 29;  
    int i = 1;
    int count = 0;
    while(i<=num)
      {
      if(num % i == 0)
        {
        count++;
        } 
      i++;
      }

            if(count == 2)
              { 
              System.out.println(num + " is a PRIME NUMBER"); 
              }
            else
              {
              System.out.println(num + " is a not a PRIME NUMBER");
              }
     }
} 
