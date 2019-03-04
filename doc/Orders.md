# **Orders**

`Preorders` are the most basic Orders, must be composable and assotiave. Preorders is a binary relation that is reflexive, transitive (composable). For example `≤` relation: 
	
	5 ≤ 7, 7 ≤ 9 so 5 ≤ 9 (transitive)
	and 
	5 ≤ 5 (reflexive)

If a preorder is also antisymmetric , that is
	
    a ≤ b 
    and 
    b ≤ a implies a = b 

then it is a `partial order`.

In the other hand, if  it is antisymmetric for all the elements:

    a ≤ b 
    or
    b ≤ a 
    for all a,b 

then it is `total order`.


In total orders you have an arrow between any objet of the set, in partial or pre order that always is not true.

Pre orders are acylce, there cannot be an arrow from element a to b and an arrow from b to a. Just one single arrow, ie from a to b

## Orders examples

 - ### Preorders
	 - Class Subtyping: 
		 
		 reflexive (meaning _A_<: _A_ for any type _A_) 
		  and 
		  transitive (meaning that if _A_<:_B_ and _B_<:_C_ then _A_<:_C_
		  ![](https://i.ibb.co/gT8Rdvy/8170-AA10-47-BB-40-D4-84-EE-0-BAB7-A082551.jpg)
	 - Thin Categories
		![
](https://i.ibb.co/qNpGryY/3382-E90-A-157-E-480-F-9-E22-CB1-AB2-DEB5-EE.jpg)
The set of arrows between objects is called hom-set. The home-set in a category C from object a to b is C(a,b), you also have C(a,a). 
So a thin category is a Set of hom-set in which element is either a empty hom-set or a single hom-set, in the above example hom-set is defined as

	   > **hom-set { (x,y) , (y,z), (x,z), (z,w) }**

 - ### Partial orders
	 -  The set of [natural numbers](https://en.wikipedia.org/wiki/Natural_number "Natural number") equipped with the relation of [divisibility](https://en.wikipedia.org/wiki/Divisor#Divisibility_of_numbers "Divisor")
			 - Transitive: 12 | 2 and 12 | 4 then 12 | 4
			 - Reflexive: 12 | 12 and 12 | 12 then 12 = 12
			 - It is also antisymmetric but no symmetric because, it does not satisfy for all (a , b) that a | b and b | a so b = a, for example, 12 | 4 = 3 but you cant 4 | 12. And it is antisymmetric because for all pair of (a, a) it satisfy that a | a and a | a so a = a.	 
 - ### Total orders
	 - The natural numbers ordered by relation `≤`
			 - Transitive: 1 `≤` 2 and 2 `≤` 3 then 1 `≤` 3
			 - Reflexive: 1 ≤ 1 
			 - Antisymmetry for all elements:
 



