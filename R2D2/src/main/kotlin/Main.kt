fun main(args: Array<String>) {

    var r2d2pos: List<Int>

    r2d2pos = mover(10, 5, -2)
    println("x: ${r2d2pos[0]}, y:${r2d2pos[1]}, dir:${orientacionRobot(r2d2pos[2])}")

    r2d2pos = mover(0, 0, 0)
    println("x: ${r2d2pos[0]}, y:${r2d2pos[1]}, dir:${orientacionRobot(r2d2pos[2])}")

    r2d2pos = mover()
    println("x: ${r2d2pos[0]}, y:${r2d2pos[1]}, dir:${orientacionRobot(r2d2pos[2])}")

    r2d2pos = mover(-10, -5, 2)
    println("x: ${r2d2pos[0]}, y:${r2d2pos[1]}, dir:${orientacionRobot(r2d2pos[2])}")

}

/**
 * Descripción sfkvnb
 * @param List<Int> lista de movimientos que debe realizar el robot
 * @return List<Int> posición y dirección del robot
 */
fun orientacionRobot(dir: Int) = when (dir) {
    0 -> "POSITIVE Y"
    1 -> "NEGATIVE X"
    2 -> "NEGATIVE Y"
    3 -> "POSITIVE X"
    else -> ""
}
fun mover(vararg movs: Int): List<Int> {
    var posX = 0
    var posY = 0
    var dir = 0

    for (i in movs) {
        when (dir) {
            0 -> posY += i
            1 -> posX -= i
            2 -> posY -= i
            3 -> posX += i
        }
        if (dir == 3) {dir = 0} else dir++
    }

    return listOf(posX, posY, dir)
}