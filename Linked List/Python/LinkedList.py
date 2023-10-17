class Node:
    def __init__(self, item) -> None:
        self.item = item
        self.next = None


class LinkedList:
    def __init__(self) -> None:
        self.head = None

    def printll(self):
        current = self.head
        while current is not None:
            print(current.item, end=' ')
            current = current.next


if __name__ == '__main__':
    ll = LinkedList()
    ll.head = Node(1)
    second = Node(2)
    third = Node(3)

    ll.head.next = second
    second.next = third

    while ll.head != None:
        print(ll.head.item, end=' ')
        ll.head = ll.head.next

    ll.printll()
