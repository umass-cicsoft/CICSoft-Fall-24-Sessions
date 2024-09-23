def answer(a):
	# Write you code for each test case here
	
	return a


# dont modify this code unless you know what you are doing
t = int(input())
while(t):
	t -= 1
	n = int(input()) # this is the number of elements in the sequence
	a = [int(i) for i in input().split()] # this is the sequence you need to work on
	print(*answer(a));