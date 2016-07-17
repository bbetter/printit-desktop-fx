package com.owl.printit.utils

import java.util.stream.Collectors
import java.util.stream.Stream

/**
 * Created by mac on 7/3/16.
 */


fun <T : Any> Stream<T>.toList(): List<T> = this.collect(Collectors.toList<T>())
