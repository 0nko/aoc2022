fun getSums(input: List<String>): List<Int> {
    val sums = mutableListOf(0)
    input.forEach {
        if (it.isBlank()) {
            sums += 0
        } else {
            sums[sums.lastIndex] += it.toInt()
        }

    }
    return sums
}

fun main() {
    fun part1(input: List<String>): Int {
        return getSums(input).max()
    }

    fun part2(input: List<String>): Int {
        return getSums(input).sorted().reversed().subList(0, 3).sum()
    }

    // test if implementation meets criteria from the description, like:
    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
