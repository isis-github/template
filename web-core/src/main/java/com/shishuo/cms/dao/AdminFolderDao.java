package com.shishuo.cms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shishuo.cms.entity.AdminFolder;
import com.shishuo.cms.entity.vo.AdminFolderVo;

public interface AdminFolderDao extends JpaRepository<AdminFolder, Long> {

	
	int deleteAdminFolder(long adminId, long folderId);

	List<AdminFolderVo> getAdminFolderListById(long adminId);

	AdminFolderVo getAdminFolderById(long adminId, long folderId);

}
