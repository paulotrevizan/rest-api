package com.paulotrevizan.restapi.resources

import com.paulotrevizan.restapi.domains.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class MessageResource {

    val id: AtomicLong = AtomicLong()

    @GetMapping("/messages")
    fun getMessage(@RequestParam(value = "name", defaultValue = "Kotlin") name: String?): Message {
        return Message(id.incrementAndGet(), "Hello $name")
    }
    
}
