#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'countGroups' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING_ARRAY related as parameter.
#

class UnionFind():
  def __init__(self, N):
    self.items = [[i] for i in range(N)]

  def _find_index(self, item):
    for i in range(len(self.items)):
      if item in self.items[i]:
        return i
    return None

  def union(self, a, b):
    aIndex = self._find_index(a)
    bIndex = self._find_index(b)

    if aIndex is not None and bIndex is not None and aIndex != bIndex:
      self.items[bIndex] += self.items[aIndex]
      del self.items[aIndex]

  def getGroupCount(self):
    return len(self.items)

def countGroups(related):
    # Write your code here
    n = len(related)        
    UF = UnionFind(n)
    for i in range(n):
        for j in range(i+1, n):
            if related[i][j] == '1' and i != j:
                UF.union(i, j)
    return (UF.getGroupCount())

