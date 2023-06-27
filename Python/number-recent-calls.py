from collections import deque

class RecentCounter:

    def __init__(self):
        self.queue = deque()
        self.count=0

    def ping(self, t: int) -> int:
        self.queue.append(t)
        self.count+=1

        while self.queue and self.queue[0] < t - 3000:
            self.queue.popleft()
            self.count-=1
    
    def get(self):
        return self.count

counter = RecentCounter()
counter.ping(1) 
counter.ping(100)
counter.ping(3001)
counter.ping(3002)
print(counter.get())