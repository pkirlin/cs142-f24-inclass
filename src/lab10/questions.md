# Lab 10: Inheritance and Polymorphism

## a.k.a. Here, Fishy Fishy Fishy

In this lab, you will practice writing classes using inheritance,
and also learn about a new topic called polymorphism.

## Names:

- Name 1
- Name 2
- Name 3

## Part A

Imagine we are designing some classes to be used in a car-racing
game. Open Car.java and CarDemo.java. Look through the Car
class first. Car.java defines a Car class that knows its current
speed, its top speed (as fast as the car can possibly go), and the
total distance the car has traveled in the race.

There is a drive() method that attempts to accelerate the car
by 5mph unless the top speed is reached, and then drives the car
forward for one second of time.

CarDemo.java simulates a car race that lasts 60 seconds. The car
that drives the farthest in 60 seconds wins. Right now the race
only has two cars.

Run CarDemo.

- Which car wins the race?

__Your answer here__

Write a class called Racecar that *extends* Car, that has the
following behaviors:

- A racecar has a top speed of 200 mph.
- A racecar accelerates at 10 mph every second, rather than 5 mph
  every second like a regular car does.

Hint: You will need to use the `super` keyword to call the
base class (Car) constructor from the Racecar class constructor.
The syntax for this is: `super(arg1, arg2, ...)` and it must
be the first line of code in the constructor. The arguments
are the same arguments you would pass to the Car constructor
itself.

Add one racecar to the CarDemo race.

- Which car wins the race, and how far does this car travel
  in the 60-second race?

__Your answer here__

Write a class called Clunker that *extends* Car, that has the
following behaviors:

- A clunker has a top speed of 50 mph.
- A clunker can only call drive() three times. After the third
  call to drive, the car breaks down, and any further calls to
  drive() won't move it forward anymore.

Add one clunker to the CarDemo race.

- How far does the clunker travel in the entire race?

__Your answer here__

### CHECK-IN (go on if I'm tied up)

## Part B

Open the FishbowlGame file. Run the file to play the game.
Instructions: click the fish to catch them. When a fish is
caught, it disappears and is replaced by a new fish. You earn
points based on the size of the fish: smaller fish are harder
to catch, so they are worth more points.

When you're done playing, let's investigate the Fish class.
Open Fish.java.

- What are the meanings of the three variables that the Fish
  constructor takes as parameters? That is, what concept does
  each variable represent?

__Your answer here__

- The variables `speedx` and `speedy` are initialized in the
  constructor to random values. What are the highest and lowest
  possible values?

__Your answer here__

Now look at the move() function. The first thing move() does
is update the fish's location (locx, locy) by adding (speedx,
speedy) to the location. Then it checks to see if the fish has
hit a wall.

- There are four if tests, one for each of the four "walls" of
  the fishbowl (the canvas): left, right, top, bottom.  
  In what order are the walls tested for if the fish bumps into
  it?

__Your answer here__

- For each of the four if tests, if hitting a wall is detected,
  either speedx or speedy is changed to a new random value. Why
  are negative random values used in two of the if statements,  
  and why only in those two specific cases?

__Your answer here__

Now open Fishbowl.java. Scroll through the file and get a
sense of the code. Focus on each method and try to figure out
what it does.

- How does the Fishbowl class store the Fish objects that
  are present in the fishbowl? In particular, what variable holds
  this information, and what data type is used?

__Your answer here__

Scroll to the end of the file, where the draw() function is.
You will see this line:  `for (Fish fish : fishes)`  It appears
a few times in the code. This is called a "for each loop" or
sometimes an "enhanced" for loop. It allows you to iterate
over each item in an ArrayList (or a few other data types)
without using the indices of the ArrayList directly. There are
many problems where the indices aren't necessary for the code
to solve the problem, and so the for-each loop lets us skip
them.

Open ForEachDemo.java and run the code. Make sure you understand
the syntax behind this new kind of for loop before continuing.

- Does the draw() function make sense now?

__Your answer here__

- Now look at the runGame() function, in particular this section:
  // Move each fish.
  for (Fish fish : fishes) {
  fish.move(canvas.getWidth(), canvas.getHeight());
  }
  Why do we pass canvas.getWidth(), canvas.getHeight() to the
  move function? I'm not looking for an answer like "Because
  the move() function takes canvasWidth, canvasHeight as
  parameters."  This question is asking for the underlying reason
  *why* move() needs this information to be passed in as arguments
  to do its job.

__Your answer here__

