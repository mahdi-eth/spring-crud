package com.java_react.com.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);

    List<Group> findAllByUserId(String id);
}