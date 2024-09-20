package com.ssg.sb01.service;

import com.ssg.sb01.dto.BoardDTO;
import com.ssg.sb01.dto.PageRequestDTO;
import com.ssg.sb01.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);
    BoardDTO readOne(Long bno);
    void modify(BoardDTO boardDTO);

    void remove(Long bno);
    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}
