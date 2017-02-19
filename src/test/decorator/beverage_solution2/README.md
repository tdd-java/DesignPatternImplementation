## Decorator Pattern 

### Problem: 
- The coffee shop server 4 kinds of coffees:
 ```HouseBlend,DarkRoast, Decaf and Espresso.``` 
- Each coffee can have following as top up/condiments: 
  ```steamed milk, soy, mocha and whipped milk```
- The final cost is Coffee cost + Condiments cost 

#### Solution 1:
1. Beverage as super class and let other classes implement the beverage and we can create toppings as same way 

```
                        Beverage
------------------------------------------------------------------------
     |                  |               |          |
     HouseBlend         DarkRoast       Decaf      Espresso    
     Coffee     
 
      Each Condiment combination will have another class
    
```
 
#### Problems: 
1. This is class explosion: Just too much classes 
2. If anything changes in Condiments (add, delete, update), we need to update all the classes. 


#### Solution 2: 
```
    Beverage
    ---------
     description 
     milk 
     soy 
     mocha 
     whip
     ---------
     getDescription 
     getCost 
     
     hasMilk | set Milk
     hasSoy  | setSoy
     hasMocha| setMocha
     hasWhip | setWhip
     
```
 For this solution check out decorator.solution2 package. 
 
#### Problems with this approach:
1. We will need to add methods as we add the condiments in Superclass. 
2. Some coffee for which top up are not relevant, still will be available for them to use. 
3. Price changes in condiments, will need to alter the code. 
4. New condiments addition will lead to changes in cost. Ideally it should not affect the cost calculation. 

>Currently we are tying behavior because we it's being set statically. If we can inherit the behavior through composition, then we can get liberty of doing same runtime. 

> Dynamically composing objects, we can add new functionality by writing new code rather than altering the same code. 

> This is nothing but Open Closed Principle. | Classes should be open for extension but closed for modification. 


> Good link to visit for this: [Decorator Pattern | When, why and how](https://sourcemaking.com/design_patterns/decorator)



