def create():
    x = []
    return x


def check_empty(stack):
    return stack == []


def push(stack, x):
    stack.append(x)
    print("Pushed Element :", x)


def pop(stack):
    print("Popped Element :", stack.pop())


x = create()
push(x, 5)
push(x, 9)
pop(x)
