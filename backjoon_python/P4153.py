'''
P4153

과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.


'''
def checking(test_list):
    if(pow(test_list[2], 2) == pow(test_list[1], 2) + pow(test_list[0], 2)):
        return "right"
    else:
        return "wrong"


while True:
    input_list = list(map(int, input().split()))
    input_list.sort()

    if(input_list == [0,0,0]):
        break


    print(checking(input_list))
