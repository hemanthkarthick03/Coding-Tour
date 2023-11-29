def calculate_distance(good_string, name):
    total_distance = 0
    prev_good_letter = good_string[0]

    for i in name:
        if i in good_string:
            distance = abs(ord(prev_good_letter) - ord(i))
        else:
            min_dist = float('inf')
            nearest_letter = None

            for letter in good_string:
                diff = abs(ord(letter) - ord(i))
                if diff < min_dist or (diff == min_dist and abs(ord(prev_good_letter) - ord(letter)) < abs(ord(prev_good_letter) - ord(nearest_letter))):
                    min_dist = diff
                    nearest_letter = letter

            distance = abs(ord(prev_good_letter) - ord(nearest_letter))
            prev_good_letter = nearest_letter

        total_distance += distance

    return total_distance

# Example input
good_string = input()
name = input()

# Calculate and print the total distance
distance = calculate_distance(good_string, name)
print(distance)