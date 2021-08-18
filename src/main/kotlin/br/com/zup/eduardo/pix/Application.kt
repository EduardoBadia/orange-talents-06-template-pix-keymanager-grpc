package br.com.zup.eduardo.pix

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.zup.eduardo.pix")
		.start()
}

