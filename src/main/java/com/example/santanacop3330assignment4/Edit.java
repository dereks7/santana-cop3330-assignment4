package com.example.santanacop3330assignment4;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Derek Santana
 */

import java.time.LocalDate;

public class Edit
{
    LocalDate date;
    String itemName;
    String listName;

    public void renameList()
    {
        // if -> this.listName == name
        //      continue
        // else -> set this.listName to name
    }

    public void renameItem()
    {
        // if -> this.name == name
        //      continue
        // else -> set this.name to name
        //      call setName() from class Items
        //      call getName() from class Items
    }

    public void redate(LocalDate date)
    {
        // if -> this.date == date
        //      continue
        // else -> set this.date to date
        //      call setDate() from class Items
        //      call getDate() from class Items
    }

    public void editDescription()
    {
        // if -> this.description == description
        //      continue
        // else -> set this.description to description
        //      call setDescription() from class Items
        //      call getDescription() from class Items
    }

    public void deleteItem()
    {
        // if an item is selected and user hits Delete Item under Edit menu
        // get the name of the item by looping through .txt file of the list selected
        // once it is found, we remove that index

    }

}
