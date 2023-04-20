package com.newlecture.web.service;

import java.sql.*;
import java.util.*;

import com.newlecture.web.entity.*;

public interface NoticeService {
	List<Notice> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	int getCount() throws ClassNotFoundException, SQLException;
	int insert(Notice notice) throws SQLException, ClassNotFoundException;
	int update(Notice notice) throws SQLException, ClassNotFoundException;
	int delete(int id) throws ClassNotFoundException, SQLException;
}
