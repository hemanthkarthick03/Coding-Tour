def rotate_string(s, d):
    left_rotation = s[d:] + s[:d]
    right_rotation = s[len(s)-d:] + s[:len(s)-d]
    return left_rotation, right_rotation


s = "codingninjas"
d = 2
left, right = rotate_string(s, d)
print("After left rotation: ", left)
print("After right rotation: ", right)
