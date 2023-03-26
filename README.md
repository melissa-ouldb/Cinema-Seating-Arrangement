What's the project about:
We want to write a program for a cinema theatre where people can get tickets and reserve seats.

The program should: 
-Count the number of seats.
-Compute the price of the ticket. 
-Check whether the seat is taken or empty.
-Display statistics: total income, the number of available seats, and the percentage of occupancy.

Instructions: 
The program has a main menu in which the user selects which action he/she would like to do:

The menu:
1. Show the seats: 
2. Buy a ticket: 
3. Statistics
0. Exit

1. Show the seats: Display the seating arrangement and show if the seat is empty or occupied. The output must be an array as follows: 
  1 2 3 4 5 6
1 B S S S S S
2 S S S S S S
3 S S S S S S
4 S S S B S S
5 S S S S S S
6 S S S S S S
where B represents an occupied seat and S an empty seat, and the number of rows and columns must be specified by the user. Every time a user purchases a ticked the "S" must be replaced with a "B".

2. Buy a ticket: The user chooses where to sit by entering the row he wants to purchase and column that corresponds to the seat. The program must be able to identify if the seat is taken, if so it displays a mesage and asks the user to choose another seat. If the seat is empty the seat display and statistics must be updated.

3. Statistics: Everytime a person buys a ticket, the statistics must count: 
Number of purchased tickets: _
Percentage: _%
Current income: $_
Total income: $_

0. Exit: The program works in loop until the user enters 0 and exits the program.

Additional information: 
-The program should handle invalid inputs by displaying an error message and asking the user to enter a valid one.
-How to compute the price of the ticket:
If the total number of seats in the screen room is not more than 60, then the price of each ticket is 10 dollars.
In a larger room, the tickets are 10 dollars for the front half of the rows and 8 dollars for the back half. The number of rows can be odd, for example, 9 rows. In this case, the first half is the first 4 rows, and the second half is the last 5 rows.
