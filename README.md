# Cell-Society
Java program using OpenJFX that animates 6 different simulations on a GUI and parses xml files for initial configurations. 
The cells are composed of their state and their rules for interacting with their neighbors. 
The grid can be of any size (chosen by the user) and a set of rules (e.g., whether a cell changes state, is created, or moves to another position in the grid). 
The simulation is run by applying the rules on each cell "simultaneously", i.e., based only on their current state, and then updating their states in a second pass.
The 6 simulations the program animates are: Game of Life, WatorWorld, Spreading Fire, Percolation, SugarScape, and Segregation.
