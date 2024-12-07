package com.onlinebookstore.book.repository;

import com.onlinebookstore.book.model.BookHistoryDetail;
import com.onlinebookstore.book.model.ShoppingHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookHistoryDetailsRepository extends JpaRepository<BookHistoryDetail, Long> {
}
