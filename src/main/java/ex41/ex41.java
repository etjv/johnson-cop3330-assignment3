/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Edmund Johnson V
 */

package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ex41 {
    // make a file pointer
    private static final File inf = new File("exercise41_input.txt");
    private static FileWriter outf = null;

    static {
        try {
            outf = new FileWriter("exercise41_output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Scanner in = null;
    // create ListOfNames class
    private static final ListOfNames List = new ListOfNames();

    static {
        try {
            in = new Scanner(inf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        // create a list of strings
        // scan the names into the list
        List<String> l = GetNames();
        // sort the names in the list of strings
        l = List.SortNames(l);
        // create outfile

        // print the output
        outf.write(printOutput(l).toString());
        outf.close();

    }

    private static List<String> GetNames(){
        String s;
        List<String> l = new ArrayList<>();
        while(in.hasNextLine()){
            s = in.nextLine();
            l.add(s);
        }
        return l;
    }

    private static StringBuilder printOutput(List<String> l){
        StringBuilder b = new StringBuilder();
        b.append("Total of ").append(l.size()).append(" names\n-----------------\n");
        for(int i = 0; i < l.size(); i++){
            b.append(l.get(i)).append("\n");
        }
        return b;
    }
}
