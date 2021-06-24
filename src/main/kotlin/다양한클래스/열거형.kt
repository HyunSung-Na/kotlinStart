package 다양한클래스

fun main() {
    printDirection(Direction.NORTH)
    printDirection(Direction.SOUTH)

    val west:Direction = Direction.WEST
    val east:Direction = Direction.EAST

    printDirection(west)
    printDirection(east)
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Number(val num:Int, val str:String) {
    ONE(1, "일"), TWO(2, "이"), THREE(3, "삼")
}

fun printDirection(a1:Direction) {

    when(a1) {
        Direction.NORTH -> println("북쪽입니다.")
        Direction.SOUTH -> println("남쪽입니다.")
        Direction.EAST -> println("동쪽입니다.")
        Direction.WEST -> println("서쪽입니다.")
    }
}

fun printNumber(a1:Number) {

    when(a1) {
        Number.ONE -> println("ONE 입니다.")
        Number.TWO -> println("TWO 입니다.")
        Number.THREE -> println("THREE 입니다.")
    }

    println("a1.num : ${a1.num}")
    println("a1.str : ${a1.str}")
}