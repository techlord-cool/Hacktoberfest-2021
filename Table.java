import java.io.*;


public class Table{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your number: ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
     
         for(int i=1; i<=10; i++){

           System.out.printf("%d x %d = %d%n",N ,i , N*i);
          
         }
         
       }
}

