# CS441 Final Project
## Distributed Hillclimbing
###Contributors: Cathal, Brian, Katie, and Jake


### Running the Distributed System

after pulling the `cs441f2016-finalproject` repository `cd` into `cs441f2016-finalproject/projectCode/knapsack/src/` and compile all java code.

Run `./clientRun` and let that wait. (you can do this on multiple computers)

On a seperate account and computer repeat the previous steps up to compiling the java code

On the second computer run `./run.sh`with two parameters, the name of the server computer you are currently on (i.e. aldenv100) and the number of client nodes currently waiting.

example: `./run.sh aldenv100 1`

The best result will be printed on the server side.

### Running the napsack problem locally.

Run `java Knapsack` after compiling the java code. The Knapsack class takes two parameters, a file containing items and weights and a max cost.
