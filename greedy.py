################## 큰 수의 법칙
# import timeit
#
# start = timeit.default_timer()
#
# n = 5
# m = 8
# k = 3
# thelists = [2, 4, 5, 4, 6]
#
# thelists.sort()
# length = len(thelists)
#
# count = 0
# sum = 0
#
# for _ in range(0,m):
#     if (count < k):
#         sum += thelists[length - 1]
#         count += 1
#     else:
#         sum += thelists[length - 2]
#         count = 0
#     print(sum)
#
#
# stop = timeit.default_timer()
#
# print("걸린시간은", stop - start, "초")

################## 로또의 최고 순위와 최저 순위

import timeit
start = timeit.default_timer()

lottos = list(map(int, input().split()))
win_nums = list(map(int, input().split()))
answer = []
count = 0

if (lottos.count(0) > 5):
    zerocount = 5
else:
    zerocount = lottos.count(0)

for win_num in win_nums:
    if win_num in lottos:
        count += 1
    else:
        count = count

if (count < 2):
    answer = [6 - zerocount, 6]
else:
    answer = [7 - count - zerocount, 7 - count]

stop = timeit.default_timer()
print(answer)
print("걸린시간은", stop - start, "초")