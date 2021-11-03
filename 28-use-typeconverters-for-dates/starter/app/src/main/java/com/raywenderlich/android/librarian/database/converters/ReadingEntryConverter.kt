package com.raywenderlich.android.librarian.database.converters

import androidx.room.TypeConverters
import com.google.gson.reflect.TypeToken
import com.raywenderlich.android.librarian.App
import com.raywenderlich.android.librarian.model.ReadingEntry

class ReadingEntryConverter {

    @TypeConverters
    fun fromEntries(list:List<ReadingEntry>):String = App.gson.toJson(list)

    @TypeConverters
    fun toEntries(json: String): List<ReadingEntry> {
        val listType = object : TypeToken<List<ReadingEntry>>() {}.type

        return try {
            App.gson.fromJson(json, listType)
        } catch (error: Throwable) {
           emptyList()
        }
    }
}