package com.sksamuel.hoplite.json

import com.sksamuel.hoplite.ConfigLoader
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class SetDecoderTest : StringSpec({
  "set decoded from json" {
    data class Test(val a: Set<Long>, val b: Set<String>)

    val config = ConfigLoader().loadConfigOrThrow<Test>("/sets.json")
    config shouldBe Test(setOf(1, 2, 3), setOf("1", "2"))
  }
})
