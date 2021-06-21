/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Edmund Johnson V
 */

package ex42;

import ex41.ListOfNames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ex42 {
    // make a file pointer
    private static final File inf = new File("exercise42_input.txt");
    private static Scanner in = null;
    // create Records class
    private static final Records R = new Records();

    static {
        try {
            in = new Scanner(inf);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // make a list of the records as a list of maps
        // parse the file to get all of the information
        List<Map<String, String>> Records = GetRecords();
        // print the results
        System.out.print(PrintOutput(Records));
    }

    private static List<Map<String, String>> GetRecords(){
        String lastName;
        String firstName;
        String salary;
        String s;
        String[] c;
        List<Map<String, String>> l = new ArrayList<>();
        while(in.hasNextLine()){
            s = in.nextLine();
            c = s.split(",");
            lastName = c[0];
            firstName = c[1];
            salary = c[2];
            l.add(Records.RecordCreator(lastName, firstName, salary));
        }
        return l;
    }

    private static String PrintOutput(List<Map<String, String>> l){
        StringBuilder s = new StringBuilder();
        s.append("Last\t\tFirst\t\tSalary\n------------------------------\n");
        for(int i = 0; i < l.size(); i++){
            s.append(l.get(i).get("last"));
            if(l.get(i).get("last").length() > 7){
                s.append("\t");
            }
            else{
                s.append("\t\t");
            }
            s.append(l.get(i).get("first"));
            if(l.get(i).get("first").length() > 7){
                s.append("\t");
            }
            else if(l.get(i).get("first").length() < 4){
                s.append("\t\t\t");
            }
            else{
                s.append("\t\t");
            }
            s.append(l.get(i).get("salary")).append("\n");
        }
        return s.toString();
    }


}
