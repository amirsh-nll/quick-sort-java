import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        File file = new File();
        file.write(null, false);
        QuickSort quicksort = new QuickSort();
        String[] construction = file.read();
        String job="";
        int[] result;

        for(String my_construction:construction)
        {
            for (int i=0; i<my_construction.length(); i++)
            {
                if(!Character.isWhitespace(my_construction.charAt(i)))
                {
                    job += String.valueOf(my_construction.charAt(i));
                }
                else
                {
                    if(!job.equals(""))
                        quicksort.setArray(Integer.valueOf(job));
                    job="";
                }
            }
        }
        quicksort.sort(0, quicksort.getCounter()-1);
        result = quicksort.result();
        int i=0;
        for (int my_result:result)
        {
            if(i>=quicksort.getCounter())
                break;
            System.out.println(my_result);
            file.write(String.valueOf(my_result),true);
            i+=1;
        }
    }
}
