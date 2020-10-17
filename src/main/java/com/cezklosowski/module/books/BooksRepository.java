package com.cezklosowski.module.books;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BooksRepository extends JpaRepository<BooksEntity, Long>, JpaSpecificationExecutor<BooksEntity> {
}
