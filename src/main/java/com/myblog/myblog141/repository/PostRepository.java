package com.myblog.myblog141.repository;

import com.myblog.myblog141.controller.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
