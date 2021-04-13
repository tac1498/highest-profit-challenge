
package highestprofit;

import java.util.*;
import java.io.*;

public class HighestProfit {

    public static void main(String[] args) 
    {
      /* Import & Convert csv File
        * create file from csv
        * set delimiter
        * read csv line by line into arraylist
      */
       String file = "raw.csv"; 
       String delimiter = ",";
       String line;
       List <List<String>> data = new ArrayList<>();
       try (BufferedReader br = new BufferedReader(new FileReader(file))) 
       {
            while((line = br.readLine()) != null)
            {
                String[] values = line.split(delimiter);
                data.add(Arrays.asList(values));
            }
       }
       
      /* Count Rows
        * remove header
        * count # elements to get # of rows in original csv file
        * Display # of rows
      */
       int header =0;
       data.remove(header);
       int itemCount = data.size(); 
       System.out.println("Answer 1: There are " +itemCount + " rows of data in the csv file."); //Display Answer 1 of how may rows of data in the csv file
    
      /* Delete Invalid Profts & Recount
        * iterate arraylist to remove "N.A" profits
        * count remaining number of elements in new dataset
        * Display # of rows in new dataset
      */
        Iterator<List<String>> itr = data.iterator();
        while (itr.hasNext())
        {
           if(itr.next().contains("N.A."))
           {itr.remove();}
       }
       int itemCount2 = data.size();
        System.out.println("Answer 2: There are " +itemCount2 + " rows of data left with valid profits.");
     
        
        //STOP HERE... could not remember how to convert to json... below is my best explanation of how I would've proceeded if I had gotten past Part 2

      /*Convert to JSON
        * covert ArrayList data to json formatted array
        * write json array to file called "data2.json
      */

      /*Top 20 Rows
        * parse array looking at profit column
        * sort data in descending order of profit
          *JSON arrays contain attributes so I could look at the "profit" attribute of each row and sort based on numeric value by using a compare function
        * display first 20 rows of new sorted array 
          * create new array of first 20 rows
          * print out new array as Answer 3
          * 
      */
    
    }       
    }
