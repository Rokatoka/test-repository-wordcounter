package com.example.wordcounter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
        System.out.println(wordcount("Hello world"));//method counts amount of words of string
        
    }
    
    public static int wordcount(String s) {
    	int count = 0;
    	String a = s;
    	char b[] = a.toCharArray();
    	int endLine = s.length() -1;
    	for (int i = 0; i<s.length(); i++) {
    		if (b[i] == 0) {
    			break;
    		}
    		else if (b[i] == ' ' || i == endLine) {
    			count++;
    		} else {
    			continue;
    		}
    	}
    	
    	return count;
    }
}
