package com.paulchibamba.deeply.data.repository

import com.paulchibamba.deeply.data.local.dao.WeeklyReviewDAO
import com.paulchibamba.deeply.model.WeeklyReview
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate
import javax.inject.Inject

class WeeklyReviewRepository @Inject constructor(private val weeklyReviewDAO: WeeklyReviewDAO) {

    val allWeeklyReviews: Flow<List<WeeklyReview>> = weeklyReviewDAO.getAllWeeklyReviews()

    fun getWeeklyReview(weekStartDate: LocalDate): Flow<WeeklyReview> {
        return weeklyReviewDAO.getWeeklyReview(weekStartDate)
    }

    fun getWeeklyReviewsInRange(startDate: LocalDate, endDate: LocalDate): Flow<List<WeeklyReview>> {
        return weeklyReviewDAO.getWeeklyReviewsInRange(startDate, endDate)
    }

    fun getPreviousWeeklyReview(): Flow<WeeklyReview?>{
        return weeklyReviewDAO.getPreviousWeeklyReview()
    }

    suspend fun addWeeklyReview(weeklyReview: WeeklyReview) {
        weeklyReviewDAO.addWeeklyReview(weeklyReview)
    }

    suspend fun updateWeeklyReview(weeklyReview: WeeklyReview) {
        weeklyReviewDAO.updateWeeklyReview(weeklyReview)
    }

    suspend fun deleteWeeklyReview(weeklyReview: WeeklyReview) {
        weeklyReviewDAO.deleteWeeklyReview(weeklyReview)
    }

    suspend fun deleteAllWeeklyReviews() {
        weeklyReviewDAO.deleteAllWeeklyReviews()
    }

}