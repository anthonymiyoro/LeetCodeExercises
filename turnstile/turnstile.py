class Solution:
    def turnstile(self, arrived, directions):
        inQueue = []
        outQueue = []8
        inIdx = 0
        outIdx = 0
        
        # Put arrivals in respective queues
        for i in range(len(arrived)):
            if directions[i]==0:
                inQueue.append(arrived[i],i)
            else:
                outQueue.append(arrived[i],i)
            
        # Time in which we start and the last known state of the door    
        time = -1
        lastState = -1
        
        ans = [0 for _ in range(len(arrived))]
        
        while inIdx < len(inQueue) and outIdx < len(outQueue):
            
            # if this is the first iteration
            if inQueue[inIdx][0] <= time and outQueue[outIdx][0] <= time:
                if lastState == 0:
                    ans[inQueue[inIdx][1]] = time
                    inIdx += 1
                elif lastState == 1:
                    ans[outQueue[outIdx]]
                    
                    
                