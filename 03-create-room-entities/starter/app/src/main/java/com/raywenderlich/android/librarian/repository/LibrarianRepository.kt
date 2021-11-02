package com.raywenderlich.android.librarian.repository

import com.raywenderlich.android.librarian.model.Book
import com.raywenderlich.android.librarian.model.Genre
import com.raywenderlich.android.librarian.model.relations.BookAndGenre

interface LibrarianRepository {

    fun addBooks(book: Book)

    fun getBooks(): List<BookAndGenre>

    fun getGenres(): List<Genre>

    fun getGenreById(GenreId: String): Genre

}