class Queue:
    def __init__(self) -> None:
        self.queue = []

    def enqueue(self, item):
        self.queue.append(item)

    def dequeue(self):
        if self.queue != []:
            return self.queue.pop(0)

    def display(self):
        print(self.queue)

    def size(self):
        return len(self.queue)


q = Queue()
q.enqueue(1)
q.enqueue(2)
q.enqueue(3)
q.enqueue(4)

print("Dequeue element: ", q.dequeue())
q.display()
