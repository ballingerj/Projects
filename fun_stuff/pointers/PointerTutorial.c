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
  printf("Let's give an example.\n");

  int *ip = &x; /* pointer to an int */
  char *ch; /* pointer to a char */
  printf("\nLet the pointer variable *ip equal the address of x; i.e., *ip = &x.\nThen the address of *ip = %x\n", &*ip);
  printf("This is the same as the address of x: %x\n", &x);
  printf("\nNow, what happens when we try to modify x?\n");
  x = x + 2;
  printf("x = x + 2;\n");
  printf("The new address of x is %x\n", &x);
  printf("Just kidding! Nothing happened. Now let's modify *ip.\n");
  *ip = *ip + 2;
  printf("The address of *ip: %x\n", &*ip);
  printf("But did you know there's also an \"ip\" variable, which we never declared?\nThe address of ip is %x\n", &ip);
  printf("Mind blowing, right? The addresses are different! Now let's look at their values.\n");
  printf("The value of *ip is %x\n", *ip);
  printf("The value of ip is %x\n", ip);

  /*printf("\nNow let's look at strings.\n");
  char t[12] = "Hello World!";
  char s[12];
  printf("The String t is %s\n", t);
  printf("The String s is empty %s\n", s);
  *s = &s;
  *t = &t;
  while (*s++ = *t++);*/
  return 0;
}