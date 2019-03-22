# draft of "Where's the benefit?"

I will reach for polymorphism when a problem
requires representing a kind of entity (call it the kind X), 
and specialized versions of that kind
(call those kinds SubXs). 

The X class will contain members that are common to all types.
Each SubX class will contain members that are required
only for that type. In particular, a SubX method will 
override an X method when the SubX kind of entity has
an idiosyncratic way to behave. 

When I write code that invokes the behavior without
knowing which kind of X is being considered,
I can depend on the JVM to find the method appropriate
to the particular SubX object.