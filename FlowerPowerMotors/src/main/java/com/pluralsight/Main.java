package com.pluralsight;

/*
The main class should be where you call all of your classes
*/

public class Main
{
    public static void main(String[] args)
    {
        UserInterface userInterface = new UserInterface(); // instantiate UI class
        userInterface.personalize(); // activate the personalize class by calling it here
        userInterface.greeting(); // activate the greeting class by calling it here
        userInterface.display(); // activate the user interface class by calling it here

    }
}

