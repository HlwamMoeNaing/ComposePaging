package com.example.composepaging.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.composepaging.utils.Constants

@Entity(tableName = Constants.UNSPLASH_IMAGE_TABLE)
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id:String,
    @Embedded
    val urls:Urls,
    val likes:Int,
    @Embedded
    val user:User
)