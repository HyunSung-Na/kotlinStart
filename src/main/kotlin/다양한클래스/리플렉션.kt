package 다양한클래스

import kotlin.reflect.KClass
import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.primaryConstructor

fun main() {
    // 클래스 타입
    val a1: KClass<String> = String::class
    val a2: Class<String> = String::class.java

    println("String 코틀린에서의 타입 ${a1}")
    println("String 자바에서의 타입 $a2")

    val str1:String = "안녕하세요"
    val a3:KClass<out String> = str1::class
    val a4:Class<out String> = str1::class.java
    println("안녕하세요 코틀린에서의 타입 : $a3")
    println("안녕하세요 자바에서의 타입 : $a4")

    // 무슨 타입인지 잘 모를때 *로 설정
    val a5:KClass<*> = str1::class
    val a6:Class<*> = str1::class.java

    // 클래스 정보 분석
    val test = TestClassRe()
    println("추상 클래스 인가 : ${test::class.isAbstract}")
    println("정적 클래스 인가 : ${test::class.isCompanion}")
    println("Data 클래스 인가 : ${test::class.isData}")
    println("final 클래스 인가 : ${test::class.isFinal}")
    println("open 클래스 인가 : ${test::class.isOpen}")
    println("중첩 클래스 인가 : ${test::class.isInner}")
    println("Sealed 클래스 인가 : ${test::class.isSealed}")

    // 생성자 정보
    val constructors = test::class.constructors

    println(constructors)
    for (con in constructors) {
        println("constructor : $con")

        for (param in con.parameters) {
            print("parameter index : ${param.index}")
            print("parameter type : ${param.type}")
            print("parameter name : ${param.name}")
        }
    }

    // 주 생성자
    val primaryCon = test::class.primaryConstructor
    if (primaryCon != null) {
        println(primaryCon)

    }

    // 프로퍼티
    val properties = test::class.declaredMemberProperties
    for (prop in properties) {
        println(prop.name)
    }

    // 메서드 정보
    val methods = test::class.declaredMemberFunctions
    for (met in methods) {
        println(met.name)
    }

    // 프로그램 실행 중 클래스나 객체의 정보를 파악할 수 있는 개념을 리플렉스라고 한다.
}

class TestClassRe() {

    val number1:Int = 100
    val number2:Int = 200

    constructor(a1:Int) : this() {

    }

    constructor(a1:Int, a2:Int) : this() {

    }

    fun testMethod1() {

    }
}