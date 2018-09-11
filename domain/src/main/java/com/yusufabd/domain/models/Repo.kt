package com.yusufabd.domain.models

import java.io.Serializable

class Repo (
        val id: Int,
        val name: String,
        val description: String,
        val authorLogin: String,
        val authorAvatar: String,
        val homepage: String?,
        val language: String?,
        val stars: Int
): Serializable