from lib2to3.pytree import convert
import math
from Crypto.Util.number import *


cipher = 9374862801672011569143243493759834651854302741137921000102578544699291979446566751224308195563143818572747719554194296378534570567611662927670424040122448080297660315763919835547979020798858773382846531061164305692587249050470792784030378941011568711598405260217713145913298312177245941797747579315848845560416341162472834841483660610520663088002666937849734156282961628596655437329193404438480724827837876570876735412917919486656991832502209825763626000370301523282284
print(f"\nCiphertext : {cipher}")
print("==========================================\n")
byteCipher = long_to_bytes(cipher)
# print(byteCipher)
'''
YHWtj[Sc!Cr|}vkx)e1loReMipSuMDoLORsitAMetcOnseCtETurAdIpIscINgELiTquiSQUEFINiBusQUaMDiAmsitAmeTFInIbusmaGNACONDimENTUMnecQUisQUEULTRicieSUrNAseDauCTOrtEMpOrmaeba_ITTLOULtS0_e__fNdCdYFS"#UI%&%)Il

'''
p = []
cc = "YHWtj[Sc!Cr|}vkx)e1"

guessModeCaesar = "COMPFEST1"
print(f"Hasil decode Caisar Cipher :: {guessModeCaesar}\n")


bc = "loReMipSuMDoLORsitAMetcOnseCtETurAdIpIscINgELiTquiSQUEFINiBusQUaMDiAmsitAmeTFInIbusmaGNACONDimENTUMnecQUisQUEULTRicieSUrNAseDauCTOrtEMpOrmae"
xx = ''.join(map(str, [1 if c.isupper() or c.isnumeric() else 0 for c in bc]))
# print(f"Biner dari Bacon's Cipher :: {xx}\n")

decima = [20,91,70,17,50,83,52,63,83,52,19,80,63,79,70,63,67,50,57,80]
bcPlain = ""
for zx in decima:
    bcPlain += chr(zx + 32)
print(f"Hasil decode Bacon's Cipher :: {bcPlain}\n")

partColumn = "T0_bUT_faLLeN_tO_dIS"
print(f"Hasil decode Columnar Transposition :: {partColumn}\n")

def Convert(string):
    list1=[]
    list1[:0]=string
    return list1

vc = ["C","d","Y","F","S",'"',"#","U","I","%","&","%",")","I","l"]
kunci = ["l","o","r","e","m"]
plainVigenere = ""

for i in range(len(vc)):
    plainVigenere += chr((ord(vc[i]) - ord(kunci[i % len(kunci)])) % 94 + 32)

print(f"Hasil decode dari Vigenere Cipher :: {plainVigenere}\n")



flag = guessModeCaesar + bcPlain + partColumn + plainVigenere
print(f"\nFLAG NGAB :: {flag}")