##Jets Project

##Week 2 Homework for SD13

This program is an exercise in using classes, arrays, functions, and objects in order to return formatted output.

We begin with a menu of 5 options:
1)Lists fleet of jets in airport
2)Lists fastest jet in fleet
3) Lists jet with farthest range in fleet
4) Allows user to add jets to fleet
5) Quits program

I started by creating two separate Objects, and a "launcher" that had main() method to execute the program.  My two objects consisted of an Airport object and a Jets object. The airport contained the jets in an array, and provided all the functions (aka methods) to return information about the jets in the fleet, such as which was the fastest, which had the greatest range, top speed, and gave us the ability to add jets.

The jets object defined the parameters of the jets themselves, the constructs, the setters, and the getters. The jets had values for model, speed, range, condition, and price.  I also included a function for deriving the speed in Mach, if the user entered the speed in MPH.  

The launcher class is the backbone of the program.  It starts by displaying the menu for the user to pick an option based on numbers 1-5.  Each number corresponds to a function. 1-4 are functions called from the Airport class. 5 is the option to quit and exit (kill) the program. 

The most difficult part, for me, was working with the arrays (and loops) and figuring out how to get the values i needed, what output to get out of the functions, and how to use them.  