import math

# Function to find the string based on rank and length
def find_string(rank, length):
    alphabet = list('abcdefghijklmnopqrstuvwxyz')
    result = ""

    # Decrement the rank to align with zero-based indexing
    rank -= 1

    for i in range(length):
        # Calculate the factorial for remaining characters
        fact = math.factorial(26 - i - 1)
        index = rank // fact  # Calculate index of current character
        result += alphabet[index]  # Append the character to result
        del alphabet[index]  # Remove the used character
        rank %= fact  # Update rank for the next iteration

    return result

# Taking input
rank = int(input())
length = int(input())

# Finding and printing the string
print(find_string(rank, length))
