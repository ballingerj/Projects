/************************************************** 
* PointerTutorial.c
* Jake Ballinger
* 03 January 2015
* Explains pointers in C, with code examples.
* 
* Compile: gcc PointerTutorial.c -o PointerTutorial
* Run: ./PointerTutorial
*
* Disclosure: This program was modelled off of the TutorialsPoint tutorial, which can be found at: http://www.tutorialspoint.com/cprogramming/c_pointers.htm
**************************************************/
#include <stdio.h>

/* Let's have some fun with addresses. */
int main() {
  int x;
  char c[10];

  printf("Welcome! This is a tutorial on the basics of pointers in C. Here, I'll be covering the following:\n--> What are pointers?\n--> Why are they used?\n--> How do I use them?\nBut first, we need to look at addresses.\n\n");
  printf("We use the '&' character to denote an address in memory.\n");
  printf("Thus, the following lines of code can be used to print thr addresses of a variable in memory:\n");
  printf("printf(\"Address of x: %%x\\n,\", &x)\n");
  printf("printf(\"Address of c: %%x\\n,\", &x)\n\n");

  printf("Not we'll print the locations of x, an int, and c, a char array of size 10.\n");
  printf("Address of x: %x\n", &x);
  printf("Address of c: %x\n", &c);

  printf("\nWhat is a pointer?\n");
  printf("Answer: A pointer is a variable whose value is the address of another variable. The general declaration of a pointer variable is:\n type *variableName;\nAnd we can assign addresses to pointers by the following command:\n type *variableName = &variable;\n");
  printf("\nHow do I use pointers?\n");
  printf("Let's give an example with \n");
  return 0;
}