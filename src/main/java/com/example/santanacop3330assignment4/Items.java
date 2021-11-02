package com.example.santanacop3330assignment4;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Derek Santana
 */

import java.time.LocalDate;

//this class gets user input for the items in a single list

public class Items
{
    private String name;
    private String description;
    private LocalDate date;

    public void setName(String name)
    {
        // set name variable to what user inputted
        // this.name = name;
        this.name = name;
    }

    public String getName()
    {
        // Return the name
        return name;
    }

    public void setDescription(String description)
    {
        // Set description variable to what user inputted
        // this.description = description;
    }

    public String getDescription()
    {
        // Return the description
        return description;
    }

    public void setDate(LocalDate date)
    {
        // Set date variable to what user inputted
        this.date = date;
    }

    public LocalDate getDate()
    {
        // Return the date
        return date;
    }

    public Items(LocalDate date, String name, String description)
    {
        this.setDate(date);
        // set date with the date selected in the date picker
        this.setName(name);
        // set the name of the item in the list
        this.setDescription(description);
        // set the description of the item in the list
    }
    @Override
    public String toString()
    {
        // return the string of the item name description and date in the to do list
        return "On: "+this.getDate()+" Do This: "+this.getName()+" -> "+this.getDescription();
    }
}
