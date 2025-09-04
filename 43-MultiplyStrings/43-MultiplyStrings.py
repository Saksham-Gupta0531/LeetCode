# Last updated: 9/4/2025, 6:15:33 AM
class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        d={
            "0":0,"1":1,"2":2,"3":3,"4":4,"5":5,"6":6,"7":7,"8":8,"9":9
        }
        d2={
            0:"0",1:"1",2:"2",3:"3",4:"4",5:"5",6:"6",7:"7",8:"8",9:"9"
        }
        a,b=0,0
        c1=0
        while a<len(num1):
            c1=c1*10+d[num1[a]]
            a+=1
        c2=0
        while b<len(num2):
            c2=c2*10+d[num2[b]]
            b+=1
        p=c1*c2
        s=""
        print(c1,c2,p)
        if p==0:
            return "0"  
        while p!=0:
            s=d2[p%10]+s
            p=p//10
        return s


            



