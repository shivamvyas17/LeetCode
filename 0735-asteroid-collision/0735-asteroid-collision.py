class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
         result = []
    
         for asteroid in asteroids:
            while result and asteroid < 0 and result[-1] > 0:
                if abs(asteroid) > result[-1]:
                    result.pop()
                elif abs(asteroid) == result[-1]:
                    result.pop()
                    break
                else:
                    break
            else:
                result.append(asteroid)
    
         return result
        