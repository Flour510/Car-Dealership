# Welcome to Flower Power Motors 🌸
In this repository you will find the code written in the Java language, that builds a mini console-based application for a car dealership. According to these instructions, the application is to be built with these specifications in mind:

This app would sit on the desk of a salesman or sales manager at a dealership. The features are straightforward. Currently, users of the application will be able to:
- List ALL Vehicles
- Add a Vehicle
- Remove a Vehicle
- Quit

The vehicles the dealership sells will be persisted in a pipe-delimited csv file. Changes to the dealership's inventory (when a vehicle is added or removed) will require the csv file to be updated.    - Workbook 4 Workshop 

# Screens
When you initially run the code, the terminal displays a message to the user letting them know what type of application they are about to use. To make the user experience a bit more personalized, the application asks the user to enter their name:

<img width="412" alt="Screenshot 2024-05-13 at 7 11 37 AM" src="https://github.com/Flour510/Car-Dealership/assets/99916123/d8cac9dc-a749-49a2-a82c-6399643bb231">

# Greeting / Menu Screen
The user is then greeted by their name, followed by a display of the Menu screen and the different screen options you can navigate into. The user can input a number from 1 - 4 to make a selection to go into a next page as shown below:

<img width="529" alt="Screenshot 2024-05-13 at 7 15 29 AM" src="https://github.com/Flour510/Car-Dealership/assets/99916123/e01a0e00-8440-41b5-b854-9d801459407f">

# All Vehicles Inventory List Screen
If the user inputs selection 1 and presses enter, they will be prompted into that screen and a list of all Available Vehicles will be displayed to the user. The information regarding the vehicles will be displayed in this order:

- Vehicle ID
- Vehicle Year
- Vehicle Make
- Vehicle Model
- Vehicle Color
- Vehicle Price

<img width="727" alt="Screenshot 2024-05-13 at 7 21 24 AM" src="https://github.com/Flour510/Car-Dealership/assets/99916123/1e6b7e1e-fc43-46bf-adbd-311f690b74e7">

Followed by a question prompting the user to make their next move as shown below:

<img width="726" alt="Screenshot 2024-05-13 at 7 21 56 AM" src="https://github.com/Flour510/Car-Dealership/assets/99916123/9bc8384d-6794-4599-a0a6-1c747d5253b4">

# Input Errors!
In the case the user enters an input that is invalid, the application will throw an error message as shown below:

<img width="527" alt="Screenshot 2024-05-13 at 7 25 28 AM" src="https://github.com/Flour510/Car-Dealership/assets/99916123/1094d4aa-54a1-409e-8463-89f2fb69bfef">

# Interesting Piece of the Code
One part I particularly found interesting to build was the Remove a Vehicle option. That was by far one of the most difficult pieces of the code to create.  So much so I had to ask for help in fixing it. I did not have my connection to the csv file created properly so when I tried to implement the Remove Vehicles screen, I was met with alot of obstacles.

This was the inital attempt to creating the Remove Vehicles option:

<img width="608" alt="Screenshot 2024-05-13 at 7 33 20 AM" src="https://github.com/Flour510/Car-Dealership/assets/99916123/93619715-b4d3-4792-9553-0f5b1bb4202f">


Here is the corrected code for the Remove Vehicles option:

<img width="934" alt="Screenshot 2024-05-13 at 7 36 06 AM" src="https://github.com/Flour510/Car-Dealership/assets/99916123/d456750e-f564-4514-8ef8-fdc7d5b252ea">



