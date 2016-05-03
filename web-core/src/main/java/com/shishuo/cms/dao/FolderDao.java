package com.shishuo.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shishuo.cms.entity.Folder;

public interface FolderDao extends JpaRepository<Folder, Long> {

}
