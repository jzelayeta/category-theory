# **DEFINITIONS**  
  
* If there is an arrow going from A to B and an arrow going from B to C then there must also be a direct arrow from A to C that is their composition  
    > ![](https://i.ibb.co/NpYNvvw/B7-A7886-C-412-A-4-CBE-AA31-EE68-B8-E530-E8.jpg)
 * Properties of composition:  
  
	 * Composition is associatve
	 * For every object A there is an arrow which is a unit of composition. This arrow loops from the object to itself. Being a unit of composition means that, when composed with any arrow that either starts at A or ends at A, respectively, it gives back the same arrow. The unit arrow for object A is called idA (identity on A). In math notation, if f goes from A to B then
	
		>f∘idA = f
		>idB∘f = f

* A category consists of objects and arrows (morphisms). Arrows can be composed, and the composition is associative. Every object has an identity arrow that serves as a unit under composition.
*  Isomorphism:
    >![](https://i.ibb.co/4JBvytb/0-E7343-C9-C07-C-4-E26-A22-E-175-E738-F6-F98.jpg)	 
    >
    > *being:* 
    >
    > f :: a -> b
    >
    >*and* 
    >
    > g :: b -> a (the inverse of f)
    >
    > f and g are isomorphisms if they satisfy: 
    >
    >   g∘f = ida
    >
    >    f∘g = idb
    >
    >
    > Not all functions are isomorphisms, i.e : function `isEven :: Int => Bool` does not have inverse function![](https://i.ibb.co/Tcdhb2x/22-FAA137-D7-F7-4-F72-95-D1-09-FD6-B7-D8-E1-E.jpg)
    >
    >	In math a function must be injective to have inverse, injective functions do not collapse, in other words, each element of the domain have a differente element in the domain. 
    > `Injective (Latin) == Monomorpishm (Greek)`
    > ```Surjective (Latin) == Epimorphism (Greek) ```
	 
* *Total Functions* are those which are defined for all the elements of the domain, meanwhile a *Partial Function* is defined for a subset of the domain. A partial function  could throw an exception or are not defined for some source values.