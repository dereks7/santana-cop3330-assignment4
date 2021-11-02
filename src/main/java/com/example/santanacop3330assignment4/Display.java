package com.example.santanacop3330assignment4;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Derek Santana
 */

public class Display
{
    public void displayAll()
    {
        // Create a .txt of all lists and name it "All Lists.txt"
        // Loop through the ArrayList of lists and add them all to this .txt
        // And call openFile() from class Open with "All Lists.txt"
    }

    public void displayComplete()
    {
        // Check box of Completed Items was ticked
        // Call open() from class open and
        // Open the completed items.txt file
        // Loop through it and print it to the screen
    }

    public void displayIncomplete()
    {
        // Create a .txt called "incomplete items.txt"
        // Loop through and compare the .txt files of all items and completed items
        // if -> all items.txt index == completed items.txt index and is found in completed
        //      do not copy that index to incomplete items.txt
        // else -> all items.txt does not equal completed items.txt index and is not found in completed
        //      copy that index to incomplete items.txt
        // Call open() from class Open and
        // Loop through the incomplete items.txt file and print it to screen
    }
}
