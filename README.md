# arquillian-spock-gradle

test project


Bug: test ist executed N^2 times, where N - number of values for an iterator in a "where" block.
Looks like a spock runner iterates twice over "where: " block. on the client side and in a container.



