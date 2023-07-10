class Solution:
    def simplifyPath(self, path: str) -> str:
#         path_list = path.split('/')
#         stack = []

#     # Process each element in the path_list
#         for element in path_list:
#         # Skip empty and current directory elements
#             if element == '' or element == '.':
#                 continue

#         # Handle the parent directory element '..'
#             if element == '..':
#             # Check if the stack is not empty
#                 if stack:
#                     stack.pop()  # Go back to the parent directory
#             else:
#                 stack.append(element)  # Add the directory to the stack

#     # Construct the simplified canonical path
#         return  '/' + '/'.join(stack)
        stack =[]
        simplified_path = path.split('/')
        
        for char in simplified_path:
            
            if char == '' or char == '.':
                continue
            if char == '..':
                if stack:
                    stack.pop()
            else:
                stack.append(char)
        return '/' + '/'.join(stack)

