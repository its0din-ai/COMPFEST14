from itertools import permutations
from pwn import *

# create permutaion of AAAA-BBBB-CCCC-DDDD-EEEE
key = "ABCDE"

print ("All the permutations of the given string is:")
keygener = list(permutations(key))
sendme = []

for x in keygener:
    payload = b''

    for zz in x:
        if zz == "A":
            if zz != x[-1]:
                payload += b"AAAA-"
            if zz == x[-1]:
                payload += b"AAAA"

        elif zz == "B":
            if zz != x[-1]:
                payload += b"BBBB-"
            if zz == x[-1]:
                payload += b"BBBB"

        elif zz == "C":
            if zz != x[-1]:
                payload += b"CCCC-"
            if zz == x[-1]:
                payload += b"CCCC"

        elif zz == "D":
            if zz != x[-1]:
                payload += b"DDDD-"
            if zz == x[-1]:
                payload += b"DDDD"
                
        elif zz == "E":
            if zz != x[-1]:
                payload += b"EEEE-"
            if zz == x[-1]:
                payload += b"EEEE"

    sendme.append(payload)




#p = remote("103.185.38.238", 16923)
p = process("./serial-key")

p.recvuntil(b"==>")
for zxzx in sendme:
    p.sendline(zxzx)

flag = p.recvall()
print(flag)



