# arquillian-spock-gradle

test project


Bug: test ist executed N^2 times, where N - number of values for an iterator in a "where" block.
Looks like a spock runner iterates twice over "where: " block. on the client side and in a container.


Example:
```
  when:
	println i
  then:
	i == 1
  where:
	i << (1..2)
```
Output:
```
13:01:14,287 INFO stdout 1
13:01:14,350 INFO stdout 2
13:01:14,689 INFO stdout 1
13:01:14,778 INFO stdout 2
```
