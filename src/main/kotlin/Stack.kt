class Stack<T> {
    private val storage = arrayListOf<T>()

    val count : Int
    get() = storage.size

    val isEmpty : Boolean
    get() = count == 0

    override fun toString() = buildString {
        appendLine("---top---")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("---end---")
    }

    fun push(element: T) = storage.add(element)

    fun pop(): T? {
        if (storage.size == 0)
            return null

        return storage.removeAt(storage.size - 1)
    }

    fun peek() : T? = storage.lastOrNull()

}