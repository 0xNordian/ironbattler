
# Ironbattle

Ironbattle is an rpg-like battle simulator featuring `Wizards` and `Warriors` created in Java.

Check our [Play Guide](#play-guide)!

## Tech Stack

- Java (v19)
- Oracle OpenJDK (v19.0.1)


## Features

- No installs required ([check how to Run Locally](#run-locally))
- Runs in terminal
- Character manual creation
- Character auto-generation
- Two-classes of character



## Contributors

- [@0xNordian](https://github.com/0xNordian)
- [@dga80](https://github.com/dga80)
- [@estelcm](https://github.com/estelcm)
- [@jordi92al](https://github.com/jordi92al)
- [@marnamrs](https://github.com/marnamrs)


## Run Locally

Clone the project

```bash
  git clone https://github.com/PoderComputacional/ironbattler.git
```

Go to the project directory `src/Main.java`

Compile and Run 

```bash
  javac Main.java
  java Main.java
```


## Play Guide

Ironbattle is the ultimate fighting simulator, that represents the bloody battle between two duelists in an arena.
As a player you can decide if generate two random characters or recreate your favorite characters with their name and stats.

The game offers (2) modes: 

`1` Create your own characters

`2` Create random characters

In order to start the game manually, select option `1` from the menu and enter the data requested by the game (`Class`, `Name` and `Hp`).

Depending on the class (`Warrior` or `Wizard`) selected, the available range for their health points will be:
- `Warrior`: health points have to be in a range 100-200.
- `Wizard`: health points have to be in a range 50-100.

Once you have entered the data the game will simulate the battle between them.

In case you want to play a quick round, set the characters randomly using option `2` from the menu.

### HOW THE BATTLE WORKS

The two characters will fight each other in consecutive turns until one or both of them run out of `hp`. 
They attack each other simultaneously.

If both characters die in the same turn, the game will bring them back to life and reset their `hp` so they can fight again and resolve the draw. 

#### WARRIOR

       |\                     /)
     /\_\\__               (_//
    |   `>\-`     _._       //`)
     \ /` \\  _.-`:::`-._  //
      `    \|`    :::    `|/
            |     :::     |
            |.....:::.....|
            |:::::::::::::|
            |     :::     |
            \     :::     /
             \    :::    /
              `-. ::: .-'
               //`:::`\\
              //   '   \\
             |/         \\      
The `warrior` class has (2) attacks that depend on its `stamina` and `strength` points.

At the start of its turn, the `warrior` will chose either a `Heavy Attack` or a `Weak Attack`. 

A `Heavy Attack` consumes (5) `stamina` points and deals damage equal to the warrior's `strength`. 
If it lacks the `stamina` to perform the `Heavy Attack`, it will switch to perfoming a `Weak Attack` instead. 

The damage of the `Weak Attack` will equal half of its `strength` and will increase its `stamina` by (1) point.

If `warrior` has no `stamina` points, he will not attack that turn and will recover (2) `stamina` points.

#### WIZARD


                *    .
         '  +   ___    @    .
             .-" __"-.   +
     *      /:.'`__`'.\\       '
         . |:: .'_ `. :|   *
    @      |:: '._' : :| .
       +    \\:'.__.' :/       '
             /`-...-'\\  '   +
    '       /         \\   .    @
      *     `-.,___,.-'     
The `wizard` class has (2) attacks that depend on its `intelligence` and `mana` stats.

At the start of its turn, the `wizard` will chose either a `Fire Ball` or a `Staff Hit`.

A `Fire Ball` consumes (5) `mana` points  and deals damage equal the wizard's `intelligence`.
If it lacks the `mana` to use `Fire Ball`, it will switch to using `Staff Hit` instead.  

`Staff Hit` will make (2) points of damage and recover (1) `mana`.

If `wizard` has no `mana` points, he will do no damage that turn and will recover (2) `mana` points.




## Credits

 - Sound: [mixkit-metallic-sweep-suspense-670](https://mixkit.co/free-sound-effects/suspense-music/)
 
