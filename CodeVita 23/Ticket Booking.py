def calculate_priority(groups):
    num_groups = len(groups)
    mid = num_groups // 2
    if num_groups % 2 == 0:
        return groups[mid:][::-1] + groups[:mid][::-1]
    else:
        return groups[mid + 1:][::-1] + [groups[mid]] + groups[:mid][::-1]

def book_seats(theater, groups, seat_prices):
    missing_row_index = seat_prices.index('?')
    total_collection = int(input())  # Total collection after bookings
    row_prices = [price for idx, price in enumerate(seat_prices) if idx != missing_row_index]
    
    bookings = []
    empty_seats = 0
    priority_groups = calculate_priority(groups)
    for group_size in priority_groups:
        booked = False
        for idx, row in enumerate(theater):
            if group_size <= row.count('_'):
                theater[idx] = theater[idx].replace('_', 'X', group_size)
                booked = True
                break
        
        if not booked:
            empty_seats += group_size
    
    cost_missing_row = (total_collection - sum((row.count('X') * price) for row, price in zip(theater, row_prices))) // empty_seats
    
    return theater, empty_seats, cost_missing_row

# Read inputs
num_rows = int(input())
theater = [input().strip() for _ in range(num_rows)]
groups = list(map(int, input().strip().split(',')))
seat_prices = input().strip().split()

# Book seats and get the output
seating_arrangement, empty_seats, cost_missing_row = book_seats(theater, groups, seat_prices)

# Output seating arrangement, remaining seats, unbooked groups, and cost of missing row
for row in seating_arrangement:
    print(row)
print(f'{empty_seats} {" ".join(map(str, groups))}')
print(cost_missing_row)
