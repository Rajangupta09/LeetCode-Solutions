class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        sum = 0
        for i in digits:
            sum = (sum * 10) + i
        sum+=1
        li = list()
        print(sum)
        while sum>0:
            li.append(sum%10)
            sum = sum//10
        li.reverse()
        return li