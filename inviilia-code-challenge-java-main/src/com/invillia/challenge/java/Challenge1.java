package com.invillia.challenge.java;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Java Basic Challenge
 *
 * Write a code to verify if a string provided has all unique characters.
 *
 * For example: "zyyz"
 *  x -> unique
 *  y -> not unique
 *  y -> not unique
 *  z -> unique
 * Result: False
 *
 */
public class Challenge1 {

    /**
     * Your code goes here
     */

    public static void main(String[] args) {
        String str = "xcd";
        System.out.println("Input : "+str);
        System.out.println("String has all unique characters: " + hasAllUniqueCharacters(str));
    }
    
    public static boolean hasAllUniqueCharacters (String str) {
    	HashSet<String> map=new HashSet<String>(); 
    	String [] strArr = str.split("|");
    	
    	for (String x : strArr) {
    		map.add(x);
    	}
    	
    	if(str.length() == map.size()) {
    		return true;
    	}
    	return false;
    }
}

