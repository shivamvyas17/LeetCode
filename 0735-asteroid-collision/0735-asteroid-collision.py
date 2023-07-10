class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
         result = []
    
         for a in asteroids:
            while result and a < 0 and result[-1] > 0:
                if abs(a) > result[-1]:
                    result.pop()
                elif abs(a) == result[-1]:
                    result.pop()
                    break
                else:
                    break
            else:
                result.append(a)
    
         return result
        