# implement a list by storing its elements in an array

Design `List_inArraySlots` to implement a list of integers.
Your implementation required to be able to store any values that 
an `int` can hold, in consecutive slots of an array of `int`s.

In general, the array will be only partially populated with list elements.
That is, the array is generally larger than this list. 
Occasionally, the array can be completely full, but adding
another element to the list will cause the `List_inArraySlots`
class to expand the list, as described in the header comments
for the `expand()` method in the skeleton.

The requirement "to store any values that an `int` can hold" 
implies that the implementation can **not** identify the end of the list
by the values of the integers stored in the list. That design decision
would require reserving one integer value as a marker value, which would
keep the user-programmer from storing that value in the list.
Therefore, the "marker value" technique is banned for our purposes here.
(In other contexts, marker values are fine design choices.)
