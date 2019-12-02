import random
print('Guess the number 1-9')
a=random.randint(1,9)
x=int(input())
while True:
    if x==a:
        print('Correct! Let''s play again. Guess a number.')
        x=int(input())
    elif x<a:
        print('Guess higher.')
        x=int(input())
    elif x>a:
        print('Guess lower.')
        x=int(input())
    else:
        print('Try again.')
        x=int(input())
