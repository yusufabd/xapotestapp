package com.yusufabd.data.tools

import android.util.Log

class LoggingTool {
    companion object {
        fun log(message: String?){
            Log.d("appLogTag", message)
        }
    }
}