# Last updated: 9/3/2025, 5:28:23 PM
class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        si=''
        n= k
        for i in range(len(s)-1,-1,-1):
            if s[i] == '-':  
                continue
            if( s[i]>='a' and s[i]<='z' ):
                si=chr(ord(s[i])-32)+si
            elif ( s[i]>='0' and s[i]<='9' ):
                si=s[i]+si
            elif (s[i]>="A" and s[i]<="Z"):
                si=s[i]+si
            k-=1
            if k == 0 and i != 0 :
                si='-'+si
                k=n
        return si.strip("-")
            