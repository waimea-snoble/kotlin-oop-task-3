/**
 * ================================================
 * Task 2 - Garden Gnomes on the Steps
 *
 * The gnomes have found a few home on some steps
 *
 *    /\
 *   ('')
 * __{__}__   /\
 *    #1  |  (oo)
 *        |__{__}__   /\
 *            #2  |  (xx)
 *                |__{__}__
 *                    #3  |
 *
 * Gnomes are placed on the steps in the garden.
 * The top step is #1, the lowest step is #10
 * - Only one gnome can be on a step at a time
 * - Gnomes can be shifted to different steps,
 *   but only if they are unoccupied
 * - Gnomes can be moved up and down the steps,
 *   but not above the top step (1), nor below the
 *   lowest (10)
 * - If Gnomes are moving up/down, and the target
 *   step is occupied, they take the step before
 * ================================================
 */


fun main() {
    println("Gnomes on Steps")
    println("------------------------")

    // Instantiate steps

    val steps = Steps()

    // Instantiate gnomes

    val jim = Gnome("Jim")
    val sam = Gnome("Sam")
    val amy = Gnome("Amy")

    check(jim.stepNumber(steps) == 0)
    steps.placeGnomeOnStep(jim, 2)
    steps.placeGnomeOnStep(sam, 4)
    steps.placeGnomeOnStep(amy, 8)

    steps.show()
}


/**
 * Steps class
 */
class Steps() {
    // Steps list, either holding a gnome or null
    val steps = mutableListOf<Gnome?>()

    init {
        println("Setting up steps...")
        // 10 empty steps
        for (i in 1..10) steps.add(null)
    }

    /**
     * Place a given gnome on the given step (1-10)
     */
    fun placeGnomeOnStep(gnome: Gnome, step: Int) {

    }

    /**
     * Show the steps with the names of any gnomes
     * on them. If a step is empty, show no text
     * 1. Jim
     * 2.
     * 3. Sam
     * etc.
     */
    fun show() {
        // Loop thru steps, getting the index and gnome
        for ((i, gnome) in steps.withIndex()) {

        }

    }

    /**
     * Find a given gnome on the steps. Return the
     * step number (1-10) if found, or 0 if not
     */
    fun findGnome(gnome: Gnome): Int {
        return 0
    }

    /**
     * Return the gnome on the given step (1-10),
     * or null if empty
     */
    fun getGnomeOnStep(stepNum: Int): Gnome? {
        return null
    }
}


/**
 * Gnome class
 */
class Gnome(val name: String) {
    init {
        println("Creating a gnome... $name")
    }

    /**
     * Given a list of steps, return the step
     * number (1-10) of this gnome, or 0 if
     * the gnome is not on the steps
     */
    fun stepNumber(steps: Steps): Int {
        return 0
    }
}

