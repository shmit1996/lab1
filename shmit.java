public class shmit
{
    public static void main(String[] args) 
    {
        
        System.out.println ("1");

        for (int n = 2; n < 100; n++)
        {
            boolean i;
            i = isPrime (n);
            if (i == true)
            {
                System.out.println (n);
            }
        }
        
    }

    public static boolean isPrime(int n)
    {
        for (int a = 2; a < n; a++)
        {
            if (n % a == 0)
            {
                return false;
            }
        }
        return true;
    }
}