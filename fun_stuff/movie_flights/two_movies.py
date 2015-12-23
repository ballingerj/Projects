# two_movies.py 
# Jake Ballinger
# 22 December 2015
# 
# Problem Statement: Users on longer flights like to start a second movie right when their first one ends, but they complain that the plane usually lands before they can see the ending. This is a travesty! Build a feature that will allow the user to input the time remainning in the flight and that will list all possible combiations of two movies for the user to watch within that time frame, if there are two such movies. 
# Assumptions:
# --> Movie titles will be stored in a separate .txt file called "movies.txt"

# Compile/Run: two_movies.py. Make sure movies.txt is in the same folder!

def main():
  # Variable dictionary, in order of appearance.
  movies = {} # Contains the title and length of our movies
  info = [] # This is the list we're going to use to store the movie information
  runtimes = [] # This is the list we use to store the length of each movie
  titles = [] # This is the list we use to store the titles of each movie
  zipped = () # The tuple of form (titles, runtimes). 
  flight_length = 0 # The length of the flight
  matrix = [] # The next stage up from the repurposed info
  flight_remaining = [] # The list of lists containing the the matrix of (flight-length - movie length) for all combinations of movies.
  combos = {} # Contains 

  # Create a dictionary d_movies such that (key, value) corresponds to (title, minutes_to_watch). We use a dictionary because we want to keep the associations in the data. Thus, we want to keep the association between a movie's title and its time to watch.
  # Read in from "movies.txt"
  file = "movies.txt" # Assign "movies.txt" to the variable "file"
  for line in open(file, "r"): # For each line in file, do the following:
    info = line.split() # Split the data in the file by spaces and store it in a list
    runtimes.append(info[len(info)-1]) # Store the last element in a separate list
    # del info[-1] # Remove the last element from the list
    # Current problem: We need to join together the names of the movies
    for item in info: # Run through each of the items in info
      # We're going to identify the cutoff point in the list as when we encounter a string that both contains a decimal point '.' and is a number. This way we catch things like "42.7" and avoid things like "vs." or "Mt.Vernon". 
      if '.' in item and not isNotNum(item): # If '.' is in this item in the list and that item is not a number, then: 
        # Once we've done that, we're going to truncate the list, merge the name, and add it to titles. 
        titles.append(" ".join(info[0:info.index(item)])) 
        break # Since we don't want to continue any more, we can break out of the loop.
  # Now that we've successfully pruned out our data, let's put it into movies
  zipped = zip(titles, runtimes) # Zip the data to create tuples
  movies = dict((titles, movies) for titles, movies in zipped) # Adds them to the dictionary movies
  # print (movies)

  # Now it's time to actually solve the problem!
  # First, ask the user the input the length of the flight
  while True: # Infinite loop
    try: # Try/Except for error tolerance
      flight_length = int(input("How long is your flight? ")) # Prompt the user and change answer to int
      break # If this works, then break out of the loop
    except ValueError: # Exception catching so the problem doesn't crash
      print("I'm sorry, but that was not an integer. Please input an integer.") # Tell the user of the problem
      # Here, the loop repeats. This happens until they under a valid input. 

  # Now we need to prune our dictionary for EXACTLY TWO MOVIES that match up to this amount. To do this, we treat flight_length as an upper bound and we verify all possible combinations of movies that we could combine. 
  # In order to make this fast, we're not going to use a naïve brute force method; instead, we're going to work with the movies dictionary. We subtract each value that from flight_length to obtain a new value flight_remaining. We then check each movie's runtime against flight_remaining; if it's equal or to less than flight_remaining, we add it to our list of viable candidates. 
  # To maximize the user's experience, we're going to output two separate lists: the first will contain movies that either exactly or very closely (+- five minutes) match with the length of the flight. The second will be all of our other matches. 
  info = [] # We're going to reuse this variable, so we need to wipe it clean
  for k, v in movies.items(): # For each (key, value) pair in movies:
    info.append([tuple((k, v))]) # Make the identifying information a tuple and append it. This is a list of lists of tuples of key, value pairs. Confusing, I know. Here's an example:
    # If movies = {(k_{1}: v_{1}), (k_{2}: v_{2}), ..., (k_{n}: v_{n})}, then 
    # info = [[(k_{1}, v_{1}), (k_{2}: v_{2}), ..., (k_{n}: v_{n})]]
    # We're doing this because our next list, flight_remaining, is going to be of this structure, too. 
  # for item in info: # So, for each sole list/tuple in info
      # matrix.append(item) # First, append item to matrix. This is the identifying tag.  
      # flight_length.append(info) # Now append the whole thing to flight_length
  print(info)
    # Add (k_{1}, v_{1}) to the first element in the list
    #info = list(())
    #for value in movies.values():
    #  print(value)

# isNotNum(): Checks to see if the input is a number
def isNotNum(s):
  try: # Any number can be represented as a float, so let's try to cast the input as a float
    float(s) # Change s to  a float
    return False # If it works, s is a number, so return False.
  except ValueError: # Error handling in case it's not a float
    return True # Since we had an erorr, it's not a number, so return True. 

# Execute the program
main()