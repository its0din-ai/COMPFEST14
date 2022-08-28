import binascii

f = 'message.enc'

with open(f, 'rb') as ff:
    content = ff.read()
    print(binascii.hexlify(content))