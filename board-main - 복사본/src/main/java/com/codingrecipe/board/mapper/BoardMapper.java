package com.codingrecipe.board.mapper;

import com.codingrecipe.board.entity.BoardEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface BoardMapper {
    // XML에서 id="selectPagedData"인 쿼리 호출
    List<BoardEntity> selectPagedData(@Param("pageSize") int pageSize, @Param("offset") int offset);

    // XML에서 id="getTotalRecordCount"인 쿼리 호출
    int getTotalRecordCount();
}
