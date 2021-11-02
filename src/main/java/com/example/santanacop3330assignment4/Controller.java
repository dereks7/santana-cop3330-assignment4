package com.example.santanacop3330assignment4;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Derek Santana
 */

import javafx.event.Event;
import javafx.fxml.FXML;

public class Controller
{
    // use @FXML for javafx GUI implementation
    // create a Button -> addItemButton
    // create a TextField -> listName
    // create a TextField -> itemName
    // create a TextField -> description
    // create a DatePicker -> datePicker
    // create a MenuBar for saving files -> menuBar
    // create a ListView of items -> itemList
    // create an ObservableList of items -> itemsObservableList

    @FXML
    private void newList(Event event)
    {
        // Takes TextField listName from List Name text and creates
        // List based off that name
        // Make variable to call class AddList
        // Call createNewList() from AddList class w/ AddList variable
    }

    @FXML
    private void addItem(Event event)
    {
        // When user clicks addItemButton, this will add an item to the current list
        // Stores the date and name of the item in the itemsObservableList list
        // Make Items class variable
        // call setName to set the name of the item pass itemName as parameter
        // call getName to get the name of the item and store it
        // call setDescription to set the description of the item pass description as parameter
        // call getDescription to get the description of the item and store it
        // call setDate to set the date of the item pass datePicker as parameter
        // call getDate to get the date of the item and store it
        // Call Items() and pass the date name and description as parameter
        // Call toString() to be able to display it
        // Call refresh() to reset variables to then update it to a new item
    }

    private void refresh()
    {
        // Set date and item name/description to current date and null for updating new variable
    }

    @FXML
    public void openLists(Event event)
    {
        // user clicked Open from File menu dropdown
        // use a variable to call class Open
        // call open() from Open w/ Open variable
    }

    @FXML
    private void saveList(Event event)
    {
        // use a variable to call class SaveList
        // call saveList() function inside SaveList
    }

    @FXML
    public void saveAllLists(Event event)
    {
        // use a variable to call class SaveList
        // call saveAllLists() from SaveList w/ SaveList variable
    }

    @FXML
    public void deleteList(Event event)
    {
        // use a variable to call class DelList
        // call deleteList() from class DelList w/ DelList variable
    }

    @FXML
    public void renameList(Event event)
    {
        // use a variable to call class Edit
        // call renameList() from class Edit w/ Edit variable
        // this.listName = renameList() and pass TextField listName as parameter
    }

    @FXML
    public void renameItem(Event event)
    {
        // use a variable to call class Edit
        // call renameItem() from class Edit w/ Edit variable
        // this.itemName = renameItem() and pass TextField itemName as parameter
    }

    @FXML
    public void editDate(Event event)  // work in progress
    {
        // use a variable to call class Edit
        // call redate() from class Edit w/ Edit variable
        // set this.date = redate() and pass datePicker in parameter
    }

    @FXML
    public void editDescription(Event event)
    {
        // use a variable to call class Edit
        // call editDescription() from class Edit w/ Edit variable
        // this.description = editDescription and pass TextField itemDescription as parameter
    }

    @FXML
    public void deleteItem(Event event)
    {
        // use a variable to call class Edit
        // call deleteItem() from class Edit w/ Edit variable
    }

    @FXML
    public void markComplete (Event event)
    {
        // user clicked mark as complete under Edit menu
        // add item to separate file "completed items.txt"
        // incomplete items will be the all lists txt but deletes the index of the ones marked as complete
    }

    // may get rid of this so that if displayCompletedItems or displayIncompleteItems are not checked off
    // it defaults to displaying All Items
    @FXML
    public void displayAllItems(Event event)
    {
        // use a variable to call class Display
        // call displayAll() from class Display w/ Display variable
    }

    @FXML
    public void displayCompletedItems(Event event)
    {
        // user checked Complete Items check box
        // use a variable to call class Display
        // call displayComplete() from class Display w/ Display variable
    }

    @FXML
    public void displayIncompleteItems(Event event)
    {
        // user checked Incomplete Items check box
        // use a variable to call class Display
        // call displayIncomplete() from class Display w/ Display variable
    }


}