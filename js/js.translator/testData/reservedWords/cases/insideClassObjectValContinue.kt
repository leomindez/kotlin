package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    default object {
        val `continue`: Int = 0

        fun test() {
            testNotRenamed("continue", { `continue` })
        }
    }
}

fun box(): String {
    TestClass.test()

    return "OK"
}