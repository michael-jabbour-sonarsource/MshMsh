using System;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            // Unused variable violations
            int unusedInt = 100;
            string unusedString = "never used";
            
            // Null reference violation
            string nullRef = null;
            int len = nullRef.Length; // This will cause NullReferenceException
            
            // Magic number violation
            int magicNumber = 42;
            
            Console.WriteLine("Hello, World!");
            
            // Unreachable code violation
            return;
            Console.WriteLine("This will never execute");
        }
        
        // Unused method violation
        private static void UnusedMethod()
        {
            Console.WriteLine("This method is never called");
        }
        
        // Empty catch block violation
        private static void BadExceptionHandling()
        {
            try
            {
                int x = 10 / 0;
            }
            catch (Exception ex)
            {
                // Empty catch block - bad practice
            }
        }
    }
}
