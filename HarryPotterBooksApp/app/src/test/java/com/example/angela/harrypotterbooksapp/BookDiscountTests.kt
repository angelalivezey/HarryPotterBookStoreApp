package com.example.angela.harrypotterbooksapp

import org.junit.Assert
import org.junit.Test

class BookDiscountTests {
        //**************************** DISCOUNT CALCULATOR TESTS ****************************
//        @Test
//        //NO discount
//        fun oneBook() {
//            var input = discountCalculator(setOf(3))
//            Assert.assertEquals(8.00, input, 0.0)
//        }
//
//        @Test
//        //5% ($0.40) discount off $16 = 15.20
//        fun twoBooks() {
//            var input = discountCalculator(setOf(2, 1))
//            Assert.assertEquals(8 * 2 * 0.95, input, 0.0)
//        }
//
//        @Test
//        //10% ($2.40) discount off $24 = 21.60
//        fun threeBooks() {
//            var input = discountCalculator(setOf(2, 1, 3))
//            Assert.assertEquals(8 * 3 * 0.9, input, 0.0)
//        }
//
//        @Test
//        //20% ($6.40) discount off $32 = 25.60
//        fun fourBooks() {
//            var input = discountCalculator(setOf(2, 1, 4, 3))
//            Assert.assertEquals(8 * 4 * 0.8, input, 0.0)
//        }
//
//        @Test
//        //25% ($10) discount off $40 = 30
//        fun fiveBooks() {
//            var input = discountCalculator(setOf(2, 1, 5, 3, 4))
//            Assert.assertEquals(8 * 5 * 0.75, input, 0.0)
//        }
//
//        //**************************** BOOK DISCOUNT TESTS ****************************
//
//        @Test
//        fun test0(){
//            var input = bookDiscount(arrayOf(0))
//            Assert.assertEquals(8.0, input, 0.0)
//        }
//
//        @Test
//        fun test001() {
//            var input = bookDiscount(arrayOf(0,0,1))
//            Assert.assertEquals(8 + (8 * 2 * 0.95), input, 0.0)
//
//        }
//        @Test
//        fun test0011() {
//            var input = bookDiscount(arrayOf(0,0,1,1))
//            Assert.assertEquals( 2 * (8 * 2 * 0.95), input, 0.0)
//
//        }
//
//        @Test
//        fun test001223() {
//            var input = bookDiscount(arrayOf(0, 0, 1, 2, 2, 3))
//            Assert.assertEquals((8 * 4 * 0.8) + (8 * 2 * 0.95), input, 0.0)
//
//        }
//
//        @Test
//        fun test011234() {
//            var input = bookDiscount(arrayOf(0, 1, 1, 2, 3, 4))
//            Assert.assertEquals(8 + (8 * 5 * 0.75), input, 0.0)
//
//        }
//
//        //**************************** EDGE CASES ****************************
//        //NOT WORKING....Don't have a way to choose the best possible price
//        @Test
//        fun test00112234() {
//            var input = bookDiscount(arrayOf(0, 0, 1, 1, 2, 2, 3, 4))
//            Assert.assertEquals(2 * (8 * 4 * 0.8), input, 0.0)
//
//        }
//
//        @Test
//        fun testTonsOfBooks() {
//            var input = bookDiscount(arrayOf(0, 0, 0, 0, 0,
//                1, 1, 1, 1, 1,
//                2, 2, 2, 2,
//                3, 3, 3, 3, 3,
//                4, 4, 4, 4))
//            Assert.assertEquals(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8), input, 0.0)
//        }

}