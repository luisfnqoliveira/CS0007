

import math
import random

random.seed(1)

RADIUS = 0.5

class Point:
    def __init__(self, x=0, y=0):
        self.__x = x
        self.__y = y

    def get_x(self):
        return self.__x;

    def get_y(self):
        return self.__y;

    def set_x(self, x):
        self.__x = x;

    def set_y(self):
        self.__y = y;


def get_user_input():
    print("How many darts do you want to throw?")
    return int(input())

def generate_random_point(limit):
    x = random.uniform(-limit,limit)
    y = random.uniform(-limit,limit)
    return Point(x, y)

def is_in_circle(p, radius):
    if p.get_x()**2 + p.get_y()**2 <= radius**2:
        return True
    return False



n_darts = get_user_input()
n_hits = 0


points = []
for i in range(0, n_darts):
    p = generate_random_point(RADIUS)
    if is_in_circle(p, RADIUS):
        n_hits+=1

print(n_hits)
print(n_darts)
print("%.10f"% (4*n_hits/n_darts) )
