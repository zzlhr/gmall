package com.lhrsite.gmall.config

import com.lhrsite.gmall.exception.ExceptionUtil
import com.lhrsite.gmall.exception.MallException
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.io.IOException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


/**
 * 全局异常捕获
 */
@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(MallException::class)
    @Throws(IOException::class)
    fun defaultErrorHandler(request: HttpServletRequest, response: HttpServletResponse, e: MallException) {
        log.warn(e.message)
        ExceptionUtil.defaultErrorHandler(request, response, e)
    }


    companion object {
        private val log = LoggerFactory.getLogger(GlobalExceptionHandler::class.java)
    }
}