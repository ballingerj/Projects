# unjumble.py
#
# Author: Jake Ballinger
# Date: 01 December 2015
# Honor Code: All work is mine. 
# 
# Compile/Run: python unjumble.py
# Output: binoculars

# Variables
d = {} # The dictionary in which we read the long string
x = [] # The list we use to grab the keys of d

def decode():
  # Counts the frequency of characters occuring in the long string
  file = "jumble.txt" # Read in the file
  for line in open(file, 'r'): # Parse through the file line by line
    for i in range(0, len(line)): # For each character, do the following:
      if line[i] not in d.keys(): # If not there, add to the dictionary
        d[line[i]] = 1
      else: # Else, increment the count (frequency) of that character
        d[line[i]] += 1
  sort() # Call the sort method
# decode() end

def sort():
  # Sort the values in the dictionary by size
  x = [i for i in sorted(d, key=d.get, reverse=True)] # Creates a new list of the keys ordered by value
  # This essentially sorts a representation of the dictionary. Since dictionaries are orderless, this is cool!
  # Now get rid of everything after '_' and print out the resulting word.
  print("".join(x[:x.index('_')]))
# sort() end

# Here, solve the problem
decode()
