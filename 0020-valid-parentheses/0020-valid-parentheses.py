class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        # if(len(s)==1):
        #     return False
        # for ch in s:
        #     if(ch =='(' or ch =='{'or ch =='[' ):
        #          stack.append(ch)
        #     else:
        #         if(ch == ')'):
        #             if(len(stack)==0 or stack.pop()!='('):
        #                 return False
        #         if(ch == '}'):
        #             if(len(stack)==0 or stack.pop()!='{'):
        #                 return False
        #         if(ch == ']'):
        #             if(len(stack)==0 or stack.pop()!='['):
        #                 return False
        # return len(stack)==0
        
        dic = { ")":"(" ,"}":"{","]":"[" }
        
        for char in s:
            if char in dic:
                if stack and stack[-1]==dic[char]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(char)
        return True if not stack else False
    
        