package com.raywenderlich.android.librarian.repository

import com.raywenderlich.android.librarian.model.Book
import com.raywenderlich.android.librarian.model.Genre
import com.raywenderlich.android.librarian.model.ReadingList
import com.raywenderlich.android.librarian.model.Review
import com.raywenderlich.android.librarian.model.relations.BookAndGenre

interface LibrarianRepository {

    fun addBooks(book: Book)

    fun getBooks(): List<BookAndGenre>

    fun removeBook(book: Book)

    fun getGenres(): List<Genre>

    fun getGenreById(GenreId: String): Genre

    fun addGenres(genre: List<Genre>)

    fun addReview(review: Review)

    fun updateReview(review: Review)

    fun addReadingList(readingList: ReadingList)

}