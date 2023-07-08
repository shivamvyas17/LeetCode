class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        if(len(s)==1):
            return False
        for ch in s:
            if(ch =='(' or ch =='{'or ch =='[' ):
                 stack.append(ch)
            else:
                if(ch == ')'):
                    if(len(stack)==0 or stack.pop()!='('):
                        return False
                if(ch == '}'):
                    if(len(stack)==0 or stack.pop()!='{'):
                        return False
                if(ch == ']'):
                    if(len(stack)==0 or stack.pop()!='['):
                        return False
        return len(stack)==0
    
        