Now look below, to where there is code that detects mouse clicks
and loops over the fish to see if they are "caught" (which
happens when the mouse click is inside the boundaries of the
fish picture).

- The code as written will theoretically allow multiple fish
  to be caught with a single mouse click. You might have already
  encountered this while playing. How can this happen in the game?

- Why does the loop that begins after
  `if (canvas.isMousePressed())` *not* used the for-each syntax
  we learned earlier?

__Your answer here__

### CHECK-IN

## Part C

In this part, we will add a second kind of fish to our fishbowl.

Open ZigzagFish.java. A ZigzagFish moves similarly to a
regular fish, except it can change directions even when it
doesn't bump into a wall. It also moves faster in general.
It is also orange rather than blue.

First, make ZigzagFish extend Fish. Then you will write the
ZigzagFish constructor first (notice the constructor immediately
breaks once you extend from Fish, because Fish has no default
constructor, so you will need to use the `super` keyword to call
the three-argument constructor).

Next, override the toString() method in ZigzagFish. Make it work
just like the toString() method in Fish, except it should return
that it's a ZigzagFish, not a regular Fish. You may make any changes
you want to the Fish class you think appropriate.

Stop and test. Open FishTest.java and run the testZigzagFish()
method. It should call your overridden toString() method and
print that the fish is a ZigzagFish.

Next, override the getImageFilename() method in ZigzagFish. This
method returns the name of the image file that contains the picture
of the fish to draw in the fishbowl. Have the overridden method
return "orangefish.png" rather than "bluefish.png".

At this point, we are ready to add some ZigzagFish to our fishbowl!
They won't move differently yet (because we haven't overridden move()),
but they will be orange, rather than blue.

First, add a new ArrayList variable to Fishbowl that will hold
ZigzagFish (rather than regular Fish). Second, add a second loop
to the Fishbowl constructor that will add a few ZigzagFish to the
fishbowl. You can use the existing loop as a guide. (I didn't want
there to be too many ZigzagFish, so I added only numfish/3 of them).

Next, add code to the draw() method in Fishbowl to draw the ZigzagFish
as well as the regular fish. Like before, you can use the existing loop
as a guide. Since the ZigzagFish behaves almost just like a regular
Fish, the code doesn't change too much.

Stop and test. At this point, you should be able to run the FishbowlGame
and see orange and blue fish in the fishbowl, but they won't move yet!  
If you see this, please continue, otherwise let me know.

Next, we will make the ZigzagFish move. In the Fishbowl class, in
runGame(), at the beginning of the while loop, there is code that calls
move() on each regular Fish. Make a second loop to move() each of the
ZigzagFish.

Stop and test. At this point, you should be able to run the FishbowlGame
and see orange and blue fish in the fishbowl, and they will move like
regular fish. If you see this, please continue, otherwise let me know.

Next, we will make the ZigzagFish clickable. In the Fishbowl class, in
runGame(), there is a large section that detects mouse clicks and iterates
over each Fish to see if it was clicked. Write a second loop that mirrors
this one, but tests each ZigzagFish instead.

Stop and test. At this point, you should be able to run the FishbowlGame
and see orange and blue fish in the fishbowl, and they will move like
regular fish, and they will be clickable and get you points.  
If you see this, please continue, otherwise let me know.

Next, we will give the ZigzagFish extra capabilities. First, make a
ZigzagFish worth twice as many points as a regular Fish. Do this by
overriding the getPoints() method in ZigzagFish. Hint: use super to call
the getPoints() method in Fish and return twice whatever the superclass's
method returned.

Stop and test. At this point, when you click a ZigzagFish, it should give
you twice as many points in the game.
If you see this, please continue, otherwise let me know.

Lastly, we will make the ZigzagFish move differently. We need to make
them move faster and change directions sporadically. There is a private
method called pickNewDirection() in ZigzagFish that is commented out that
gives you some hints on changing speedx and speedy to make the ZigzagFish
move faster (it uses a wider range of random numbers). See if you can
get this method to work (speedx and speedy are private in Fish, so you
will need to add/change something in Fish). Then call pickNewDirection() in
the ZigzagFish constructor.

Finally, we need to override move() in ZigzagFish to call pickNewDirection()
every so often. You can do this in a few ways: one way is to keep a counter
variable and count the number of times move() has been called, and then
call pickNewDirection() whenever that counter variable hits some number (you
can choose). This will make the ZigzagFish change direction at set intervals.
Or, which I think is cooler: you can generate a random number inside move()
and use this number to call pickNewDirection() randomly. For example, how
could you make it so every time the ZigzagFish moves, there's a 10% chance it
switches direction?

