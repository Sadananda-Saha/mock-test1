package com.acc.lkm.mocktest1;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        TreeMap<String,String> tm = new TreeMap<String,String>();
        tm.put("Java","Atlassian");
        tm.put("Python","Abacus");
        tm.put("Kotlin", "RedHat");
        System.out.println("Technology with their projects:");
        //System.out.println(tm);
        for(Map.Entry m1:tm.entrySet()) {
        	System.out.println(m1.getKey()+" is used in "+m1.getValue());
        }
    }
}
