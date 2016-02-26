# salestock-solution

Lang: Java (version 1.8)

## 01-AgeSorter-10M-Rows
- How to produce sorted_age.txt:
```java AgeSorter < age.txt > sorted_age.txt```

- Execution time to produce sorted_age.txt
```time java AgeSorter < age.txt > sorted_age.txt```
real	0m59.964s
user	0m26.941s
sys	0m32.187s

- How to generate age.txt 
```python ageGen.py > age.txt```

- Execution time to generate age.txt
```time python ageGen.py > age.txt```
real	0m19.568s
user	0m19.406s
sys	0m0.092s


## 02-AgeSorter-7B-Rows
- Solved using solution no.01 (no modification in file)
- Execution time to do sorting 7B rows: 700 * 59.964 second = ~ 11.6 hours 

## 03-BlacklistedUser-1M-Rows
- Execution time of check_blacklist
```time java BlacklistChecker```
true
real	0m1.902s
user	0m4.024s
sys	0m0.249s

- How to generate blacklist.txt:
```python genBlacklisUser.py > blacklist.txt```

- Execution time to generate blacklist.txt
```time python genBlacklisUser.py > blacklist.txt```
real	0m7.346s
user	0m7.268s
sys		0m0.052s

### Why use HashMap ?
A: In Java 8, when we have too many unequal keys which gives same hashcode(index), when the number of items in a hash bucket grows beyond certain threshold (TREEFY_THRESHOLD = 8), content of that bucket swicthes from using a 'linked list' of Entry objects to do a 'balanced tree'. This theoritically improves the worst-case performance from O(n) to O(log n).
https://www.youtube.com/watch?v=c3RVW3KGIIE
