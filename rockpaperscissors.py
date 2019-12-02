print('rock, paper, scissors?')
answer=input()
r = 'rock'
s = 'scissors'
p = 'paper'
x ='Rock, paper, scissors?'
while True:
    if answer == r:
        print('paper. You lose!')
        print(x)
        answer=input()

    elif answer == p:
        print('scissors. You lose!')
        print(x)
        answer=input()
    elif answer == s:
        print('rock. You lose!')
        print(x)
        answer=input()
    else:
        print('Invalid answer, dummy. Don''t you know how to play?')
        print(x)
        answer=input()


        



        






