package com.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Derek Santana
 */

import org.junit.jupiter.api.Test;

class ControllerTest
{
    @Test
    void newList_test()
    {
        // Test that a new list was created
        // Create variable of class AddList
        // Call createNewList() w/ class AddList variable
        // Make the TextField listName = "Hello World"
        // If this works there should be a file named HelloWorld.txt
        // And it should show up in the choice box
    }

    @Test
    void addItem_test()
    {
        // Test that item is added to a list selected
        // Create a variable of class Items
        // Call setName and pass itemName = "Hello"
        // Call getName and store it and check if it is added to .txt of the list
        // Call setDescription and pass description = "Hi I am Description"
        // Call getDescription and store it and check if it is added to .txt of the list
        // Call setDate and pass this.date (today's date) as parameter
        // Call getDate and store it and check that today's date is in the .txt file of the list
        // Check that all of these are in the ObservableList of items
    }

    @Test
    void openLists_test()
    {
        // Test a list was opened
        // Create a variable of class AddList
        // Call createNewList() to create a new list a have the name be called "Test1.txt"
        // Create a variable of class SaveList
        // Call saveList() for "Test1.txt"
        // Create a variable of class Open
        // Call open() from Open and attempt to open "Test1.txt"
    }

    @Test
    void saveList_test()
    {
        // Test a list was saved
        // Create a variable of class AddList
        // Call createNewList() to create a new list a have the name be called "Test2.txt"
        // Create a variable of class SaveList
        // Call saveList() for "Test2.txt"
        // Search the program folder for the file named "Test2.txt"
    }

    @Test
    void saveAllLists_test()
    {
        // Test all lists were saved
        // Create a folder called "Save All Test"
        // Create a variable of class AddList
        // Loop through 5 times and call createNewList() each time
        // So that 5 lists of names "List #n.txt" where n starts at 1
        // And is the number of the list are created
        // Create a variable of class SaveList
        // Loop 5 times and call saveList() for all "List #n.txt"
        // Search the program folder for the files named "List #n.txt"
        // And ensure that 1-5 are there
    }

    @Test
    void deleteList_test()
    {
        // Test that a list was deleted
        // Create variables for classes DelList and AddList
        // Call createNewList() and set TextField listName = "TestList"
        // Call deleteList() and loop through ArrayList of lists and find "TestList"
        // And delete it
        // Check that TestList does not exist by checking choice box to see if it is an option
    }

    @Test
    void renameList_test()
    {
        // Test that a list was renamed
        // Create variables for classes AddList and Edit
        // Call createNewList() and set TextField listName = "RenameListTest"
        // Call renameList() and rename it to "RenamedList"
        // Check that the ArrayList of lists no longer contains "RenameListTest"
        // And that it contains "RenamedList"
        // Also check choice box for "RenamedList" and make sure it does not contain "RenameListTest"
    }

    @Test
    void renameItem_test()
    {
        // Test that an item was renamed
        // Created variable for classes AddList , Items , and Edit
        // Call createNewList() and make list of name "renameItemTest"
        // Call setName & getName with name = "name1"
        // Call setDescription & getDescription with description = "descr1"
        // Call setDate & getDate with date = "2021-01-01"
        // Call renameItem() and rename it to "Renamed"
        // Check that the list no longer contains "name1" and now contains "Renamed"
    }

    @Test
    void editDate_test()
    {
        // Test that an item has a new date
        // Created variable for classes AddList , Items , and Edit
        // Call createNewList() and make list of name "redateItemTest"
        // Call setName & getName with name = "name2"
        // Call setDescription & getDescription with description = "descr2"
        // Call setDate & getDate with date = "2021-01-01"
        // Call redate() and redate it to "2021-02-02"
        // Check that the list contains "name2" and now contains that date "2021-02-02"
    }