Stop and test. At this point, your ZigzagFish should act like the orange
fish in the demo.

### CHECK-IN

## Part D

In this last section, we will learn about one of the last major topics
of object-oriented programming, which is called *polymorphism*. Polymorphism
goes hand-in-hand with inheritance, and allows us to *refer to a derived-class
object using a base-class variable*. This might not seem that earth-shattering,
but it allows us to combine sections of code that use different classes into
one piece of code *as long as the classes share a common inheritance structure*.

Here is the essence of polymorphism, using the Fish and ZigzagFish classes,
but they work for any base class and derived classes that extend that base class.

One of the things we've written in Java many times is lines of code like this:

`Datatype variableName = new Datatype(whatever);`

For example, we've written:

`Scanner scan = new Scanner(System.in)`
`SimpleCanvas canvas = new SimpleCanvas(500, 500);`
`Fish nemo = new Fish(40, 40, 40);`
`ZigzagFish dory = new ZigzagFish(40, 40, 40);`

But the data type on the left side (where the variable is declared) always
matches the variable on the right side (where the constructor is called).

**Polymorphism allows us to break this rule.**  Remember that a ZigzagFish
*is a* Fish. It can do everything a regular Fish can do. It has all the
same methods. Therefore, any code that works with a Fish variable should
work equally well with a ZigzagFish variable. Therefore, polymorphism in
Java allows us to write:

`Fish dory = new ZigzagFish(40, 40, 40);`

In other words, you may assign an object of a *derived class* to a *base
class reference variable*. Additionally, when you do this, the `dory` variable
*remembers* that it is a ZigzagFish even though the data type of the variable
does not match the data type of the object. Therefore, any methods you call
on `dory` will use overridden ZigzagFish methods, even though the *variable*
`dory` is a Fish variable.

Let's see an example. Open up FishTest and comment out the call to
testZigzagFish(), and uncomment the call to testPolymorphism(). Run
the code, and notice how it prints details about `fish` and `zzfish`.  
Nothing surprising here. Now remove the comments at the end of
the function. Notice how a third fish is created (`polymorphFish`)
who is *constructed* as a `ZigzagFish` but is *stored* in a `Fish` reference
variable. Run the code and read the output.

Notice how the output clearly shows that `polymorphFish` *knows* that
it is a ZigzagFish: it prints (from toString()) that it is a ZigzagFish,
and is clearly worth twice as many points as a regular fish.

What's extra cool is that you can make an ArrayList of Fish, but store
both regular Fish and ZigzagFish in it. And each object within the
ArrayList still remembers what type it is. Therefore, inside the
loop over the ArrayList, **the exact same line of code might call different
functions at different times, depending on what kind of object
that variable happens to refer to at that particular time.**

If this all makes sense, go on, otherwise ask me to clarify anything
that is confusing.

To finish this section, we will use polymorphism to store both Fish
*and* ZZFish in the same ArrayList. Remember how we changed our code
a little while ago to add an extra ArrayList just for the ZZFish?  
With polymorphism, and the example we just looked at, it should
be clear that we don't need an extra arraylist. We can just use the
existing ArrayList<Fish> (called `fishes`) to store both regular Fish
*and* ZZFish.

There are 5 changes we need to make to the Fishbowl code.

1. First, remove the ArrayList<ZigzagFish> variable you added earlier.
   This of course will immediately break the program but it's helpful
   to see what we have to change.

2. In the constructor for Fishbowl, have you second loop which creates
   ZZFish add the ZZFish *directly* to the `fishes` variable. You still
   need both loops, but they will add to the same ArrayList<Fish> variable.

3. In runGame(), remove the second loop to call move() on the ZZFish
   list. Now that the ZZFish live in the same ArrayList as regular fish,
   we don't need the extra loop.

4. Later in runGame(), remove the extra loop to do mouse click checking
   on the ZZFish list. Again, it's not needed anymore because the same
   code will handle both kinds of fish.

5. In draw(), remove the extra loop to draw the ZZFish list. The
   reasoning is the same as in #3 and #4.

When you are done, you should have a complete, working Fishbowl
game that only uses ONE ArrayList of all the fish, both regular
Fish and ZZFish.

### CHECK-IN

## Bonus: Part E

If there is time, design a TeleportFish that does not move
smoothly, but rather stays in exactly the same place for a random
amount of time, then teleports to a new location.