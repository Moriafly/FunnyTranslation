package com.funny.translation.translate.extentions

import java.security.MessageDigest

val String.md5: String
    get() {
        // 创建MessageDigest对象
        val digest = MessageDigest.getInstance("MD5")
        // 对明文进行加密
        val temp = digest.digest(this.toByteArray())
        // 准备StringBuilder用于保存结果
        val builder = StringBuilder()
        // 遍历字节数组, 一个字节转换为长度为2的字符串
        for (b in temp) {
            // 去除负数
            val s = Integer.toHexString(b.toInt() and (0xff))
            // 补零
            if (s.length == 1) {
                builder.append(0)
            }
            builder.append(s)
        }
        return builder.toString()
    }

val String.trimLineStart
    get() = this.splitToSequence("\n").map { it.trim() }.joinToString("\n")