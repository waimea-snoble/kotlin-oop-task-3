# Kotlin OOP Task 3 - Gnomes on Steps

The gnomes have found a few home on some steps

```
   /\
  ('')
__{__}__   /\
   #1  |  (oo)
       |__{__}__   /\
           #2  |  (xx)
               |__{__}__
                   #3  |
```

Gnomes are placed on the steps in the garden. The top step is #1, the lowest step is #10

- Only one gnome can be on a step at a time
- Gnomes can be shifted to different steps, but only if they are unoccupied
- Gnomes can be moved up and down the steps, but not above the top step (1), nor below the lowest (10)
- If Gnomes are moving up/down, and the target step is occupied, they take the step before
