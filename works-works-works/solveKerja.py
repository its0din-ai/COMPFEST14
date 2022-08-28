import base64


enkrip = ["d9","b2","b9","f4","e3","c7","da","ec","e3","b3","d1","d2","c6","c6","f4","d9","d4","b1","c9","d4","c5","ee","b9","c3","d1","d6","ce","c6","c6","e8","d2","af","d5","b0","e8","ca","d2","ec","d1","d2","c5","e8","e8","e4"]

decodedAscii = ""
xorred = ""
print(f"{enkrip} \n")

for xx in enkrip:
    decodedAscii += chr(int(xx, 16) - 128)

print(f"Hasil pengurangan dengan 128 :: \n{decodedAscii}", end="\n")
base64dec = base64.b64decode(decodedAscii)
print(f"\nHasil decode Base64 :: \n{base64dec} \n")

for x in base64dec:
    xr = x ^ 32
    xorred += chr(xr)

print(f"Hasil XOR dengan 32 :: \n{xorred}", end="   :3  ")


