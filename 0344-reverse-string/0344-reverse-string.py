class Solution:
    def reverseString(self, s: List[str]) -> None:
        stack=[]
        for char in s:
            stack.append(char)
        i=0
        while stack:
            s[i]=stack.pop()
            i+=1