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
  movies = {} # Since there's nothing yet to initialize, d_movies is empty.
  info = [] # This is the list we're going to use to store the movie information
  runtimes = [] # This is the list we use to store the length of each movie
  titles = [] # This is the list we use to store the titles of each movie
  zipped = () # The tuple of form (titles, runtimes). 
  flight_length = 0 # The length of the flight

  # Create a dictionary d_movies such that (key, value) corresponds to (title, minutes_to_watch).
  # Read in from "movies.txt"
  file = "movies.txt" # Assign "movies.txt" to the variable "file"
  for line in open(file, "r"): # For each line in file, do the following:
    info = line.split() # Split the data in the file by spaces and store it in a list
    runtimes.append(info[len(info)-1]) # Store the last element in a separate list
    del info[-1] # Remove the last element from the list
    # Current problem: We need to join together the names of the movies
    for item in info: # Run through each of the items in info
      if not isNotFloat(item): # If this element is a float, then it must be the score, so:
        titles.append(" ".join(list(info[0:info.index(item)]))) # Append the title to the titles list
        break # Since we don't want to continue any more, we can break out of the loop.
  
  # Now that we've successfully pruned out our data, let's put it into movies
  zipped = zip(titles, runtimes) # Zip the data to create tuples
  movies = dict((titles, movies) for titles, movies in zipped) # Adds them to the dictionary movies
  print (movies)

  # Now it's time to actually solve the problem!
  # First, ask the user the input the length of the flight
  while True:
    flight_length = input("How long is your flight? ")
    try:
      int(flight_length)
      break
    except ValueError:
      print("I'm sorry, but that was not an integer. Please input an integer.")

  # Now we need to prune our dictionary for EXACTLY TWO MOVIES that match up to this amount. To do this, we treat flight_length as an upper bound and we verify all possible combinations of movies that we could combine. 
  # In order to make this fast, we're not going to use a naïve brute force method; instead, we're going to work with a sorted-by-value represention of the dictionary. For each value, we subtract that from flight_length to obtain a new value flight_remaining. We then check each movie's runtime against flight_remaining; if it's equal or to less than flight_remaining, we add it to our list of viable candidates. 
  # To maximize the user's experience, we're going to output two separate lists: the first will contain movies that either exactly or very closely (+- five minutes) match with the length of the flight. The second will be all of our other matches. 


def isNotFloat(s):
  try: # Test to see if it's an int
    if (float(s)) % 1 == 0:
      return True
  except ValueError:
      return True
  return False

# Execute the program
main()