    @Test
    void editDescription_test()
    {
        // Test that an item has a new description
        // created variable for classes AddList , Items , and Edit
        // call createNewList() and make list of name "DescriptionTest"
        // call setName & getName with name = "name3"
        // call setDescription & getDescription with description = "descr3"
        // call setDate & getDate with date = "2021-01-01"
        // call editDescription() and edit it to "New Description"
        // check that the list contains "name3" and now contains description of "New Description"
    }

    @Test
    void deleteItem_test()
    {
        // Test that an item was deleted
        // create variable for classes AddList, Items, and Edit
        // call createNewList() and make list of name "DeleteItemTest"
        // call setName & getName with name = "name4"
        // call setDescription & getDescription with description = "descr4"
        // call setDate & getDate with date = "2021-01-01"
        // call deleteItem() for "name4" item
        // check that the list no longer contains item "name4"
    }

    @Test
    void markComplete_test()
    {
        // Test that item was marked as complete
        // create a variable for classes AddList and Items
        // call createNewList() and make list of name "MarkCompleteTest"
        // call setName & getName with name = "name5"
        // call setDescription & getDescription with description = "descr5"
        // call setDate & getDate with date = "2021-01-01"
        // add item name description and date to a new txt called "CompleteTest.txt"
        // ensure that "name5" "descr5" and "2021-01-01" are all in "CompleteTest.txt"
    }

    @Test
    void displayAllItems_test()
    {
        // Test that all items can be displayed
        // create a variable for classes AddList, Items, and Display
        // call createNewList() and make list of name "DisplayAllTest"
        // loop 5 times and
        //      call setName & getName with name = "AllTestName #n" w/ n = # of test
        //      call setDescription & getDescription with description = "AllTestDescr #n" w/ n = # of test
        //      call setDate & getDate with date = "2021-01-01"
        //      add item name description and date to a new txt called "AllItemsTest.txt"
        //      ensure that "AllTestName #n" "AllTestDescr #n" and "2021-01-01" are all in "AllItemsTest.txt"
    }

    @Test
    void displayCompletedItems_test()
    {
        // Test that all completed items can be displayed
        // Create a variable for classes AddList, Items, Open, and Display
        // call createNewList() and make list of name "DisplayCompletedTest"
        // loop 5 times and
        //      call setName & getName with name = "CompTestName #n" w/ n = # of test
        //      call setDescription & getDescription with description = "CompTestDescr #n" w/ n = # of test
        //      call setDate & getDate with date = "2021-01-01"
        //      add item name description and date to a new txt called "AllItemsTest.txt"
        //      ensure that "AllTestName #n" "AllTestDescr #n" and "2021-01-01" are all in "AllItemsTest.txt"
        // loop 3 times through "AllItemsTest.txt" and mark first 3 as complete
        // add those first three to "CompItemsTest.txt" and call open()
        // if an item was added to "CompItemsTest.txt" it should display the first 3 of "AllItemsTest.txt"
    }

    @Test
    void displayIncompleteItems_test()
    {
        // Test that all incomplete items can be displayed
        // Create a variable for classes AddList, Items, Open, and Display
        // call createNewList() and make list of name "DisplayCompletedTest"
        // loop 5 times and
        //      call setName & getName with name = "IncompTestName #n" w/ n = # of test
        //      call setDescription & getDescription with description = "IncompTestDescr #n" w/ n = # of test
        //      call setDate & getDate with date = "2021-01-01"
        //      add item name description and date to a new txt called "AllItemsTest.txt"
        //      ensure that "AllTestName #n" "AllTestDescr #n" and "2021-01-01" are all in "AllItemsTest.txt"
        // loop 3 times through "AllItemsTest.txt" and mark first 3 as complete
        // add those first three to "CompItemsTest.txt" and call open()
        // compare the AllItemsTest.txt to CompItemsTest.txt and
        // if -> at index they are equal, continue
        // else -> add index to "IncompItemsTest.txt"
        // if an item was added to "IncompItemsTest.txt" it should display the last 2 of "AllItemsTest.txt"
    }

}
