from random import choice

def trial():
    occupied = [False] * 100
    seat_remainder = list(range(100))
    for i in range(100):
        seat_num = choice(seat_remainder) if i == 0 or occupied[i] else i
        occupied[seat_num] = True
        seat_remainder.remove(seat_num)
        
    return True if seat_num == 99 else False

nums = [0, 0]
for _ in range(100000):
    nums[int(trial())] += 1
print(nums)


