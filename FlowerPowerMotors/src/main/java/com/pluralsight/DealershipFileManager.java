package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DealershipFileManager
{
    public Dealership getDealership()
    {
        // file path
        String filePath = "file/inventory.csv";

        // file object that points to the text file
        File file = new File(filePath);

        // create a file reader to open the file (Scanner)
        try(Scanner fileScanner = new Scanner(file))
        {
            // read the contents of the file
            while(fileScanner.hasNext())
            {

            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found. ");
        }
    }

    public Dealership saveDealership()
    {
        return null;
    }
}
