package com.raywenderlich.android.librarian.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.raywenderlich.android.librarian.model.Book

@Dao
interface BookDao {
    @Query("SELECT * FROM books")
    fun getBooks(): List<Book>

}