#눈덩이 굴리기
import sys
from typing import AnyStr 

input = sys.stdin.readline
N,M = map(int,input().split())

A=[0]+list(map(int,input().split()))

def DFS(index,size,time):
    global ans
    if time > M: 
        return 
    if time <= M:
        ans = max(ans,size)
    if index <= N-1:
        DFS(index+1,size+A[index+1],time+1)
    if index <= N-2:
        DFS(index+2,size//2+A[index+2],time+1)
ans = -1
DFS(0,1,0)
print(ans)